package com.pathy.infra.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;

@Controller
public class CustomerController {
	@Autowired
	CustomerService CustomerService;

	@RequestMapping(value = "/xdm/v1/infra/customer/customerXdmList")
	public String customerXdmList(Model model ,@ModelAttribute("vo")  CustomerVo customerVo) {
//		codeVo.setSh_DateStart(codeVo.getSh_DateStart()+ " 00:00:00");
//		codeVo.setSh_DateEnd(codeVo.getSh_DateEnd()+ " 23:59:59");
		/* 초기값 세팅이 없는 경우 사용 */
		customerVo.setShDateStart(customerVo.getShDateStart() == null || customerVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(customerVo.getShDateStart()));
		customerVo.setShDateEnd(customerVo.getShDateEnd() == null || customerVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(customerVo.getShDateEnd()));
		
		customerVo.setParamsPaging(CustomerService.selectOneCount(customerVo));
		
		List<CustomerDto> customers = CustomerService.selectList(customerVo);
		model.addAttribute("list", customers);

		return "/xdm/v1/infra/customer/customerXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/customer/customerXdmForm")
	public String customerXdmForm(Model model) {
//		List<CustomerDto> customers = CustomerService.selectListCustomer();
//		model.addAttribute("listCodeGroup", customers);
		return "/xdm/v1/infra/customer/customerXdmForm";
	}

	@RequestMapping(value = "/xdm/v1/infra/customer/customerXdmInst")
	public String customerXdmInst(CustomerDto customerDto) {

		CustomerService.insert(customerDto);

		return "redirect:/xdm/v1/infra/customer/customerXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/customer/customerXdmMfom")
	public String customerXdmMfom(CustomerDto codeDto, Model model) {
		model.addAttribute("item", CustomerService.selectOne(codeDto));
//		List<CustomerDto> customers = CustomerService.selectListCustomer();
//		model.addAttribute("listCustomer", customers);
		return "/xdm/v1/infra/customer/customerXdmMfom";
	}

	@RequestMapping(value = "/xdm/v1/infra/customer/customerXdmPdt")
	public String customerXdmPdt(CustomerDto customerDto) {
		CustomerService.update(customerDto);
		return "redirect:/xdm/v1/infra/customer/customerXdmList";
	}
		
	@RequestMapping(value = "/xdm/v1/infra/customer/customerXdmDele")
	public String customerXdmMfom(CustomerDto customerDto) {
		CustomerService.delete(customerDto);
		return "redirect:/xdm/v1/infra/customer/customerXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/customer/customerXdmUele")
	public String customerXdmUele(CustomerDto customerDto) {
		CustomerService.uelete(customerDto);
		return "redirect:/xdm/v1/infra/customer/customerXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/index/indexXdmView")
	public String indexXdmView(CustomerDto customerDto) {
		CustomerService.uelete(customerDto);
		return "redirect:/xdm/v1/infra/index/indexXdmView";
	}
	
}
