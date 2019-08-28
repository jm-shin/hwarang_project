package hwarang.artg.funding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hwarang.artg.funding.model.CorporationVO;
import hwarang.artg.funding.service.CorporationService;

@Controller
@RequestMapping("/corporation")
public class CorporationController {
	@Autowired
	private CorporationService corporationService;

	@RequestMapping("/corporationList")
	public String showCorporationList(Model model) {
		List<CorporationVO> corList = corporationService.corporationGetAll();
		model.addAttribute("corporationList", corList);
		return "corporationList";
	}

	@RequestMapping(value = "/corporationWriteForm", method = RequestMethod.GET)
	public String showWriteForm(CorporationVO corporationVO, Model model) {
		return "corporationWriteForm";
	}

	@RequestMapping(value = "/corporationRegister", method = RequestMethod.POST)
	public String corporationRegister(CorporationVO corporationVO, Model model) {
		boolean result = corporationService.corporationRegister(corporationVO);
		String url = "corporationList";
		String msg = "";
		if (result) {
			msg = "등록되었습니다.";
		} else {
			msg = "등록에 실패하였습니다.";
		}
		model.addAttribute("url", url);
		model.addAttribute("msg", msg);
		return "result";
	}

}
