package com.backendapi.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CanBasicDet {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "CanBasicId")
	private int id;
	
	@Column(name = "CanFirstName")
	private String firstName;
	
	@Column(name = "CanMiddleName")
	private String middleName;
	
	@Column(name = "CanlastName")
	private String lastName;
	
	@Column(name = "CanDOB")
	private LocalDate dob;
	
	@Column(name = "CanGender")
	private String gender;
	
	@Column(name = "CanMobile")
	private String mobile;
	
	@Column(name = "CanEmail")
	private String email;
	
	@Column(name = "CanCurrentLocation")
	private String currentLocation;
	
	@Column(name = "CanPrefferedLocation")
	private String prefferedLocation;
	
	@Column(name = "CanCountry")
	private String country;
	
	@Column(name = "CanBasicDateTime")
	private LocalDateTime basicDateTime;
}
