package com.pathy.infra.insmember;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface InsMemberDao {

	public int selectOneCount(InsMemberVo insMemberVo);
	
	List<InsMemberDto> selectList(InsMemberVo insMemberVo);
	
	public int insert(InsMemberDto insMemberDto);
	
	public InsMemberDto selectOne(InsMemberDto insMemberDto);
		
	public int update(InsMemberDto insMemberDto);
	
	public List<InsMemberDto> selectListCodeGroup();
	
	public int uelete (InsMemberDto insMemberDto);
	
	public int delete(InsMemberDto insMemberDto);
	
    public List<InsMemberDto> selectListCachedCodeArrayList();
	
}
