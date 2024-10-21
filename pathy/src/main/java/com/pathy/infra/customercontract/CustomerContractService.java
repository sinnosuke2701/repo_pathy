package com.pathy.infra.customercontract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathy.infra.qna.QnaDao;
import com.pathy.infra.qna.QnaDto;
import com.pathy.infra.qna.QnaVo;
@Service
public class CustomerContractService {
	
	@Autowired
	private CustomerContractDao customerContractDao;
	
	public int selectOneCount(CustomerContractVo customerContractVo) {
		return customerContractDao.selectOneCount(customerContractVo);
	}
	
		List<CustomerContractDto> selectList(CustomerContractVo customerContractVo){
			
		return customerContractDao.selectList(customerContractVo);
		}
	
	public int insert(CustomerContractDto customerContractDto) {
		return customerContractDao.insert(customerContractDto);
	}
		
	public CustomerContractDto selectOne(CustomerContractDto customerContractDto){
		return customerContractDao.selectOne(customerContractDto);
	}
	
	public int update(CustomerContractDto customerContractDto) {
		 return customerContractDao.update(customerContractDto);
	 }
	
	public List<CustomerContractDto> selectListCustomer(){
		return customerContractDao.selectListCustomer();
	}
	
	public List<CustomerContractDto> selectListInsMember(){
		return customerContractDao.selectListInsMember();
	}
	
	public int uelete (CustomerContractDto customerContractDto) {
		return customerContractDao.uelete(customerContractDto);
	}
	
	public int delete(CustomerContractDto customerContractDto) {
		return customerContractDao.delete(customerContractDto);
	}
}
