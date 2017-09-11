package com.c2.template.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long documentId;
	private long userId;
	@Enumerated(EnumType.STRING)
	private UserType userType;
	@Enumerated(EnumType.STRING)
	private DocumentType documentType;
	private String docNo;
	private String nameOnDoc;
	private String higherQualification;
	private long attachmentId;

	public String getHigherQualification() {
		return higherQualification;
	}

	public void setHigherQualification(String higherQualification) {
		this.higherQualification = higherQualification;
	}

	public long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}

	public long getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(long attachmentId) {
		this.attachmentId = attachmentId;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public String getNameOnDOc() {
		return nameOnDoc;
	}

	public void setNameOnDOc(String nameOnDOc) {
		this.nameOnDoc = nameOnDOc;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getNameOnDoc() {
		return nameOnDoc;
	}

	public void setNameOnDoc(String nameOnDoc) {
		this.nameOnDoc = nameOnDoc;
	}

}
