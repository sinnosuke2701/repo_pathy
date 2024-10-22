package com.pathy.infra.applicationShin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathy.infra.insContract.InsContractDto;
import com.pathy.infra.insContract.InsContractVo;

@Service
public class ApplicationShinService {
	
	@Autowired
	ApplicationShinDao applicationShinDao;
	
//	selectList
	public List<ApplicationShinDto> selectList(ApplicationShinVo applicationShinVo) {
		return applicationShinDao.selectList(applicationShinVo);
	}
	
//	selectListInsProduct
	public List<ApplicationShinDto> selectListInsProduct() {
		return applicationShinDao.selectListInsProduct();
	}
	
//	selectListInsCustomer
	public List<ApplicationShinDto> selectListInsCustomer() {
		return applicationShinDao.selectListInsCustomer();
	}
	
//	selectListInsMember
	public List<ApplicationShinDto> selectListInsMember() {
		return applicationShinDao.selectListInsMember();
	}
	
//	insert
	public int insert(ApplicationShinDto applicationShinDto) {
		return applicationShinDao.insert(applicationShinDto);
	}
	
//	update - selectOne
	public ApplicationShinDto selectOne(ApplicationShinDto applicationShinDto) {
		return applicationShinDao.selectOne(applicationShinDto);
	}
	
//	update - update
	public int update(ApplicationShinDto applicationShinDto) {
		return applicationShinDao.update(applicationShinDto);
	}
	
//	uelete
	public int uelete(ApplicationShinDto applicationShinDto) {
		return applicationShinDao.uelete(applicationShinDto);
	}
	
//	delete
	public int delete(ApplicationShinDto applicationShinDto) {
		return applicationShinDao.delete(applicationShinDto);
	}
	
//	paging
	public int selectOneCount(ApplicationShinVo applicationShinVo) {
		return applicationShinDao.selectOneCount(applicationShinVo);
	}

}
