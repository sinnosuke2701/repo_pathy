package com.pathy.infra.insContract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;

@Controller
public class InsContractController {
	
	@Autowired
	InsContractService insContractService;
	
//	insContractXdmList
	@RequestMapping(value="/xdm/v1/infra/insContract/insContractXdmList")
	public String insContractXdmList(@ModelAttribute("vo") InsContractVo insContractVo, Model model) {
//		날짜 필드에 시간 추가
//		insContractVo.setShDateStart(insContractVo.getShDateStart()+" 00:00:00");			
//		insContractVo.setShDateEnd(insContractVo.getShDateEnd()+" 23:59:59");
		 
		// 초기값 세팅이 없는 경우 사용
		insContractVo.setShDateStart(insContractVo.getShDateStart() == null || insContractVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(insContractVo.getShDateStart()));
		insContractVo.setShDateEnd(insContractVo.getShDateEnd() == null || insContractVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(insContractVo.getShDateEnd()));
		
//		paging
		insContractVo.setParamsPaging(insContractService.selectOneCount(insContractVo));
		if(insContractVo.getTotalRows() > 0) {
			model.addAttribute("list", insContractService.selectList(insContractVo));
		}
		
//		model.addAttribute("list", insContractService.selectList(insContractVo));
		return "/xdm/v1/infra/insContract/insContractXdmList";
	}
	
//	insContractXdmForm
	@RequestMapping(value="/xdm/v1/infra/insContract/insContractXdmForm")
	public String insContractXdmForm(InsContractVo insContractVo, Model model) {
		model.addAttribute("listInsProduct", insContractService.selectListInsProduct());
		model.addAttribute("listCustomer", insContractService.selectListCustomer());
		return "/xdm/v1/infra/insContract/insContractXdmForm";
	}
	
//	insContractXdmInst
	@RequestMapping(value="/xdm/v1/infra/insContract/insContractXdmInst")
	public String insContractXdmInst(InsContractDto insContractDto) {
		insContractService.insert(insContractDto);
		return "redirect:/xdm/v1/infra/insContract/insContractXdmList";
	}
	
	
//	insContractXdmMForm
//	update - selectOne
	@RequestMapping(value="/xdm/v1/infra/insContract/insContractXdmMForm")
	public String insContractXdmMForm(InsContractDto insContractDto, Model model) {
		model.addAttribute("item", insContractService.selectOne(insContractDto));
		model.addAttribute("listInsProduct", insContractService.selectListInsProduct());
		model.addAttribute("listCustomer", insContractService.selectListCustomer());
		return "/xdm/v1/infra/insContract/insContractXdmMForm";
	}
	
//	update - update
	@RequestMapping(value="/xdm/v1/infra/insContract/insContractXdmUpdt")
	public String insContractXdmUpdt(InsContractDto insContractDto) {
		insContractService.update(insContractDto);
		System.out.println("update");
		return "redirect:/xdm/v1/infra/insContract/insContractXdmList";
	}
	
//	uelete
	@RequestMapping(value="/xdm/v1/infra/insContract/insContractXdmUel")
	public String insContractXdmUel(InsContractDto insContractDto) {
		insContractService.uelete(insContractDto);
		return "redirect:/xdm/v1/infra/insContract/insContractXdmList";
	}
	
//	delete
	@RequestMapping(value="/xdm/v1/infra/insContract/insContractXdmDel")
	public String insContractXdmDel(InsContractDto insContractDto) {
		insContractService.delete(insContractDto);
		return "redirect:/xdm/v1/infra/insContract/insContractXdmList";
	}

}
