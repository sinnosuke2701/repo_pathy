package com.pathy.infra.code;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class CodeDto {
	
	private String cdSeq;
	private String cdName;
	private Integer cdUseNy;
	private Integer cdOrder;
	private String cdDesc;
	private Integer cdDelNy;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date cdDateTimeReg;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date cdDateTimeEdit;
	private String codeGroup_cgSeq;
	//codegroup에서 가져올 데이터 추가 &getter/setter 다시 하기

	private String cgSeq;
	private String cgName;
	
	//count추가
	private Integer xcdSeqCount;
	
	//for cache
	public static List<CodeDto> cachedCodeArrayList = new ArrayList<CodeDto>();
	
	
	
	//------getter / setter --------

	public String getCdSeq() {
		return cdSeq;
	}

	public String getCdName() {
		return cdName;
	}

	public Integer getCdUseNy() {
		return cdUseNy;
	}

	public Integer getCdOrder() {
		return cdOrder;
	}

	public String getCdDesc() {
		return cdDesc;
	}

	public Integer getCdDelNy() {
		return cdDelNy;
	}

	public Date getCdDateTimeReg() {
		return cdDateTimeReg;
	}

	public Date getCdDateTimeEdit() {
		return cdDateTimeEdit;
	}

	public String getCodeGroup_cgSeq() {
		return codeGroup_cgSeq;
	}

	public String getCgSeq() {
		return cgSeq;
	}

	public String getCgName() {
		return cgName;
	}

	public Integer getXcdSeqCount() {
		return xcdSeqCount;
	}

	public static List<CodeDto> getCachedCodeArrayList() {
		return cachedCodeArrayList;
	}

	public void setCdSeq(String cdSeq) {
		this.cdSeq = cdSeq;
	}

	public void setCdName(String cdName) {
		this.cdName = cdName;
	}

	public void setCdUseNy(Integer cdUseNy) {
		this.cdUseNy = cdUseNy;
	}

	public void setCdOrder(Integer cdOrder) {
		this.cdOrder = cdOrder;
	}

	public void setCdDesc(String cdDesc) {
		this.cdDesc = cdDesc;
	}

	public void setCdDelNy(Integer cdDelNy) {
		this.cdDelNy = cdDelNy;
	}

	public void setCdDateTimeReg(Date cdDateTimeReg) {
		this.cdDateTimeReg = cdDateTimeReg;
	}

	public void setCdDateTimeEdit(Date cdDateTimeEdit) {
		this.cdDateTimeEdit = cdDateTimeEdit;
	}

	public void setCodeGroup_cgSeq(String codeGroup_cgSeq) {
		this.codeGroup_cgSeq = codeGroup_cgSeq;
	}
 
	public void setCgSeq(String cgSeq) {
		this.cgSeq = cgSeq;
	}

	public void setCgName(String cgName) {
		this.cgName = cgName;
	}

	public void setXcdSeqCount(Integer xcdSeqCount) {
		this.xcdSeqCount = xcdSeqCount;
	}

	public static void setCachedCodeArrayList(List<CodeDto> cachedCodeArrayList) {
		CodeDto.cachedCodeArrayList = cachedCodeArrayList;
	}
	
	


	


	
	
	
}
