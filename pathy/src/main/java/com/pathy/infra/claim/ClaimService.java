package com.pathy.infra.claim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClaimService {

	@Autowired
	ClaimDao claimDao;
	
	public int selectOneCount(ClaimVo claimVo) {
		return claimDao.selectOneCount(claimVo);
	}
	
		List<ClaimDto> selectList(ClaimVo claimVo){
			
		return claimDao.selectList(claimVo);
		}
	
	public int insert(ClaimDto claimDto) {
		
		return claimDao.insert(claimDto);
	}
	
	public List<ClaimDto> selectListInsMember() {
		return claimDao.selectListInsMember();
	}
	
	public List<ClaimDto> selectListCustomer() {
		return claimDao.selectListCustomer();
	}
	
	public List<ClaimDto> selectListClaimManage() {
		return claimDao.selectListClaimManage();
	}
		
	public ClaimDto selectOne(ClaimDto claimDto){
		ClaimDto dto = claimDao.selectOne(claimDto);
		return dto;
	}
	
	public int update(ClaimDto claimDto) {
		 return claimDao.update(claimDto);
	 }
	
	
	public int uelete (ClaimDto claimDto) {
		return claimDao.uelete(claimDto);
	}
	
	public int delete(ClaimDto claimDto) {
		return claimDao.delete(claimDto);
	}
	
}
