package com.pathy.infra.customercontract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;
import com.pathy.infra.insmember.InsMemberDto;
import com.pathy.infra.insmember.InsMemberService;
import com.pathy.infra.insmember.InsMemberVo;

public class CustomerContractController {
	@Autowired
	CustomerContractService customerContractService;
	
	@RequestMapping(value = "/xdm/v1/infra/customercontract/customerContractXdmList")
	public String customerContractXdmList(Model model ,@ModelAttribute("vo")  CustomerContractVo customerContractVo) {
		
//		codeVo.setSh_DateStart(codeVo.getSh_DateStart()+ " 00:00:00");
//		codeVo.setSh_DateEnd(codeVo.getSh_DateEnd()+ " 23:59:59");
		/* 초기값 세팅이 없는 경우 사용 */
		customerContractVo.setShDateStart(customerContractVo.getShDateStart() == null || customerContractVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(customerContractVo.getShDateStart()));
		customerContractVo.setShDateEnd(customerContractVo.getShDateEnd() == null || customerContractVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(customerContractVo.getShDateEnd()));
		
		customerContractVo.setParamsPaging(customerContractService.selectOneCount(customerContractVo));
		
		List<CustomerContractDto> customers = customerContractService.selectList(customerContractVo);
		model.addAttribute("list", customers);

		return "/xdm/v1/infra/customercontract/customerContractXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/customercontract/customerContractXdmForm")
	public String customerContractXdmForm(Model model) {
//		List<CustomerDto> customers = CustomerService.selectListCustomer();
//		model.addAttribute("listCodeGroup", customers);
		return "/xdm/v1/infra/customercontract/customerContractXdmForm";
	}

	@RequestMapping(value = "/xdm/v1/infra/customercontract/customerContractXdmInst")
	public String customerContractXdmInst(CustomerContractDto customerContractDto) {
		customerContractService.insert(customerContractDto);
		return "redirect:/xdm/v1/infra/customercontract/customerContractXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/customercontract/customerContractXdmMfom")
	public String customerContractXdmMfom(CustomerContractDto customerContractDto, Model model) {
		model.addAttribute("item", customerContractService.selectOne(customerContractDto));
		return "/xdm/v1/infra/insmember/customerContractXdmMfom";
	}

	@RequestMapping(value = "/xdm/v1/infra/customercontract/customerContractXdmPdt")
	public String customerContractXdmPdt(CustomerContractDto customerContractDto) {
		customerContractService.update(customerContractDto);
		return "redirect:/xdm/v1/infra/customercontract/customerContractXdmList";
	}
		
	@RequestMapping(value = "/xdm/v1/infra/customercontract/customerContractXdmDele")
	public String customerContractXdmMfom(CustomerContractDto customerContractDto) {
		customerContractService.delete(customerContractDto);
		return "redirect:/xdm/v1/infra/customercontract/customerContractXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/customercontract/insMemberXdmUele")
	public String customerContractXdmUele(CustomerContractDto customerContractDto) {
		customerContractService.uelete(customerContractDto);
		return "redirect:/xdm/v1/infra/customercontract/insMemberXdmList";
	}
}
