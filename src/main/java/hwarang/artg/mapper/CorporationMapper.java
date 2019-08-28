package hwarang.artg.mapper;

import java.util.List;

import hwarang.artg.funding.model.CorporationVO;
import hwarang.artg.funding.model.CrowdfundingVO;

public interface CorporationMapper {
	public int insertCorporation(CorporationVO corporationVO);
	public int updateCorporation(CorporationVO corporationVO);
	public int deleteCorporation(int num);
	public CorporationVO selectCorporation(int num);
	public List<CorporationVO> selectAllCorporation();
}
