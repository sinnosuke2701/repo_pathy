package com.pathy.infra.applicationShin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;
import com.pathy.infra.insContract.InsContractDto;

@Controller
public class ApplicationShinController {
	
	@Autowired
	ApplicationShinService applicationService;
	
	@RequestMapping(value="/v1/infra/applicationShin/applicationShinXdmList")
	public String applicationXdmList(@ModelAttribute("vo") ApplicationShinVo applicationShinVo, Model model) {
		
// 초기값 세팅이 없는 경우 사용
		applicationShinVo.setShDateStart(applicationShinVo.getShDateStart() == null || applicationShinVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(applicationShinVo.getShDateStart()));
		applicationShinVo.setShDateEnd(applicationShinVo.getShDateEnd() == null || applicationShinVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(applicationShinVo.getShDateEnd()));
		
//		paging
		applicationShinVo.setParamsPaging(applicationService.selectOneCount(applicationShinVo));
		if(applicationShinVo.getTotalRows() > 0) {
			model.addAttribute("list", applicationService.selectList(applicationShinVo));
		}
		return "/xdm/v1/infra/applicationShin/applicationShinXdmList";
	}
	
	@RequestMapping(value="/v1/infra/applicationShin/applicationShinXdmForm")
	public String applicationShinXdmForm(Model model, ApplicationShinDto applicationShinDto) {
		model.addAttribute("item", applicationService.selectOne(applicationShinDto));
		model.addAttribute("listInsProduct", applicationService.selectListInsProduct());
		model.addAttribute("listCustomer", applicationService.selectListInsCustomer());
		model.addAttribute("listInsMember", applicationService.selectListInsMember());
		return "/xdm/v1/infra/applicationShin/applicationShinXdmForm";
	}
	
	@RequestMapping(value="/v1/infra/applicationShin/applicationShinXdmInst")
	public String applicationShinXdmInst(ApplicationShinDto applicationShinDto) {
		applicationService.insert(applicationShinDto);
		return "redirect:/v1/infra/applicationShin/applicationShinXdmList";
	}
	
	@RequestMapping(value="/v1/infra/applicationShin/applicationShinXdmMForm")
	public String applicationShinXdmMForm(Model model, ApplicationShinDto applicationShinDto) {
		model.addAttribute("item", applicationService.selectOne(applicationShinDto));
		model.addAttribute("listInsProduct", applicationService.selectListInsProduct());
		model.addAttribute("listCustomer", applicationService.selectListInsCustomer());
		model.addAttribute("listInsMember", applicationService.selectListInsMember());
		return "/xdm/v1/infra/applicationShin/applicationShinXdmMForm";
	}
	
//	update - update
	@RequestMapping(value="/v1/infra/applicationShin/applicationShinXdmUpdt")
	public String applicationShinXdmUpdt(ApplicationShinDto applicationShinDto) {
		applicationService.update(applicationShinDto);
		System.out.println("update");
		return "redirect:/v1/infra/applicationShin/applicationShinXdmList";
	}
	
//	uelete
	@RequestMapping(value="/v1/infra/applicationShin/applicationShinXdmUel")
	public String applicationShinXdmUel(ApplicationShinDto applicationShinDto) {
		applicationService.uelete(applicationShinDto);
		return "redirect:/v1/infra/applicationShin/applicationShinXdmList";
	}
	
//	delete
	@RequestMapping(value="/v1/infra/applicationShin/applicationShinXdmDel")
	public String applicationShinXdmDel(ApplicationShinDto applicationShinDto) {
		applicationService.delete(applicationShinDto);
		return "redirect:/v1/infra/applicationShin/applicationShinXdmList";
	}
	

}
