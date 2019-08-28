package hwarang.artg.mapper;

import java.util.List;

import hwarang.artg.funding.model.CrowdfundingVO;

public interface CrowdfundingMapper {
	public int insertCrowdfunding(CrowdfundingVO crowdfundingVO);
	public int updateCrowdfunding(CrowdfundingVO crowdfundingVO);
	public int deleteCrowdfunding(int num);
	public CrowdfundingVO selectCrowdfunding(int num);
	public List<CrowdfundingVO> selectAllCrowdfunding();
	public int updateReadCount(int num);
}
