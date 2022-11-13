package com.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BeverageDto {

	private int bid;
	private String bName;
	private String bType;
	private double price;
	private boolean isAvailable;
}
