package com.pathy.infra.claimmanage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathy.infra.insmember.InsMemberDto;
import com.pathy.infra.insmember.InsMemberVo;

@Service
public class ClaimManageService {

	@Autowired
	ClaimManageDao claimManageDao;
	
	public int selectOneCount(ClaimManageVo claimManageVo) {
		return claimManageDao.selectOneCount(claimManageVo);
	}
	
		List<ClaimManageDto> selectList(ClaimManageVo claimManageVo){
			
		return claimManageDao.selectList(claimManageVo);
		}
	
	public int insert(ClaimManageDto claimManageDto) {
		
		return claimManageDao.insert(claimManageDto);
	}
		
	public ClaimManageDto selectOne(ClaimManageDto claimManageDto){
		ClaimManageDto dto = claimManageDao.selectOne(claimManageDto);
		return dto;
	}
	
	public int update(ClaimManageDto claimManageDto) {
		 return claimManageDao.update(claimManageDto);
	 }
	
	
	public int uelete (ClaimManageDto claimManageDto) {
		return claimManageDao.uelete(claimManageDto);
	}
	
	public int delete(ClaimManageDto claimManageDto) {
		return claimManageDao.delete(claimManageDto);
	}
	
}
