package com.pathy.infra.codegroup;



import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupDao {
	
	// 추상메서드
	// select
	public List<CodeGroupDto> selectList(CodeGroupVo codeGroupVo);
	
	//insert
	//int인 이유 : 데이터가 몇 건이 처리됐는지 확인하기 위해서
	public int insert(CodeGroupDto codeGroupDto);
	
	// update - selectOne
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto);
	
	//update - update
	//int인 이유 : 데이터가 몇 건이 처리됐는지 확인하기 위해서
	public int update(CodeGroupDto codeGroupDto);
	
	//uelete
	public int uelete(CodeGroupDto codeGroupDto);
	
	//delete
	public int delete(CodeGroupDto codeGroupDto);
	
	// paging
	public int selectOneCount(CodeGroupVo codeGroupVo);

	
	// for cache
	public List<CodeGroupDto> selectListCachedCodeGroupArrayList();
	

}
