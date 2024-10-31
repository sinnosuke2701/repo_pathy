package com.pathy.infra.insmember;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pathy.common.constants.Constants;
import com.pathy.common.util.UtilDateTime;

import jakarta.servlet.http.HttpSession;

@Controller
public class InsMemberController {

	@Autowired
	InsMemberService insMemberService;
	
	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmList")
	public String insMemberXdmList(Model model ,@ModelAttribute("vo")  InsMemberVo insMemberVo) {
		
//		codeVo.setSh_DateStart(codeVo.getSh_DateStart()+ " 00:00:00");
//		codeVo.setSh_DateEnd(codeVo.getSh_DateEnd()+ " 23:59:59");
		/* 초기값 세팅이 없는 경우 사용 */
		insMemberVo.setShDateStart(insMemberVo.getShDateStart() == null || insMemberVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(insMemberVo.getShDateStart()));
		insMemberVo.setShDateEnd(insMemberVo.getShDateEnd() == null || insMemberVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(insMemberVo.getShDateEnd()));
		
		insMemberVo.setParamsPaging(insMemberService.selectOneCount(insMemberVo));
		
		List<InsMemberDto> customers = insMemberService.selectList(insMemberVo);
		model.addAttribute("list", customers);

		return "/xdm/v1/infra/insmember/insMemberXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmForm")
	public String insMemberXdmForm(Model model) {
//		List<CustomerDto> customers = CustomerService.selectListCustomer();
		return "/xdm/v1/infra/insmember/insMemberXdmForm";
	}

	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmInst")
	public String insMemberXdmInst(InsMemberDto insMemberDto) {
		insMemberService.insert(insMemberDto);
		return "redirect:/xdm/v1/infra/insmember/insMemberXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmMfom")
	public String insMemberXdmMfom(InsMemberDto insMemberDto, Model model) {
		model.addAttribute("item", insMemberService.selectOne(insMemberDto));
		return "/xdm/v1/infra/insmember/insMemberXdmMfom";
	}

	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmPdt")
	public String insMemberXdmPdt(InsMemberDto insMemberDto) {
		insMemberService.update(insMemberDto);
		return "redirect:/xdm/v1/infra/insmember/insMemberXdmList";
	}
		
	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmDele")
	public String insMemberXdmMfom(InsMemberDto insMemberDto) {
		insMemberService.delete(insMemberDto);
		return "redirect:/xdm/v1/infra/insmember/insMemberXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/insmember/insMemberXdmUele")
	public String insMemberXdmUele(InsMemberDto insMemberDto) {
		insMemberService.uelete(insMemberDto);
		return "redirect:/xdm/v1/infra/insmember/insMemberXdmList";
	}
	
//	@RequestMapping(value = "/xdm/v1/infra/index/indexXdmView")
//	public String indexXdmView(InsMemberDto InsMemberDto) {
//		return "/xdm/v1/infra/index/indexXdmView";
//	}
	
	@RequestMapping(value = "/xdm/v1/infra/index/signinXdmView")
	public String signinXdmView(InsMemberDto InsMemberDto) {
		return "/xdm/v1/infra/index/signinXdmView";
	}
	
	@ResponseBody
	@RequestMapping(value = "/xdm/v1/infra/member/signinXdmProc")
	public Map<String, Object> signinXdmProc(InsMemberDto insMemberDto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		InsMemberDto rtMember = insMemberService.selectOneId(insMemberDto);
		if (rtMember != null) {
			InsMemberDto rtMember2 = insMemberService.selectOneLogin(insMemberDto);
				if (rtMember2 != null) { //rtMember2가 null이 아니면
					httpSession.setMaxInactiveInterval(60 * Constants.SESSION_MINUTE_XDM); // 60second * 30 = 30minute
					httpSession.setAttribute("sessSeqXdm", rtMember2.getInsmSeq());
					httpSession.setAttribute("sessIdXdm", rtMember2.getInsmId());
					httpSession.setAttribute("sessNameXdm", rtMember2.getInsmName());
					returnMap.put("rt", "success");
					} 
				} else {
					returnMap.put("rt", "fail");
				}
				System.out.println("sessSeqXdm: " + httpSession.getAttribute("sessSeqXdm"));
				System.out.println("sessIdXdm: " + httpSession.getAttribute("sessIdXdm"));
				System.out.println("sessNameXdm: " + httpSession.getAttribute("sessNameXdm"));
			return returnMap;
	
	}

	@ResponseBody
	@RequestMapping(value = "/signoutXdmProc")
	public Map<String, Object> signoutXdmProc(HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		httpSession.invalidate();
		returnMap.put("rt", "success");
		return returnMap;
	}
}