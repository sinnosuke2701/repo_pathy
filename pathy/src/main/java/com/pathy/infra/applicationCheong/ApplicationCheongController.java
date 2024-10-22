package com.pathy.infra.applicationCheong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;

@Controller
public class ApplicationCheongController {
	
	@Autowired
	ApplicationCheongService applicationCheongService;
	
	@RequestMapping(value="/v1/infra/applicationCheong/applicationCheongXdmList")
	public String applicationXdmList(@ModelAttribute("vo") ApplicationCheongVo applicationCheongVo, Model model) {
		
// 초기값 세팅이 없는 경우 사용
		applicationCheongVo.setShDateStart(applicationCheongVo.getShDateStart() == null || applicationCheongVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(applicationCheongVo.getShDateStart()));
		applicationCheongVo.setShDateEnd(applicationCheongVo.getShDateEnd() == null || applicationCheongVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(applicationCheongVo.getShDateEnd()));
		
//		paging
		applicationCheongVo.setParamsPaging(applicationCheongService.selectOneCount(applicationCheongVo));
		if(applicationCheongVo.getTotalRows() > 0) {
			model.addAttribute("list", applicationCheongService.selectList(applicationCheongVo));
		}
		return "/xdm/v1/infra/applicationCheong/applicationCheongXdmList";
	}
	
	@RequestMapping(value="/v1/infra/applicationCheong/applicationCheongXdmForm")
	public String applicationCheongXdmForm(Model model, ApplicationCheongDto applicationCheongDto) {
		model.addAttribute("item", applicationCheongService.selectOne(applicationCheongDto));
		model.addAttribute("listInsProduct", applicationCheongService.selectListInsProduct());
		model.addAttribute("listCustomer", applicationCheongService.selectListInsCustomer());
		model.addAttribute("listInsMember", applicationCheongService.selectListInsMember());
		return "/xdm/v1/infra/applicationCheong/applicationCheongXdmForm";
	}
	
	@RequestMapping(value="/v1/infra/applicationCheong/applicationCheongXdmInst")
	public String applicationCheongXdmInst(ApplicationCheongDto applicationCheongDto) {
		applicationCheongService.insert(applicationCheongDto);
		return "redirect:/v1/infra/applicationCheong/applicationCheongXdmList";
	}
	
	@RequestMapping(value="/v1/infra/applicationCheong/applicationCheongXdmMForm")
	public String applicationCheongXdmMForm(Model model, ApplicationCheongDto applicationCheongDto) {
		model.addAttribute("item", applicationCheongService.selectOne(applicationCheongDto));
		model.addAttribute("listInsProduct", applicationCheongService.selectListInsProduct());
		model.addAttribute("listCustomer", applicationCheongService.selectListInsCustomer());
		model.addAttribute("listInsMember", applicationCheongService.selectListInsMember());
		return "/xdm/v1/infra/applicationCheong/applicationCheongXdmMForm";
	}
	
//	update - update
	@RequestMapping(value="/v1/infra/applicationCheong/applicationCheongXdmUpdt")
	public String applicationCheongXdmUpdt(ApplicationCheongDto applicationCheongDto) {
		applicationCheongService.update(applicationCheongDto);
		System.out.println("update");
		return "redirect:/v1/infra/applicationCheong/applicationCheongXdmList";
	}
	
//	uelete
	@RequestMapping(value="/v1/infra/applicationCheong/applicationCheongXdmUel")
	public String applicationCheongXdmUel(ApplicationCheongDto applicationCheongDto) {
		applicationCheongService.uelete(applicationCheongDto);
		return "redirect:/v1/infra/applicationCheong/applicationCheongXdmList";
	}
	
//	delete
	@RequestMapping(value="/v1/infra/applicationCheong/applicationCheongXdmDel")
	public String applicationCheongXdmDel(ApplicationCheongDto applicationCheongDto) {
		applicationCheongService.delete(applicationCheongDto);
		return "redirect:/v1/infra/applicationCheong/applicationCheongXdmList";
	}

}
