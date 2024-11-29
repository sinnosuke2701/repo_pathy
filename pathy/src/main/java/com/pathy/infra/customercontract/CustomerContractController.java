package com.pathy.infra.customercontract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;
import com.pathy.infra.qna.QnaDto;

@Controller
public class CustomerContractController {
	@Autowired
	CustomerContractService customerContractService;

		@RequestMapping(value = "/xdm/v1/infra/customercontract/customercontractXdmList")
		public String customercontractXdmList(Model model ,@ModelAttribute("vo")  CustomerContractVo customerContractVo) {
			/* 초기값 세팅이 없는 경우 사용 */
			customerContractVo.setShDateStart(customerContractVo.getShDateStart() == null || customerContractVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(customerContractVo.getShDateStart()));
			customerContractVo.setShDateEnd(customerContractVo.getShDateEnd() == null || customerContractVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(customerContractVo.getShDateEnd()));
			
			customerContractVo.setParamsPaging(customerContractService.selectOneCount(customerContractVo));
			
			List<CustomerContractDto> customercontracts = customerContractService.selectList(customerContractVo);
			model.addAttribute("list", customercontracts);

			return "xdm/v1/infra/customercontract/customercontractXdmList";
		}

		@RequestMapping(value = "/xdm/v1/infra/customercontract/customercontractXdmForm")
		public String customercontractXdmForm(Model model) {
//			List<CustomerDto> customers = CustomerService.selectListCustomer();
//			model.addAttribute("listCodeGroup", customers);
			 
			List<CustomerContractDto> insproducts = customerContractService.selectListInsProduct();
			model.addAttribute("listInsProduct", insproducts);
			
			List<CustomerContractDto> customers = customerContractService.selectListCustomer();
			model.addAttribute("listCustomer", customers);
			return "xdm/v1/infra/customercontract/customercontractXdmForm";
		}

		@RequestMapping(value = "/xdm/v1/infra/customercontract/customercontractXdmInst")
		public String customercontractXdmInst(CustomerContractDto customerContractDto) {
			customerContractService.insert(customerContractDto);
			return "redirect:/xdm/v1/infra/customercontract/customercontractXdmList";
		}

		@RequestMapping(value = "/xdm/v1/infra/customercontract/customercontractXdmMfom")
		public String customercontractXdmMfom(CustomerContractDto customerContractDto, Model model) {
			model.addAttribute("item", customerContractService.selectOne(customerContractDto));
			
			List<CustomerContractDto> insproducts = customerContractService.selectListInsProduct();
			model.addAttribute("listInsProduct", insproducts);
			
			List<CustomerContractDto> customers = customerContractService.selectListCustomer();
			model.addAttribute("listCustomer", customers);
			
			return "xdm/v1/infra/customercontract/customercontractXdmMfom";
		}

		@RequestMapping(value = "/xdm/v1/infra/customercontract/customercontractXdmPdt")
		public String customercontractXdmPdt(CustomerContractDto customerContractDto) {
			customerContractService.update(customerContractDto);
			return "redirect:/xdm/v1/infra/customercontract/customercontractXdmList";
		}
			
		@RequestMapping(value = "/xdm/v1/infra/customercontract/customercontractXdmDele")
		public String customercontractXdmMfom(CustomerContractDto customerContractDto) {
			customerContractService.delete(customerContractDto);
			return "redirect:/xdm/v1/infra/customercontract/customercontractXdmList";
		}

		@RequestMapping(value = "/xdm/v1/infra/customercontract/customercontractXdmUele")
		public String customercontractXdmUele(CustomerContractDto customerContractDto) {
			customerContractService.uelete(customerContractDto);
			return "redirect:/xdm/v1/infra/customercontract/customercontractXdmList";
		}
		
//		@RequestMapping(value = "/xdm/v1/infra/index/indexXdmView")
//		public String indexXdmView(CustomerContractDto customerContractDto) {
//			customerContractService.uelete(customerContractDto);
//			return "redirect:/xdm/v1/infra/index/indexXdmView";
//		}
}
