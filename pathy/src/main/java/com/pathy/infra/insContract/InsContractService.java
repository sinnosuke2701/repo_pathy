package com.pathy.infra.insContract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsContractService {
	
	@Autowired
	InsContractDao insContractDao;
	
//	selectList
	public List<InsContractDto> selectList(InsContractVo insContractVo) {
		return insContractDao.selectList(insContractVo);
	}
	
//	selectListInsProduct
	public List<InsContractDto> selectListInsProduct() {
		return insContractDao.selectListInsProduct();
	}
	
//	selectListCustomer
	public List<InsContractDto> selectListCustomer() {
		return insContractDao.selectListCustomer();
	}
	
//	insert
	public int insert(InsContractDto insContractDto) {
		return insContractDao.insert(insContractDto);
	}
	
//	update - selectOne
	public InsContractDto selectOne(InsContractDto insContractDto) {
		return insContractDao.selectOne(insContractDto);
	}
	
//	update - update
	public int update(InsContractDto insContractDto) {
		return insContractDao.update(insContractDto);
	}
	
//	uelete
	public int uelete(InsContractDto insContractDto) {
		return insContractDao.uelete(insContractDto);
	}
	
//	delete
	public int delete(InsContractDto insContractDto) {
		return insContractDao.delete(insContractDto);
	}
	
//	paging
	public int selectOneCount(InsContractVo insContractVo) {
		return insContractDao.selectOneCount(insContractVo);
	}
	

}
