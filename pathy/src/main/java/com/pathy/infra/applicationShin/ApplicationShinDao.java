package com.pathy.infra.applicationShin;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationShinDao {
	
//	selectList
	List<ApplicationShinDto> selectList(ApplicationShinVo applicationShinVo);
	
//	selectListInsProduct
	List<ApplicationShinDto> selectListInsProduct();
	
//	selectListInsCustomer
	List<ApplicationShinDto> selectListInsCustomer();
	
//	selectListInsMember
	List<ApplicationShinDto> selectListInsMember();
	
//	insert
	public int insert(ApplicationShinDto applicationShinDto);
	
//	update - selectOne
	public ApplicationShinDto selectOne(ApplicationShinDto applicationShinDto);

//	update - update
	public int update(ApplicationShinDto applicationShinDto);

//	uelete
	public int uelete(ApplicationShinDto applicationShinDto);

//	delete
	public int delete(ApplicationShinDto applicationShinDto);
	
//	paging
	public int selectOneCount(ApplicationShinVo applicationShinVo);

}
