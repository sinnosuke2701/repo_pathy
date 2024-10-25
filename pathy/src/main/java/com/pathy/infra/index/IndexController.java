package com.pathy.infra.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@Autowired
	IndexService indexService;
	
	@RequestMapping(value="/v1/infra/index/indexXdmView")
	public String indexXdmView(Model model) {
		model.addAttribute("countInsMember", indexService.selectOneCountInsMember());
		model.addAttribute("countCustomer", indexService.selectOneCountCustomer());
		model.addAttribute("countInsProduct", indexService.selectOneCountInsProduct());
		model.addAttribute("countInsContract", indexService.selectOneCountInsContract());
		model.addAttribute("countCustomerContract", indexService.selectOneCountCustomerContract());
		model.addAttribute("countApplicationShin", indexService.selectOneCountApplicationShin());
		model.addAttribute("countApplicationCheong", indexService.selectOneCountApplicationCheong());
		model.addAttribute("countClaim", indexService.selectOneCountClaim());
		model.addAttribute("countClaimManage", indexService.selectOneCountClaimManage());
		model.addAttribute("countQna", indexService.selectOneCountQna());
		return "/xdm/v1/infra/index/indexXdmView";
	}

}
