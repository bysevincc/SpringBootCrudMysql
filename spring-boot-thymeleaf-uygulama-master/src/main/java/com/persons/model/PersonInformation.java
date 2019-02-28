package com.persons.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_information", catalog = "persons")
@SuppressWarnings("serial")
public class PersonInformation implements Serializable {

	private Integer id;
	private String name;
	private String age;
	private String hobby;
	
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Basic
	@Column(name = "NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Basic
	@Column(name = "AGE")
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Basic
	@Column(name = "HOBBY")
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
