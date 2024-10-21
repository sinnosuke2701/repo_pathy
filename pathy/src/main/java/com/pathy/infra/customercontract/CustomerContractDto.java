package com.pathy.infra.customercontract;

public class CustomerContractDto {
	
	private String cmcSeq;
	private Integer cmcDelNY;
	private Integer cmcDateTimeReg;
	private Integer cmcDateTimeEdit;
	private Integer cmcDateTimeEnd;
	private String insProduct_inspSeq;
	private String customer_cmSeq;
	
	//----------
	
	public String getCmcSeq() {
		return cmcSeq;
	}
	public void setCmcSeq(String cmcSeq) {
		this.cmcSeq = cmcSeq;
	}
	public Integer getCmcDelNY() {
		return cmcDelNY;
	}
	public void setCmcDelNY(Integer cmcDelNY) {
		this.cmcDelNY = cmcDelNY;
	}
	public Integer getCmcDateTimeReg() {
		return cmcDateTimeReg;
	}
	public void setCmcDateTimeReg(Integer cmcDateTimeReg) {
		this.cmcDateTimeReg = cmcDateTimeReg;
	}
	public Integer getCmcDateTimeEdit() {
		return cmcDateTimeEdit;
	}
	public void setCmcDateTimeEdit(Integer cmcDateTimeEdit) {
		this.cmcDateTimeEdit = cmcDateTimeEdit;
	}
	public Integer getCmcDateTimeEnd() {
		return cmcDateTimeEnd;
	}
	public void setCmcDateTimeEnd(Integer cmcDateTimeEnd) {
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
	
	//----------
	
	
}
