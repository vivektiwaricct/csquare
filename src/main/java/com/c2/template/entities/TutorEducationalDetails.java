package com.c2.template.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table
public class TutorEducationalDetails {
	@Id 
	@GenericGenerator(name="TUTOR_EDUCATION_GEN",strategy="foreign",parameters = {
			@Parameter(name = "property", value = "member") })
	@GeneratedValue(generator="TUTOR_EDUCATION_GEN") 
	private long tutorId;
	private String degree;
	private String university;
	private float passPercentage;
	private String subject;
	private int passYear;
	private boolean hasVehicle;
	private String canTravelDistanceTill;
	private String idProofType;
	private String idProofDocNo;
	private String addressProofType;
	private String addressProofDocNo;

	private MemberRegistrationEntity member;

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public float getPassPercentage() {
		return passPercentage;
	}

	public void setPassPercentage(float passPercentage) {
		this.passPercentage = passPercentage;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getPassYear() {
		return passYear;
	}

	public void setPassYear(int passYear) {
		this.passYear = passYear;
	}

	public boolean getHasVehicle() {
		return hasVehicle;
	}

	public void setHasVehicle(boolean hasVehicle) {
		this.hasVehicle = hasVehicle;
	}

	public String getCanTravelDistanceTill() {
		return canTravelDistanceTill;
	}

	public void setCanTravelDistanceTill(String canTravelDistanceTill) {
		this.canTravelDistanceTill = canTravelDistanceTill;
	}

	public String getIdProofType() {
		return idProofType;
	}

	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}

	public String getIdProofDocNo() {
		return idProofDocNo;
	}

	public void setIdProofDocNo(String idProofDocNo) {
		this.idProofDocNo = idProofDocNo;
	}

	public String getAddressProofType() {
		return addressProofType;
	}

	public void setAddressProofType(String addressProofType) {
		this.addressProofType = addressProofType;
	}

	public String getAddressProofDocNo() {
		return addressProofDocNo;
	}

	public void setAddressProofDocNo(String addressProofDocNo) {
		this.addressProofDocNo = addressProofDocNo;
	}

	public long getTutorId() {
		return tutorId;
	}

	public void setTutorId(long tutorId) {
		this.tutorId = tutorId;
	}

	public MemberRegistrationEntity getMember() {
		return member;
	}

	public void setMember(MemberRegistrationEntity member) {
		this.member = member;
	}
	
}
