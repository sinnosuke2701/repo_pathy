package com.pathy.infra.claimmanage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;

@Controller
public class ClaimManageController {

	@Autowired
	ClaimManageService claimManageService;
	
	@RequestMapping(value = "/xdm/v1/infra/claimmanage/claimManageXdmList")
	public String insMemberXdmList(Model model ,@ModelAttribute("vo")  ClaimManageVo claimManageVo) {
		
//		codeVo.setSh_DateStart(codeVo.getSh_DateStart()+ " 00:00:00");
//		codeVo.setSh_DateEnd(codeVo.getSh_DateEnd()+ " 23:59:59");
		/* 초기값 세팅이 없는 경우 사용 */
		claimManageVo.setShDateStart(claimManageVo.getShDateStart() == null || claimManageVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(claimManageVo.getShDateStart()));
		claimManageVo.setShDateEnd(claimManageVo.getShDateEnd() == null || claimManageVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(claimManageVo.getShDateEnd()));
		
		claimManageVo.setParamsPaging(claimManageService.selectOneCount(claimManageVo));
		
		List<ClaimManageDto> customers = claimManageService.selectList(claimManageVo);
		model.addAttribute("list", customers);

		return "/xdm/v1/infra/claimmanage/claimManageXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/claimmanage/claimManageXdmForm")
	public String insMemberXdmForm(Model model) {
//		List<CustomerDto> customers = CustomerService.selectListCustomer();
//		model.addAttribute("listCodeGroup", customers);
		model.addAttribute("listInsMember", claimManageService.selectListInsMember());
		return "/xdm/v1/infra/claimmanage/claimManageXdmForm";
	}

	@RequestMapping(value = "/xdm/v1/infra/claimmanage/claimManageXdmInst")
	public String insMemberXdmInst(ClaimManageDto claimManageDto) {

		claimManageService.insert(claimManageDto);

		return "redirect:/xdm/v1/infra/claimmanage/claimManageXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/claimmanage/claimManageXdmMfom")
	public String insMemberXdmMfom(ClaimManageDto claimManageDto, Model model) {
		model.addAttribute("item", claimManageService.selectOne(claimManageDto));
		return "/xdm/v1/infra/insmember/insMemberXdmMfom";
	}

	@RequestMapping(value = "/xdm/v1/infra/claimmanage/claimManageXdmPdt")
	public String insMemberXdmPdt(ClaimManageDto claimManageDto) {
		claimManageService.update(claimManageDto);
		return "redirect:/xdm/v1/infra/claimmanage/claimManageXdmList";
	}
		
	@RequestMapping(value = "/xdm/v1/infra/claimmanage/claimManageXdmDele")
	public String insMemberXdmMfom(ClaimManageDto claimManageDto) {
		claimManageService.delete(claimManageDto);
		return "redirect:/xdm/v1/infra/claimmanage/claimManageXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/claimmanage/claimManageXdmUele")
	public String insMemberXdmUele(ClaimManageDto claimManageDto) {
		claimManageService.uelete(claimManageDto);
		return "redirect:/xdm/v1/infra/claimmanage/claimManageXdmList";
	}
	
}
