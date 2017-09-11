package com.c2.template.entities;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table
public class Attachments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long attachmentId;
	@Lob
	private Blob file;
	private String attchamentType;

	public long getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(long attachmentId) {
		this.attachmentId = attachmentId;
	}

	public Blob getFile() {
		return file;
	}

	public void setFile(Blob file) {
		this.file = file;
	}

	public String getAttchamentType() {
		return attchamentType;
	}

	public void setAttchamentType(String attchamentType) {
		this.attchamentType = attchamentType;
	}

}
