package com.pathy.infra.claim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;

@Controller
public class ClaimController {

	@Autowired
	ClaimService claimService;
	
	@RequestMapping(value = "/xdm/v1/infra/claim/claimXdmList")
	public String claimXdmList(Model model ,@ModelAttribute("vo")  ClaimVo claimVo) {
		
//		codeVo.setSh_DateStart(codeVo.getSh_DateStart()+ " 00:00:00");
//		codeVo.setSh_DateEnd(codeVo.getSh_DateEnd()+ " 23:59:59");
		/* 초기값 세팅이 없는 경우 사용 */
		claimVo.setShDateStart(claimVo.getShDateStart() == null || claimVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(claimVo.getShDateStart()));
		claimVo.setShDateEnd(claimVo.getShDateEnd() == null || claimVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(claimVo.getShDateEnd()));
		
		claimVo.setParamsPaging(claimService.selectOneCount(claimVo));
		
		List<ClaimDto> customers = claimService.selectList(claimVo);
		model.addAttribute("list", customers);

		return "/xdm/v1/infra/claim/claimXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/claim/claimXdmForm")
	public String claimXdmForm(Model model) {
//		List<CustomerDto> customers = CustomerService.selectListCustomer();
//		model.addAttribute("listCodeGroup", customers);
		return "/xdm/v1/infra/claim/claimXdmForm";
	}

	@RequestMapping(value = "/xdm/v1/infra/claim/claimXdmInst")
	public String claimXdmInst(ClaimDto claimDto) {

		claimService.insert(claimDto);

		return "redirect:/xdm/v1/infra/claim/claimXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/claim/claimXdmMfom")
	public String claimXdmMfom(ClaimDto claimDto, Model model) {
		model.addAttribute("item", claimService.selectOne(claimDto));
		return "/xdm/v1/infra/claim/claimXdmMfom";
	}

	@RequestMapping(value = "/xdm/v1/infra/claim/claimXdmPdt")
	public String claimXdmPdt(ClaimDto claimDto) {
		claimService.update(claimDto);
		return "redirect:/xdm/v1/infra/claim/claimXdmList";
	}
		
	@RequestMapping(value = "/xdm/v1/infra/claim/claimXdmDele")
	public String claimXdmMfom(ClaimDto claimDto) {
		claimService.delete(claimDto);
		return "redirect:/xdm/v1/infra/claim/claimXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/claim/claimXdmUele")
	public String claimXdmUele(ClaimDto claimDto) {
		claimService.uelete(claimDto);
		return "redirect:/xdm/v1/infra/claim/claimXdmList";
	}
	
}
