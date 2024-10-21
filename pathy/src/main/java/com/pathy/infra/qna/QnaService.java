package com.pathy.infra.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class QnaService {
	
	@Autowired
	private QnaDao qnaDao;
	
	public int selectOneCount(QnaVo qnaVo) {
		return qnaDao.selectOneCount(qnaVo);
	}
	
		List<QnaDto> selectList(QnaVo qnaVo){
			
		return qnaDao.selectList(qnaVo);
		}
	
	public int insert(QnaDto qnaDto) {
		
		return qnaDao.insert(qnaDto);
	}
		
	public QnaDto selectOne(QnaDto qnaDto){
		return qnaDao.selectOne(qnaDto);
	}
	
	public int update(QnaDto qnaDto) {
		 return qnaDao.update(qnaDto);
	 }
	
	public List<QnaDto> selectListCustomer(){
		return qnaDao.selectListCustomer();
	}
	
	public List<QnaDto> selectListInsMember(){
		return qnaDao.selectListInsMember();
	}
	
	public int uelete (QnaDto qnaDto) {
		return qnaDao.uelete(qnaDto);
	}
	
	public int delete(QnaDto qnaDto) {
		return qnaDao.delete(qnaDto);
	}
	
}
