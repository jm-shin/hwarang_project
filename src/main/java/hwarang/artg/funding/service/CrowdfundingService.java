package hwarang.artg.funding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hwarang.artg.funding.model.CrowdfundingVO;
import hwarang.artg.mapper.CrowdfundingMapper;

/*
 * 삽입 : memberRegister
수정 : memberModify
삭제 :memberRemove
개체하나선택 : memberGetOne
모든개체선택 : memberGetAll
페이징처리후개체선택 : memberGetListByPaging
비밀번호 확인 : memberCheckPw
 * */

@Service
public class CrowdfundingService {
	@Autowired
	private CrowdfundingMapper dao;

	public boolean crowdfundingRegister(CrowdfundingVO crowdfundingVO) {
		boolean result = false;
		if (dao.insertCrowdfunding(crowdfundingVO) > 0) {
			result = true;
		}
		return result;
	}

	public boolean crowdfundingModify(CrowdfundingVO crowdfundingVO) {
		if (dao.updateCrowdfunding(crowdfundingVO) > 0) {
			return true;
		}
		return false;
	}
	
	public boolean crowdfundingRemove(int num) {
		if(dao.deleteCrowdfunding(num)>0) {
			return true;
		}
		return false;
	}
	
	public CrowdfundingVO crowdfundingGetOne(int num) {
		return dao.selectCrowdfunding(num);
	}
	
	//게시글 목록 가져오기
	public List<CrowdfundingVO> crowdfundingGetAll(){
		return dao.selectAllCrowdfunding();
	}
	
	//상세보기(조회수 증가)
	public CrowdfundingVO getfundingIncreaseCount(int num) {
		CrowdfundingVO corwdfundingVO = null;
		if(dao.updateReadCount(num)>0) {
			corwdfundingVO = dao.selectCrowdfunding(num);
		}
			return corwdfundingVO;
	}
	
	//게시물 조회
	public CrowdfundingVO getCrowdfunding(int num) {
		return dao.selectCrowdfunding(num);
	}
	
}
