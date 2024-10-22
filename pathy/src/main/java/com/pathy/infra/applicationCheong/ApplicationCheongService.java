package com.pathy.infra.applicationCheong;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationCheongService {
	
	@Autowired
	ApplicationCheongDao applicationCheongDao;
	
//	selectList
	public List<ApplicationCheongDto> selectList(ApplicationCheongVo applicationCheongVo) {
		return applicationCheongDao.selectList(applicationCheongVo);
	}
	
//	selectListInsProduct
	public List<ApplicationCheongDto> selectListInsProduct() {
		return applicationCheongDao.selectListInsProduct();
	}
	
//	selectListInsCustomer
	public List<ApplicationCheongDto> selectListInsCustomer() {
		return applicationCheongDao.selectListInsCustomer();
	}
	
//	selectListInsMember
	public List<ApplicationCheongDto> selectListInsMember() {
		return applicationCheongDao.selectListInsMember();
	}
	
//	insert
	public int insert(ApplicationCheongDto applicationCheongDto) {
		return applicationCheongDao.insert(applicationCheongDto);
	}
	
//	update - selectOne
	public ApplicationCheongDto selectOne(ApplicationCheongDto applicationCheongDto) {
		return applicationCheongDao.selectOne(applicationCheongDto);
	}
	
//	update - update
	public int update(ApplicationCheongDto applicationCheongDto) {
		return applicationCheongDao.update(applicationCheongDto);
	}
	
//	uelete
	public int uelete(ApplicationCheongDto applicationCheongDto) {
		return applicationCheongDao.uelete(applicationCheongDto);
	}
	
//	delete
	public int delete(ApplicationCheongDto applicationCheongDto) {
		return applicationCheongDao.delete(applicationCheongDto);
	}
	
//	paging
	public int selectOneCount(ApplicationCheongVo applicationCheongVo) {
		return applicationCheongDao.selectOneCount(applicationCheongVo);
	}
	
}
