package com.pathy.infra.insProduct;

import org.springframework.stereotype.Repository;

@Repository
public interface InsProductDao {
<<<<<<< HEAD
	
 
//	selectList
	List<InsProductDto> selectList(InsProductVo insProductVo);

//	insert
	public int insert(InsProductDto insProductDto);

//	insertUsr
	public int insertUsr(InsProductDto insProductDto);

//	update - selectOne
	public InsProductDto selectOne(InsProductDto insProductDto);

//	update - update
	public int update(InsProductDto insProductDto);

//	uelete
	public int uelete(InsProductDto insProductDto);

//	delete
	public int delete(InsProductDto insProductDto);

//	paging
	public int selectOneCount(InsProductVo insProductVo);

//	selectOneLogin
	public InsProductDto selectOneLogin(InsProductDto insProductDto);

//	selectOneId
	public InsProductDto selectOneId(InsProductDto insProductDto);
=======
>>>>>>> branch 'main' of https://github.com/sinnosuke2701/repo_pathy.git

}
