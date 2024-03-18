package com.backendapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CanUserDet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CanUserDetId")
	private int id;
	
	@Column(name = "CanUserName")
	private String userName;
	
	@ManyToOne
	@JoinColumn(name = "CanRoleId", referencedColumnName = "CanRoleId")
	private CanRole role;
	
	@Column(name = "CanUserStatus")
	private String status;
}
