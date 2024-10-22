package com.pathy.infra.applicationCheong;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationCheongDao {
	
//	selectList
	List<ApplicationCheongDto> selectList(ApplicationCheongVo applicationCheongVo);
	
//	selectListInsProduct
	List<ApplicationCheongDto> selectListInsProduct();
	
//	selectListInsCustomer
	List<ApplicationCheongDto> selectListInsCustomer();
	
//	selectListInsMember
	List<ApplicationCheongDto> selectListInsMember();
	
//	insert
	public int insert(ApplicationCheongDto applicationCheongDto);
	
//	update - selectOne
	public ApplicationCheongDto selectOne(ApplicationCheongDto applicationCheongDto);

//	update - update
	public int update(ApplicationCheongDto applicationCheongDto);

//	uelete
	public int uelete(ApplicationCheongDto applicationCheongDto);

//	delete
	public int delete(ApplicationCheongDto applicationCheongDto);
	
//	paging
	public int selectOneCount(ApplicationCheongVo applicationCheongVo);

}
