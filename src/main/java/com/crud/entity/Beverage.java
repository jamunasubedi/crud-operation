package com.crud.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="beverage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beverage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bId;
	private String bName;
	private String bType;
	private double bPrice;
	private Boolean isAvailable;

}
