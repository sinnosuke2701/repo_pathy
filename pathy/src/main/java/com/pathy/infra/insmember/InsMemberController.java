package com.pathy.infra.insmember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;

@Controller
public class InsMemberController {

	@Autowired
	InsMemberService insMemberService;
	
	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmList")
	public String insMemberXdmList(Model model ,@ModelAttribute("vo")  InsMemberVo insMemberVo) {
		
//		codeVo.setSh_DateStart(codeVo.getSh_DateStart()+ " 00:00:00");
//		codeVo.setSh_DateEnd(codeVo.getSh_DateEnd()+ " 23:59:59");
		/* 초기값 세팅이 없는 경우 사용 */
		insMemberVo.setShDateStart(insMemberVo.getShDateStart() == null || insMemberVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(insMemberVo.getShDateStart()));
		insMemberVo.setShDateEnd(insMemberVo.getShDateEnd() == null || insMemberVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(insMemberVo.getShDateEnd()));
		
		insMemberVo.setParamsPaging(insMemberService.selectOneCount(insMemberVo));
		
		List<InsMemberDto> customers = insMemberService.selectList(insMemberVo);
		model.addAttribute("list", customers);

		return "/xdm/v1/infra/insmember/insMemberXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmForm")
	public String insMemberXdmForm(Model model) {
//		List<CustomerDto> customers = CustomerService.selectListCustomer();
//		model.addAttribute("listCodeGroup", customers);
		return "/xdm/v1/infra/insmember/insMemberXdmForm";
	}

	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmInst")
	public String insMemberXdmInst(InsMemberDto insMemberDto) {

		insMemberService.insert(insMemberDto);

		return "redirect:/xdm/v1/infra/insmember/insMemberXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmMfom")
	public String insMemberXdmMfom(InsMemberDto insMemberDto, Model model) {
		model.addAttribute("item", insMemberService.selectOne(insMemberDto));
		return "/xdm/v1/infra/insmember/insMemberXdmMfom";
	}

	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmPdt")
	public String insMemberXdmPdt(InsMemberDto insMemberDto) {
		insMemberService.update(insMemberDto);
		return "redirect:/xdm/v1/infra/insmember/insMemberXdmList";
	}
		
	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmDele")
	public String insMemberXdmMfom(InsMemberDto insMemberDto) {
		insMemberService.delete(insMemberDto);
		return "redirect:/xdm/v1/infra/insmember/insMemberXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmUele")
	public String insMemberXdmUele(InsMemberDto insMemberDto) {
		insMemberService.uelete(insMemberDto);
		return "redirect:/xdm/v1/infra/insmember/insMemberXdmList";
	}
	
	
	
}
