package com.pathy.infra.customer;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface CustomerDao {
		
	public int selectOneCount(CustomerVo customerVo);
		
	List<CustomerDto> selectList(CustomerVo customerVo);
		
	public int insert(CustomerDto customerDto);
		
	public CustomerDto selectOne(CustomerDto customerDto);
			
	public int update(CustomerDto customerDto);
		
	public List<CustomerDto> selectListCodeGroup();
		
	public int uelete (CustomerDto customerDto);
		
	public int delete(CustomerDto customerDto);
		
    public List<CustomerDto> selectListCachedCodeArrayList();
	
}
