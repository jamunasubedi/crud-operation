package com.crud.beveragerepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Beverage;

public interface BeverageRepo extends JpaRepository<Beverage, Integer> {

}
