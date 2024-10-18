package com.pathy.infra.claimmanage;

import java.util.Date;

public class ClaimManageDto {

	private String clmSeq;
	private String clmName;
	private Integer clmSituation;
	private Date clmDateTimeReg;
	private Date clmDateTimeEdit;
	private Integer clmUseNY;
	private Integer clmDelNY;
//	-----
	public String getClmSeq() {
		return clmSeq;
	}
	public void setClmSeq(String clmSeq) {
		this.clmSeq = clmSeq;
	}
	public String getClmName() {
		return clmName;
	}
	public void setClmName(String clmName) {
		this.clmName = clmName;
	}
	public Date getClmDateTimeReg() {
		return clmDateTimeReg;
	}
	public void setClmDateTimeReg(Date clmDateTimeReg) {
		this.clmDateTimeReg = clmDateTimeReg;
	}
	public Date getClmDateTimeEdit() {
		return clmDateTimeEdit;
	}
	public void setClmDateTimeEdit(Date clmDateTimeEdit) {
		this.clmDateTimeEdit = clmDateTimeEdit;
	}
	public Integer getClmUseNY() {
		return clmUseNY;
	}
	public void setClmUseNY(Integer clmUseNY) {
		this.clmUseNY = clmUseNY;
	}
	public Integer getClmDelNY() {
		return clmDelNY;
	}
	public void setClmDelNY(Integer clmDelNY) {
		this.clmDelNY = clmDelNY;
	}
	public Integer getClmSituation() {
		return clmSituation;
	}
	public void setClmSituation(Integer clmSituation) {
		this.clmSituation = clmSituation;
	}
	
	
}
