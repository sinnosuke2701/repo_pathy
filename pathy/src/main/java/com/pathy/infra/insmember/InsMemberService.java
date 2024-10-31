package com.pathy.infra.insmember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InsMemberService {

	@Autowired
	InsMemberDao insMemberDao;
	
	public int selectOneCount(InsMemberVo insMemberVo) {
		return insMemberDao.selectOneCount(insMemberVo);
	}
	
		List<InsMemberDto> selectList(InsMemberVo insMemberVo){
			
		return insMemberDao.selectList(insMemberVo);
		}
	
	public int insert(InsMemberDto insMemberDto) {
		
		return insMemberDao.insert(insMemberDto);
	}
		
	public InsMemberDto selectOne(InsMemberDto insMemberDto){
		InsMemberDto dto = insMemberDao.selectOne(insMemberDto);
		return dto;
	}
	
	
	public int update(InsMemberDto insMemberDto) {
		 return insMemberDao.update(insMemberDto);
	 }
	
	
	public int uelete (InsMemberDto insMemberDto) {
		return insMemberDao.uelete(insMemberDto);
	}
	
	public int delete(InsMemberDto insMemberDto) {
		return insMemberDao.delete(insMemberDto);
	}
	
	public InsMemberDto selectOneId(InsMemberDto insMemberDto) {
		return insMemberDao.selectOneId(insMemberDto);
	}
	
	public InsMemberDto selectOneLogin(InsMemberDto memberDto) {
		return insMemberDao.selectOneLogin(memberDto);
	}
	
}
