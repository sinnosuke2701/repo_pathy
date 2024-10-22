package com.pathy.infra.applicationShin;

import java.util.Date;

public class ApplicationShinDto {
	
	private String shinSeq;
	private String shinDate;
	private String shinDateGa;
	private Integer shinDelNy;
	private Date shinDateTImeReg;
	private Date shinDateTimeEdit;
	private String insProduct_inspSeq;
	private String customer_cmSeq;
	private String insMember_insmSeq;
	
	
	public String getShinSeq() {
		return shinSeq;
	}
	public void setShinSeq(String shinSeq) {
		this.shinSeq = shinSeq;
	}
	public String getShinDate() {
		return shinDate;
	}
	public void setShinDate(String shinDate) {
		this.shinDate = shinDate;
	}
	public String getShinDateGa() {
		return shinDateGa;
	}
	public void setShinDateGa(String shinDateGa) {
		this.shinDateGa = shinDateGa;
	}
	public Integer getShinDelNy() {
		return shinDelNy;
	}
	public void setShinDelNy(Integer shinDelNy) {
		this.shinDelNy = shinDelNy;
	}
	public Date getShinDateTImeReg() {
		return shinDateTImeReg;
	}
	public void setShinDateTImeReg(Date shinDateTImeReg) {
		this.shinDateTImeReg = shinDateTImeReg;
	}
	public Date getShinDateTimeEdit() {
		return shinDateTimeEdit;
	}
	public void setShinDateTimeEdit(Date shinDateTimeEdit) {
		this.shinDateTimeEdit = shinDateTimeEdit;
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
	public String getInsMember_insmSeq() {
		return insMember_insmSeq;
	}
	public void setInsMember_insmSeq(String insMember_insmSeq) {
		this.insMember_insmSeq = insMember_insmSeq;
	}

}
