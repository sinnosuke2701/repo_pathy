package com.pathy.infra.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;
import com.pathy.infra.code.CodeDto;
import com.pathy.infra.code.CodeService;
import com.pathy.infra.code.CodeVo;

public class CustomerController {
	@Autowired
	CustomerService CustomerService;

	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmList")
	public String codeXdmList(Model model ,@ModelAttribute("vo")  CustomerVo customerVo) {
		
//		codeVo.setSh_DateStart(codeVo.getSh_DateStart()+ " 00:00:00");
//		codeVo.setSh_DateEnd(codeVo.getSh_DateEnd()+ " 23:59:59");
		/* 초기값 세팅이 없는 경우 사용 */
		customerVo.setSh_DateStart(customerVo.getSh_DateStart() == null || customerVo.getSh_DateStart() == "" ? null : UtilDateTime.add00TimeString(customerVo.getSh_DateStart()));
		customerVo.setSh_DateEnd(customerVo.getSh_DateEnd() == null || customerVo.getSh_DateEnd() == "" ? null : UtilDateTime.add59TimeString(customerVo.getSh_DateEnd()));
		
		customerVo.setParamsPaging(CustomerService.selectOneCount(customerVo));
		
//		List<CodeDto> codes = CodeService.selectList(codeVo);
//		model.addAttribute("list1", codes);

		return "/xdm/v1/infra/code/codeXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmForm")
	public String codeXdmForm(Model model) {
		List<CustomerDto> customers = CustomerService.selectListCustomer();
		model.addAttribute("listCodeGroup", customers);
		return "/xdm/v1/infra/code/codeXdmForm";
	}

	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmInst")
	public String codeXdmInst(CustomerDto customerDto) {

		CustomerService.insert(customerDto);

		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmMfom")
	public String codeXdmMfom(CustomerDto codeDto, Model model) {
		model.addAttribute("item", CustomerService.selectOne(codeDto));
		List<CustomerDto> customers = CustomerService.selectListCustomer();
		model.addAttribute("listCustomer", customers);
		return "/xdm/v1/infra/code/codeXdmMfom";
	}

	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmPdt")
	public String codeXdmPdt(CustomerDto customerDto) {
		CustomerService.update(customerDto);
		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}
		
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmDele")
	public String codeXdmMfom(CustomerDto customerDto) {
		CustomerService.delete(customerDto);
		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmUele")
	public String codeXdmUele(CustomerDto customerDto) {
		CustomerService.uelete(customerDto);
		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}
}
