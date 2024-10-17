package com.pathy.infra.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pathy.infra.customer.CustomerDao;
import com.pathy.infra.customer.CustomerDto;
import com.pathy.infra.customer.CustomerVo;

public class CustomerService {
	@Autowired
	private CustomerDao CustomerDao;
	
	public int selectOneCount(CustomerVo customerVo) {
		return CustomerDao.selectOneCount(customerVo);
	}
	
		List<CustomerDto> selectList(CustomerVo customerVo){
			
		return CustomerDao.selectList(customerVo);
		}
	
	public int insert(CustomerDto customerDto) {
		
		return CustomerDao.insert(customerDto);
	}
		
	public CustomerDto selectOne(CustomerDto customerDto){
		CustomerDto dto = CustomerDao.selectOne(customerDto);
		return dto;
	}
	
	public int update(CustomerDto customerDto) {
		 return CustomerDao.update(customerDto);
	 }
	
//	public List<CodeDto> selectListCodeGroup(){
//		List<CodeDto> codeGroups = CodeDao.selectListCodeGroup();
//		return codeGroups;
//	}
	
	public List<CustomerDto> selectListCustomer(){	
		return CustomerDao.selectListCustomer();
	}
	
	public int uelete (CustomerDto customerDto) {
		return CustomerDao.uelete(customerDto);
	}
	
	public int delete(CustomerDto customerDto) {
		return CustomerDao.delete(customerDto);
	}
	
//	@PostConstruct
//	public void selectListCachedCodeArrayList() throws Exception {
//		List<CodeDto> codeListFromDb = (ArrayList<CodeDto>) CodeDao.selectListCachedCodeArrayList();
////		codeListFromDb = (ArrayList<Code>) dao.selectListCachedCodeArrayList();
//		CodeDto.cachedCodeArrayList.clear(); 
//		CodeDto.cachedCodeArrayList.addAll(codeListFromDb);
//		System.out.println("cachedCodeArrayList: " + CodeDto.cachedCodeArrayList.size() + " chached !");
//	}
//	
//	public static void clear() throws Exception {
//		CodeDto.cachedCodeArrayList.clear();
//	}
//	
//	
//	public static List<CodeDto> selectListCachedCode(String ifcgSeq) throws Exception {
//		List<CodeDto> rt = new ArrayList<CodeDto>();
//		for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
//			if (codeRow.getCodeGroup_seq().equals(ifcgSeq)) {
//				rt.add(codeRow);
//			} else {
//				// by pass
//			}
//		}
//		return rt;
//	}
//
//	
//	public static String selectOneCachedCode(int code) throws Exception {
//		String rt = "";
//		for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
//			if (codeRow.getCdseq().equals(Integer.toString(code))) {
//				rt = codeRow.getCd_Name();
//			} else {
//				// by pass
//			}
//		}
//		return rt;
//	}
}
