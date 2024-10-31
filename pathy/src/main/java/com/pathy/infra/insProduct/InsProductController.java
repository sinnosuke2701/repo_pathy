package com.pathy.infra.insProduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;

@Controller
public class InsProductController {
	
	@Autowired
	InsProductService insProductService;
	
//	insProductXdmList
	@RequestMapping(value="/xdm/v1/infra/insProduct/insProductXdmList")
	public String insProductXdmList(@ModelAttribute("vo") InsProductVo insProductVo, Model model) {
//		날짜 필드에 시간 추가
//		insProductVo.setShDateStart(insProductVo.getShDateStart()+" 00:00:00");			
//		insProductVo.setShDateEnd(insProductVo.getShDateEnd()+" 23:59:59");
		 
		// 초기값 세팅이 없는 경우 사용
		insProductVo.setShDateStart(insProductVo.getShDateStart() == null || insProductVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(insProductVo.getShDateStart()));
		insProductVo.setShDateEnd(insProductVo.getShDateEnd() == null || insProductVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(insProductVo.getShDateEnd()));
		
//		paging
		insProductVo.setParamsPaging(insProductService.selectOneCount(insProductVo));
		if(insProductVo.getTotalRows() > 0) {
			model.addAttribute("list", insProductService.selectList(insProductVo));
		}
		
//		model.addAttribute("list", insProductService.selectList(insProductVo));
		return "/xdm/v1/infra/insProduct/insProductXdmList";
	}
	
//	insProductXdmForm
	@RequestMapping(value="/xdm/v1/infra/insProduct/insProductXdmForm")
	public String insProductXdmForm() {
		return "/xdm/v1/infra/insProduct/insProductXdmForm";
	}
	
//	insProductXdmInst
	@RequestMapping(value="/xdm/v1/infra/insProduct/insProductXdmInst")
	public String insProductXdmInst(InsProductDto insProductDto) {
		insProductService.insert(insProductDto);
		return "redirect:/xdm/v1/infra/insProduct/insProductXdmList";
	}
	
	
//	insProductXdmMForm
//	update - selectOne
	@RequestMapping(value="/xdm/v1/infra/insProduct/insProductXdmMForm")
	public String insProductXdmMForm(InsProductDto insProductDto, Model model) {
		model.addAttribute("item", insProductService.selectOne(insProductDto));
		return "/xdm/v1/infra/insProduct/insProductXdmMForm";
	}
	
//	update - update
	@RequestMapping(value="/xdm/v1/infra/insProduct/insProductXdmUpdt")
	public String insProductXdmUpdt(InsProductDto insProductDto) {
		insProductService.update(insProductDto);
		System.out.println("update");
		return "redirect:/xdm/v1/infra/insProduct/insProductXdmList";
	}
	
//	uelete
	@RequestMapping(value="/xdm/v1/infra/insProduct/insProductXdmUel")
	public String insProductXdmUel(InsProductDto insProductDto) {
		insProductService.uelete(insProductDto);
		return "redirect:/xdm/v1/infra/insProduct/insProductXdmList";
	}
	
//	delete
	@RequestMapping(value="/xdm/v1/infra/insProduct/insProductXdmDel")
	public String insProductXdmDel(InsProductDto insProductDto) {
		insProductService.delete(insProductDto);
		return "redirect:/xdm/v1/infra/insProduct/insProductXdmList";
	}
	
}
