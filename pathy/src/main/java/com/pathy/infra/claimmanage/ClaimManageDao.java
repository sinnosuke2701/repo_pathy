package com.pathy.infra.claimmanage;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface ClaimManageDao {

	public int selectOneCount(ClaimManageVo claimManageVo);
	
	List<ClaimManageDto> selectList(ClaimManageVo claimManageVo);
	
	public int insert(ClaimManageDto claimManageDto);
	
	public ClaimManageDto selectOne(ClaimManageDto claimManageDto);
		
	public int update(ClaimManageDto claimManageDto);
	
	public List<ClaimManageDto> selectListInsMember();
	
	public List<ClaimManageDto> selectListCustomer();
	
	public int uelete (ClaimManageDto claimManageDto);
	
	public int delete(ClaimManageDto claimManageDto);
	
    public List<ClaimManageDto> selectListCachedCodeArrayList();
	
}
