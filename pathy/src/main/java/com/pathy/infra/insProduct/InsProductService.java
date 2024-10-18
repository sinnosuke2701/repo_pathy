package com.pathy.infra.insProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsProductService {
	
	@Autowired
	InsProductDao insProductDao;
	
//	selectList
	public List<InsProductDto> selectList(InsProductVo insProductVo) {
		return insProductDao.selectList(insProductVo);
	}
	
//	insert
	public int insert(InsProductDto insProductDto) {
		return insProductDao.insert(insProductDto);
	}
	
//	insertUsr
	public int insertUsr(InsProductDto insProductDto) {
		return insProductDao.insert(insProductDto);
	}
	 
//	update - selectOne
	public InsProductDto selectOne(InsProductDto insProductDto) {
		return insProductDao.selectOne(insProductDto);
	}
	
//	update - update
	public int update(InsProductDto insProductDto) {
		return insProductDao.update(insProductDto);
	}
	
//	uelete
	public int uelete(InsProductDto insProductDto) {
		return insProductDao.uelete(insProductDto);
	}
	
//	delete
	public int delete(InsProductDto insProductDto) {
		return insProductDao.delete(insProductDto);
	}
	
//	paging
	public int selectOneCount(InsProductVo insProductVo) {
		return insProductDao.selectOneCount(insProductVo);
	}
	
//	selectOneLogin
	public InsProductDto selectOneLogin(InsProductDto insProductDto) {
		return insProductDao.selectOneLogin(insProductDto);
	}
	
}
