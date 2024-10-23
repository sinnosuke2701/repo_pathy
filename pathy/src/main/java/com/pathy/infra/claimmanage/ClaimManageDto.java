package com.pathy.infra.claimmanage;

import java.util.Date;

public class ClaimManageDto {

	private String clmSeq;
	private String clmName;
	private Integer clmSituation;
	private Date clmDateTimeReg;
	private Date clmDateTimeEdit;
	private Date clmDateTimeAssign;
	private Integer clmUseNY;
	private Integer clmDelNY;
	private String insMember_insmSeq;
	private String insmName;
	private String insmSeq;
	
	private String cmSeq;
	private String cmName;
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
	public String getInsMember_insmSeq() {
		return insMember_insmSeq;
	}
	public void setInsMember_insmSeq(String insMember_insmSeq) {
		this.insMember_insmSeq = insMember_insmSeq;
	}
	public String getInsmName() {
		return insmName;
	}
	public void setInsmName(String insmName) {
		this.insmName = insmName;
	}
	public String getInsmSeq() {
		return insmSeq;
	}
	public void setInsmSeq(String insmSeq) {
		this.insmSeq = insmSeq;
	}
	public Date getClmDateTimeAssign() {
		return clmDateTimeAssign;
	}
	public void setClmDateTimeAssign(Date clmDateTimeAssign) {
		this.clmDateTimeAssign = clmDateTimeAssign;
	}
	public String getCmSeq() {
		return cmSeq;
	}
	public void setCmSeq(String cmSeq) {
		this.cmSeq = cmSeq;
	}
	public String getCmName() {
		return cmName;
	}
	public void setCmName(String cmName) {
		this.cmName = cmName;
	}
	
	
}
