package com.pathy.infra.customercontract;

import java.util.Date;

public class CustomerContractDto {
	
	private String cmcSeq;
	private Integer cmcDelNy;
	private Date cmcDateTimeReg;
	private Date cmcDateTimeEdit;
	private Date cmcDateTimeEnd;
	private Integer cmcStatus;
	private String insProduct_inspSeq;
	private String customer_cmSeq;
	
	private String cmSeq;
	private String cmName;
	
	private String inspSeq;
	private String inspName;
	
	//----------
	public String getCmcSeq() {
		return cmcSeq;
	}
	public void setCmcSeq(String cmcSeq) {
		this.cmcSeq = cmcSeq;
	}
	public Date getCmcDateTimeReg() {
		return cmcDateTimeReg;
	}
	public void setCmcDateTimeReg(Date cmcDateTimeReg) {
		this.cmcDateTimeReg = cmcDateTimeReg;
	}
	public Date getCmcDateTimeEdit() {
		return cmcDateTimeEdit;
	}
	public void setCmcDateTimeEdit(Date cmcDateTimeEdit) {
		this.cmcDateTimeEdit = cmcDateTimeEdit;
	}
	public Date getCmcDateTimeEnd() {
		return cmcDateTimeEnd;
	}
	public void setCmcDateTimeEnd(Date cmcDateTimeEnd) {
		this.cmcDateTimeEnd = cmcDateTimeEnd;
	}
	public String getInsProduct_inspSeq() {
		return insProduct_inspSeq;
	}
	public void setInsProduct_inspSeq(String insProduct_inspSeq) {
		this.insProduct_inspSeq = insProduct_inspSeq;
	}
	public String getCustomer_cmSeq() {
		return customer_cmSeq;
	}
	public void setCustomer_cmSeq(String customer_cmSeq) {
		this.customer_cmSeq = customer_cmSeq;
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
	public Integer getCmcStatus() {
		return cmcStatus;
	}
	public void setCmcStatus(Integer cmcStatus) {
		this.cmcStatus = cmcStatus;
	}
	public Integer getCmcDelNy() {
		return cmcDelNy;
	}
	public void setCmcDelNy(Integer cmcDelNy) {
		this.cmcDelNy = cmcDelNy;
	}
	
}
