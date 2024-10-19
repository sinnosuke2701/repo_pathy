package com.pathy.infra.codegroup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class CodeGroupDto {
	
	
	private String cgSeq;
	private String cgName;
	private Integer cgUseNy;
	private Integer cgOrder;
	private String cgDesc;
	private Integer cgDelNy;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date cgDateTimeReg;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date cgDateTimeEdit;
	
	//count 추가
	private Integer xcdSeqCount;
	
	// for cache
		public static List<CodeGroupDto> cachedCodeGroupArrayList = new ArrayList<CodeGroupDto>();

		public String getCgSeq() {
			return cgSeq;
		}

		public String getCgName() {
			return cgName;
		}

		public Integer getCgUseNy() {
			return cgUseNy;
		}

		public Integer getCgOrder() {
			return cgOrder;
		}

		public String getCgDesc() {
			return cgDesc;
		}

		public Integer getCgDelNy() {
			return cgDelNy;
		}

		public Date getCgDateTimeReg() {
			return cgDateTimeReg;
		}

		public Date getCgDateTimeEdit() {
			return cgDateTimeEdit;
		}

		public Integer getXcdSeqCount() {
			return xcdSeqCount;
		}

		public static List<CodeGroupDto> getCachedCodeGroupArrayList() {
			return cachedCodeGroupArrayList;
		}

		public void setCgSeq(String cgSeq) {
			this.cgSeq = cgSeq;
		}

		public void setCgName(String cgName) {
			this.cgName = cgName;
		}

		public void setCgUseNy(Integer cgUseNy) {
			this.cgUseNy = cgUseNy;
		}

		public void setCgOrder(Integer cgOrder) {
			this.cgOrder = cgOrder;
		}

		public void setCgDesc(String cgDesc) {
			this.cgDesc = cgDesc;
		}

		public void setCgDelNy(Integer cgDelNy) {
			this.cgDelNy = cgDelNy;
		}

		public void setCgDateTimeReg(Date cgDateTimeReg) {
			this.cgDateTimeReg = cgDateTimeReg;
		}

		public void setCgDateTimeEdit(Date cgDateTimeEdit) {
			this.cgDateTimeEdit = cgDateTimeEdit;
		}

		public void setXcdSeqCount(Integer xcdSeqCount) {
			this.xcdSeqCount = xcdSeqCount;
		}

		public static void setCachedCodeGroupArrayList(List<CodeGroupDto> cachedCodeGroupArrayList) {
			CodeGroupDto.cachedCodeGroupArrayList = cachedCodeGroupArrayList;
		}
		
		
//		---- getter/setter ----
	

	
	

	
	
}
