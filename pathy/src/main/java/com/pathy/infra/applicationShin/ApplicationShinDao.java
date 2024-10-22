package com.pathy.infra.applicationShin;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationShinDao {
	
//	selectList
	List<ApplicationShinDto> selectList(ApplicationShinVo applicationShinVo);
	
//	paging
	public int selectOneCount(ApplicationShinVo applicationShinVo);

}
