package com.pathy.infra.code;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class CodeService {
	
	@Autowired
	 private CodeDao codeDao;
	
	//selectList
	public List<CodeDto> selectList(CodeVo codeVo){
		return codeDao.selectList(codeVo);
			
	}
	
	
	//selectListCode
	//code - codegroup 연결
	public List<CodeDto> selectListCodeGroup(){
//		List<CodeDto> codeGroups = codeDao.selectListCodeGroup();
		return codeDao.selectListCodeGroup();
	}
	
	//insert
	public int insert(CodeDto codeDto) {
		return codeDao.insert(codeDto);
	}
	
	//selectOne
	public CodeDto selectOne(CodeDto codeDto) {
		return codeDao.selectOne(codeDto);
	}
	
	//update
	public int update(CodeDto codedto) {
		return codeDao.update(codedto);
	}
	
	//uelete
	public int uelete(CodeDto codeDto) {
		return codeDao.uelete(codeDto);
	}
	
	//delete
	public int delete(CodeDto codeDto) {
		return codeDao.delete(codeDto);
	}
	
	// paging
	public int selectOneCount(CodeVo codeVo) {
		return codeDao.selectOneCount(codeVo);
	}
	
	// for cache
		@PostConstruct
		public void selectListCachedCodeArrayList() {
			System.out.println("selectListCachedCodeArrayList 함수 실행");
			List<CodeDto> codeListFromDb = (ArrayList<CodeDto>) codeDao.selectListCachedCodeArrayList();
			CodeDto.cachedCodeArrayList.clear();
			CodeDto.cachedCodeArrayList.addAll(codeListFromDb);
			System.out.println("cachedCodeArrayList: " + CodeDto.cachedCodeArrayList.size() + "chached!!");
		}

		public static void clear() {
			CodeDto.cachedCodeArrayList.clear();
		}
		
		// codeGroup의 seq 번호를 받고 해당하는 code의 내용을 List로 출력
		public static List<CodeDto> selectListCachedCode(String codeGroup_cgSeq){
			List<CodeDto> rt = new ArrayList<CodeDto>();
			for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
				if (codeRow.getCodeGroup_cgSeq().equals(codeGroup_cgSeq)) {
					rt.add(codeRow);
				} else {
					// by pass
				}
			}
			return rt;
		}
	
		// code의 정보를 받아서 문자열로 반환
		public static String selectOneCachedCode(int code){
			System.out.println("code: " + code);
			String rt = "";
			for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
				if (codeRow.getCdSeq().equals(Integer.toString(code))) {
					rt = codeRow.getCdName();
				} else {
					// by pass
				}
			}
			return rt;
		}



	
}
