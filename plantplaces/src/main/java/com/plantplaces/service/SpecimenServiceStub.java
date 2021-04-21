package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {
	
	@Override
	public SpecimenDTO fetchbyId(int Id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLattitude("101");
		specimenDTO.setLongitude("202");
		specimenDTO.setDescription("A beautiful southern pink bud");
		return specimenDTO;
		
	}

	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
}
