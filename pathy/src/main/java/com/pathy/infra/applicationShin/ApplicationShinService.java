package com.pathy.infra.applicationShin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationShinService {
	
	@Autowired
	ApplicationShinDao applicationShinDao;
	
//	selectList
	public List<ApplicationShinDto> selectList(ApplicationShinVo applicationShinVo) {
		return applicationShinDao.selectList(applicationShinVo);
	}
	
//	paging
	public int selectOneCount(ApplicationShinVo applicationShinVo) {
		return applicationShinDao.selectOneCount(applicationShinVo);
	}

}
