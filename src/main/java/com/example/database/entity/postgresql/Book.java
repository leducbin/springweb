package com.example.database.entity.postgresql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book implements Serializable {
	
	private static final long serialVersionUID = -9019470250770543773L;

	@Id
	private Long id;
	
	@Column
	private String fisrtname;
	
	@Column
	private String lastname;

	public Book() {
	}

	public Book(Long id, String fisrtname, String lastname) {
		this.id = id;
		this.fisrtname = fisrtname;
		this.lastname = lastname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFisrtname() {
		return fisrtname;
	}

	public void setFisrtname(String fisrtname) {
		this.fisrtname = fisrtname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
