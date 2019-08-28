package hwarang.artg.funding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hwarang.artg.funding.model.CorporationVO;
import hwarang.artg.mapper.CorporationMapper;

@Service
public class CorporationService {
	@Autowired
	private CorporationMapper dao;
	
	public boolean corporationRegister(CorporationVO corporationVO) {
		boolean result = false;
		if(dao.insertCorporation(corporationVO)>0) {
			result = true;
		}
		return result;
	}
	
	public boolean corporationModify(CorporationVO corporationVO) {
		if(dao.updateCorporation(corporationVO)>0) {
			return true;
		}
		return false;
	}
	
	public boolean corporationRemove(int num) {
		if(dao.deleteCorporation(num)>0) {
			return true;
		}
		return false;
	}
	
	public CorporationVO corporationGetOne(int num) {
		return dao.selectCorporation(num);
	}
	
	public List<CorporationVO> corporationGetAll(){
		return dao.selectAllCorporation();
	}
}
