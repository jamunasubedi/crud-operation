package com.crud.service;

import java.util.List;

import com.crud.dto.BeverageDto;

public interface BeverageService {
	BeverageDto insertBeverage(BeverageDto bev);
	BeverageDto updateBeverage(BeverageDto bev, Integer bevId);
	void deleteBeverage(Integer bevId);
	BeverageDto getSingleData(Integer id);
	List<BeverageDto> getAllBeverage();

}
