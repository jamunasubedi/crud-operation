package com.crud.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.beveragerepo.BeverageRepo;
import com.crud.dto.BeverageDto;
import com.crud.entity.Beverage;
import com.crud.service.BeverageService;

public class BeverageServiceImpl implements BeverageService{

	@Autowired
	private BeverageRepo beverageRepo;

	@Override
	public BeverageDto insertBeverage(BeverageDto bev) {
		
		
		return null;
	}

	@Override
	public BeverageDto updateBeverage(BeverageDto bev, Integer bevId) {
		
		return null;
	}

	@Override
	public void deleteBeverage(Integer bevId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BeverageDto getSingleData(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BeverageDto> getAllBeverage(){
		return null;
	}
	
	


}
