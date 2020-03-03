package com.ntech.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alien")
public class AlienSaveForm {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int alienId;
	@Column
	String fullname;
	@Column
	String email;
	@Column
	String pwd;
	@Column
	String cpwd;
	@Column
	String photo;
	@Column
	String gender;
	@Column
	String specialization;
	@Column
	String hobbies;
	
	
	public AlienSaveForm(int alienId, String fullname, String email, String pwd, String cpwd, String photo,
			String gender, String specialization, String hobbies) {
		super();
		this.alienId = alienId;
		this.fullname = fullname;
		this.email = email;
		this.pwd = pwd;
		this.cpwd = cpwd;
		this.photo = photo;
		this.gender = gender;
		this.specialization = specialization;
		this.hobbies = hobbies;
	}
	public AlienSaveForm() {
		super();
	}
	public int getAlienId() {
		return alienId;
	}
	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
	

}
