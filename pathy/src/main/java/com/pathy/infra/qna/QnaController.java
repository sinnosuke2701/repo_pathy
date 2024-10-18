package com.pathy.infra.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pathy.common.util.UtilDateTime;
import com.pathy.infra.customer.CustomerDto;
import com.pathy.infra.customer.CustomerService;
import com.pathy.infra.customer.CustomerVo;
@Controller
public class QnaController {
	
	@Autowired
	QnaService qnaService;

	@RequestMapping(value = "/xdm/v1/infra/qna/qnaXdmList")
	public String qnaXdmList(Model model ,@ModelAttribute("vo")  QnaVo qnaVo) {
		/* 초기값 세팅이 없는 경우 사용 */
		qnaVo.setShDateStart(qnaVo.getShDateStart() == null || qnaVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaVo.getShDateStart()));
		qnaVo.setShDateEnd(qnaVo.getShDateEnd() == null || qnaVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaVo.getShDateEnd()));
		
		qnaVo.setParamsPaging(qnaService.selectOneCount(qnaVo));
		
		List<QnaDto> qnas = qnaService.selectList(qnaVo);
		model.addAttribute("list", qnas);
		return "/xdm/v1/infra/qna/qnaXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/qna/qnaXdmForm")
	public String qnaXdmForm(Model model) {
//		List<CustomerDto> customers = CustomerService.selectListCustomer();
//		model.addAttribute("listCodeGroup", customers);
		return "/xdm/v1/infra/qna/qnaXdmForm";
	}

	@RequestMapping(value = "/xdm/v1/infra/customer/qnaXdmInst")
	public String qnaXdmInst(QnaDto qnaDto) {
		qnaService.insert(qnaDto);
		return "redirect:/xdm/v1/infra/customer/qnaXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/customer/qnaXdmMfom")
	public String qnaXdmMfom(QnaDto qnaDto, Model model) {
		model.addAttribute("item", qnaService.selectOne(qnaDto));
		return "/xdm/v1/infra/customer/qnaXdmMfom";
	}

	@RequestMapping(value = "/xdm/v1/infra/qna/qnaXdmPdt")
	public String qnaXdmPdt(QnaDto qnaDto) {
		qnaService.update(qnaDto);
		return "redirect:/xdm/v1/infra/qna/qnaXdmList";
	}
		
	@RequestMapping(value = "/xdm/v1/infra/qna/qnaXdmDele")
	public String qnaXdmMfom(QnaDto qnaDto) {
		qnaService.delete(qnaDto);
		return "redirect:/xdm/v1/infra/qna/qnaXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/qna/qnaXdmUele")
	public String qnaXdmUele(QnaDto qnaDto) {
		qnaService.uelete(qnaDto);
		return "redirect:/xdm/v1/infra/qna/customerXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/index/qnaXdmView")
	public String indexXdmView(QnaDto qnaDto) {
		qnaService.uelete(qnaDto);
		return "redirect:/xdm/v1/infra/index/indexXdmView";
	}
	
}
