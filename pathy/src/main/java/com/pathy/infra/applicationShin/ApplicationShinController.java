package com.pathy.infra.applicationShin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationShinController {
	
	@Autowired
	ApplicationShinService applicationService;
	
	@RequestMapping(value="/v1/infra/applicationShin/applicationShinXdmList")
	public String applicationXdmList(@ModelAttribute("vo") ApplicationShinVo applicationShinVo, Model model) {
//		paging
		applicationShinVo.setParamsPaging(applicationService.selectOneCount(applicationShinVo));
		if(applicationShinVo.getTotalRows() > 0) {
			model.addAttribute("list", applicationService.selectList(applicationShinVo));
		}
		return "/xdm/v1/infra/applicationShin/applicationShinXdmList";
	}

}
