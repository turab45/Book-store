package com.hotel.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "author_id")
	private Integer id;
	@Column(length = 20, nullable = false, unique = true)
	private String authorName;
	@Column(length = 50, nullable = false, unique = true)
	private String email;
	@Column(length = 8)
	private String password;
	
	
	public UserEntity(Integer id, String authorName, String email, String password) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.email = email;
		this.password = password;
	}
	
	public UserEntity() {
		
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
