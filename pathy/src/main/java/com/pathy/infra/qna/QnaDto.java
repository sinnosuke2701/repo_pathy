package com.pathy.infra.qna;

import java.util.Date;

public class QnaDto {
	
	private String qnaSeq;
	private Integer qnaCategory;
	private Integer qnaDelNY;
	private Date qnaDateTimeReg;
	private Date qnaDateTimeEdit;
	private String qnaTitle;
	private String qnaContent;
	private String customer_cmSeq;
	private String insMember_insmSeq;
	
	private String cmSeq;
	private String cmName;
	
	private String insmSeq;
	private String insmName;
	//---------
	public String getQnaSeq() {
		return qnaSeq;
	}
	public void setQnaSeq(String qnaSeq) {
		this.qnaSeq = qnaSeq;
	}
	public Integer getQnaCategory() {
		return qnaCategory;
	}
	public void setQnaCategory(Integer qnaCategory) {
		this.qnaCategory = qnaCategory;
	}
	public Integer getQnaDelNY() {
		return qnaDelNY;
	}
	public void setQnaDelNY(Integer qnaDelNY) {
		this.qnaDelNY = qnaDelNY;
	}
	public Date getQnaDateTimeReg() {
		return qnaDateTimeReg;
	}
	public void setQnaDateTimeReg(Date qnaDateTimeReg) {
		this.qnaDateTimeReg = qnaDateTimeReg;
	}
	public Date getQnaDateTimeEdit() {
		return qnaDateTimeEdit;
	}
	public void setQnaDateTimeEdit(Date qnaDateTimeEdit) {
		this.qnaDateTimeEdit = qnaDateTimeEdit;
	}
	public String getQnaTitle() {
		return qnaTitle;
	}
	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}
	public String getQnaContent() {
		return qnaContent;
	}
	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
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
	public String getInsmSeq() {
		return insmSeq;
	}
	public void setInsmSeq(String insmSeq) {
		this.insmSeq = insmSeq;
	}
	public String getInsmName() {
		return insmName;
	}
	public void setInsmName(String insmName) {
		this.insmName = insmName;
	}
	
}
