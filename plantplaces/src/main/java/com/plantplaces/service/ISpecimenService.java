package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

public interface ISpecimenService {

	SpecimenDTO fetchbyId(int Id);

	void save(SpecimenDTO specimenDTO);

}