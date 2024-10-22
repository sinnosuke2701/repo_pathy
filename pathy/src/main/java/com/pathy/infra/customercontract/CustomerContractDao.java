package com.pathy.infra.customercontract;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface CustomerContractDao {
	
	public int selectOneCount(CustomerContractVo customerContractVo);
	
	List<CustomerContractDto> selectList(CustomerContractVo customerContractVo);
	
	public int insert(CustomerContractDto customerContractDto);
	
	public CustomerContractDto selectOne(CustomerContractDto customerContractDto);
		
	public int update(CustomerContractDto customerContractDto);
	
	public List<CustomerContractDto> selectListCodeGroup();
	
	public int uelete (CustomerContractDto customerContractDto);
	
	public int delete(CustomerContractDto customerContractDto);
	
    public List<CustomerContractDto> selectListCachedCodeArrayList();

	public List<CustomerContractDto> selectListInsProduct();

	public List<CustomerContractDto> selectListCustomer();
}
