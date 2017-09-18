package com.c2.template.model;

import org.springframework.web.multipart.MultipartFile;

public class TutorEducationalDetails {
	
	private String degree;
	private String university;
	private float passPercentage;
	private String subject;
	private int passYear;
	private MultipartFile degreeCertificate;
	private boolean hasVehicle;
	private String canTravelDistance;

	private String idProofType;
	private String idProofDocNo;
	private MultipartFile idProof;

	private String addressProofType;
	private String addressProofDocNo;
	private MultipartFile addressProof;
	private MultipartFile resume;
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
	public MultipartFile getDegreeCertificate() {
		return degreeCertificate;
	}
	public void setDegreeCertificate(MultipartFile degreeCertificate) {
		this.degreeCertificate = degreeCertificate;
	}
	public boolean isHasVehicle() {
		return hasVehicle;
	}
	public void setHasVehicle(boolean hasVehicle) {
		this.hasVehicle = hasVehicle;
	}
	public String getCanTravelDistance() {
		return canTravelDistance;
	}
	public void setCanTravelDistance(String canTravelDistance) {
		this.canTravelDistance = canTravelDistance;
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
	public MultipartFile getIdProof() {
		return idProof;
	}
	public void setIdProof(MultipartFile idProof) {
		this.idProof = idProof;
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
	public MultipartFile getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(MultipartFile addressProof) {
		this.addressProof = addressProof;
	}
	public MultipartFile getResume() {
		return resume;
	}
	public void setResume(MultipartFile resume) {
		this.resume = resume;
	}
	
	
}
