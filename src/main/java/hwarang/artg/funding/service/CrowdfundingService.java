package hwarang.artg.funding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hwarang.artg.funding.model.CrowdfundingVO;
import hwarang.artg.mapper.CrowdfundingMapper;

/*
 * ���� : memberRegister
���� : memberModify
���� :memberRemove
��ü�ϳ����� : memberGetOne
��簳ü���� : memberGetAll
����¡ó���İ�ü���� : memberGetListByPaging
��й�ȣ Ȯ�� : memberCheckPw
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
	
	//�Խñ� ��� ��������
	public List<CrowdfundingVO> crowdfundingGetAll(){
		return dao.selectAllCrowdfunding();
	}
	
	//�󼼺���(��ȸ�� ����)
	public CrowdfundingVO getfundingIncreaseCount(int num) {
		CrowdfundingVO corwdfundingVO = null;
		if(dao.updateReadCount(num)>0) {
			corwdfundingVO = dao.selectCrowdfunding(num);
		}
			return corwdfundingVO;
	}
	
	//�Խù� ��ȸ
	public CrowdfundingVO getCrowdfunding(int num) {
		return dao.selectCrowdfunding(num);
	}
	
}
