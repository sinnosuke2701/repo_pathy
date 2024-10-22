package com.pathy.infra.insContract;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface InsContractDao {
	
//	selectList
	List<InsContractDto> selectList(InsContractVo insContractVo);
	
//	selectListInsProduct
	List<InsContractDto> selectListInsProduct();
	
//	selectListCustomer
	List<InsContractDto> selectListCustomer();

//	insert
	public int insert(InsContractDto insContractDto);

//	update - selectOne
	public InsContractDto selectOne(InsContractDto insContractDto);

//	update - update
	public int update(InsContractDto insContractDto);

//	uelete
	public int uelete(InsContractDto insContractDto);

//	delete
	public int delete(InsContractDto insContractDto);

//	paging
	public int selectOneCount(InsContractVo insContractVo);

}
