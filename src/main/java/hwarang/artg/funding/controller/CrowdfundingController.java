package hwarang.artg.funding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hwarang.artg.funding.model.CrowdfundingVO;
import hwarang.artg.funding.service.CrowdfundingService;
import hwarang.artg.mapper.CrowdfundingMapper;

@Controller
@RequestMapping("/crowdfunding")
public class CrowdfundingController {

	@Autowired
	CrowdfundingService crowdfundingService;
	
	//리스트 보여주기
	@RequestMapping("/crowdfundingList")
	public String showCrowdfundingList(Model model) {
		List<CrowdfundingVO> cList = crowdfundingService.crowdfundingGetAll();
		model.addAttribute("crowdfundingList", cList);
		return "crowdfundingList";
		
	}
	
	//게시글 작성페이지 보여주기
	@RequestMapping(value="/crowdfundingWriteForm",method=RequestMethod.GET)
	public String showWriteForm(CrowdfundingVO crowdfundingVO, Model model) {
		return "crowdfundingWriteForm";
	}
	
	@RequestMapping(value="/crowdfundingRegister",method=RequestMethod.POST)
	public String crowdfundingRegister(CrowdfundingVO crowdfundingVO, Model model) {
		boolean result = crowdfundingService.crowdfundingRegister(crowdfundingVO);
		String url = "crowdfundingList";
		String msg = "";
	    if(result) {
	        msg="등록되었습니다.";
	    }else {
	        msg="등록실패했습니다.";
	    }
	    model.addAttribute("url",url);
	    model.addAttribute("msg",msg);
	    return "result";
	}
	
	//펀딩 조회수
	@RequestMapping(value = "/view",method = RequestMethod.GET)
	public String showCrowdfundingView(int num,Model model) {
		model.addAttribute("crowdfundingVO",crowdfundingService.getfundingIncreaseCount(num));
		
		return "crowdfundingView";
	}
	@RequestMapping("crowdfundingRemove")
	public String crowdfundingRemove(int num, Model model) {
		model.addAttribute("crowdfundingVO",crowdfundingService.crowdfundingRemove(num));
		return "crowdfundingList";
	}
	
	@RequestMapping(value = "/checkPass",method = RequestMethod.GET)
	public String showCheckPassForm() {
		return "checkPass";
	}
	
	//수정화면 요청 
	@RequestMapping(value = "/modify",method = RequestMethod.GET)
	public String showModifyForm(int num, Model model) {
		CrowdfundingVO crowdfundingVO = crowdfundingService.getCrowdfunding(num);
		return "crowdfundingModify";
	}
	//수정요청
	@RequestMapping(value = "/modify",method = RequestMethod.POST)
	public String crowdfundingModify(CrowdfundingVO crowdfundingVO, Model model) {
		System.out.println("modify crowdfunding"+crowdfundingVO);
		String url="view?num="+crowdfundingVO.getNum();
		String msg = "수정실패";
		if(crowdfundingService.crowdfundingModify(crowdfundingVO)) {
			msg = "정상적으로 수정되었습니다.";
		}
			model.addAttribute("url",url);
			model.addAttribute("msg",msg);
			return "result";
	}
	
}
