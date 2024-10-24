package com.pathy.infra.insProduct;

import java.util.Date;

public class InsProductDto {
	
	private String inspSeq;
	private String inspName;
	private String inspBojang;
	private String inspJogun;
	private String inspPrice;
	private String inspPaper;
	private Integer inspDelNy;
	private Date inspDateTimeReg;
	private Date inspDateTimeEdit;
	
	 
	public String getInspSeq() {
		return inspSeq;
	}
	public void setInspSeq(String inspSeq) {
		this.inspSeq = inspSeq;
	}
	public String getInspName() {
		return inspName;
	}
	public void setInspName(String inspName) {
		this.inspName = inspName;
	}
	public String getInspBojang() {
		return inspBojang;
	}
	public void setInspBojang(String inspBojang) {
		this.inspBojang = inspBojang;
	}
	public String getInspJogun() {
		return inspJogun;
	}
	public void setInspJogun(String inspJogun) {
		this.inspJogun = inspJogun;
	}
	public String getInspPrice() {
		return inspPrice;
	}
	public void setInspPrice(String inspPrice) {
		this.inspPrice = inspPrice;
	}
	public String getInspPaper() {
		return inspPaper;
	}
	public void setInspPaper(String inspPaper) {
		this.inspPaper = inspPaper;
	}
	public Integer getInspDelNy() {
		return inspDelNy;
	}
	public void setInspDelNy(Integer inspDelNy) {
		this.inspDelNy = inspDelNy;
	}
	public Date getInspDateTimeReg() {
		return inspDateTimeReg;
	}
	public void setInspDateTimeReg(Date inspDateTimeReg) {
		this.inspDateTimeReg = inspDateTimeReg;
	}
	public Date getInspDateTimeEdit() {
		return inspDateTimeEdit;
	}
	public void setInspDateTimeEdit(Date inspDateTimeEdit) {
		this.inspDateTimeEdit = inspDateTimeEdit;
	}
	
	

}
