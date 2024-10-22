package com.pathy.infra.claim;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface ClaimDao {

	public int selectOneCount(ClaimVo claimVo);
	
	List<ClaimDto> selectList(ClaimVo claimVo);
	
	public int insert(ClaimDto claimeDto);
	
	public ClaimDto selectOne(ClaimDto claimeDto);
		
	public int update(ClaimDto claimeDto);
	
	public List<ClaimDto> selectListInsMember();
	
	public int uelete (ClaimDto claimeDto);
	
	public int delete(ClaimDto claimeDto);
	
    public List<ClaimDto> selectListCachedCodeArrayList();
	
}
