package com.pathy.infra.insProduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsProducrController {
	
	@Autowired
	InsProductService insProductService;
	
	@RequestMapping(value="/v1/infra/insProduct/insProductXdmList")
	public String insProductXdmList() {
		return "/xdm/v1/infra/insProduct/insProductXdmList";
	}

}
