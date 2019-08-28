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
	
	//����Ʈ �����ֱ�
	@RequestMapping("/crowdfundingList")
	public String showCrowdfundingList(Model model) {
		List<CrowdfundingVO> cList = crowdfundingService.crowdfundingGetAll();
		model.addAttribute("crowdfundingList", cList);
		return "crowdfundingList";
		
	}
	
	//�Խñ� �ۼ������� �����ֱ�
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
	        msg="��ϵǾ����ϴ�.";
	    }else {
	        msg="��Ͻ����߽��ϴ�.";
	    }
	    model.addAttribute("url",url);
	    model.addAttribute("msg",msg);
	    return "result";
	}
	
	//�ݵ� ��ȸ��
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
	
	//����ȭ�� ��û 
	@RequestMapping(value = "/modify",method = RequestMethod.GET)
	public String showModifyForm(int num, Model model) {
		CrowdfundingVO crowdfundingVO = crowdfundingService.getCrowdfunding(num);
		return "crowdfundingModify";
	}
	//������û
	@RequestMapping(value = "/modify",method = RequestMethod.POST)
	public String crowdfundingModify(CrowdfundingVO crowdfundingVO, Model model) {
		System.out.println("modify crowdfunding"+crowdfundingVO);
		String url="view?num="+crowdfundingVO.getNum();
		String msg = "��������";
		if(crowdfundingService.crowdfundingModify(crowdfundingVO)) {
			msg = "���������� �����Ǿ����ϴ�.";
		}
			model.addAttribute("url",url);
			model.addAttribute("msg",msg);
			return "result";
	}
	
}
