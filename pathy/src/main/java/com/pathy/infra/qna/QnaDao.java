package com.pathy.infra.qna;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pathy.infra.customer.CustomerDto;
import com.pathy.infra.customer.CustomerVo;
@Repository
public interface QnaDao {
	
	public int selectOneCount(QnaVo qnaVo);
	
	List<QnaDto> selectList(QnaVo qnaVo);
	
	public int insert(QnaDto qnaDto);
	
	public QnaDto selectOne(QnaDto qnaDto);
		
	public int update(QnaDto qnaDto);
	
	public List<QnaDto> selectListCodeGroup();
	
	public int uelete (QnaDto qnaDto);
	
	public int delete(QnaDto qnaDto);
	
    public List<QnaDto> selectListCachedCodeArrayList();
	
}
