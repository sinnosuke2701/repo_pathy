package com.pathy.infra.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value="/v1/infra/index/indexXdmView")
	public String indexXdmView() {
		return "/xdm/v1/infra/index/indexXdmView";
	}

}
