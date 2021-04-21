package com.plantplaces.dto;

public class SpecimenDTO {
	
	private int specimenId;
	private String lattitude;
	private String longitude;
	private String description;
	private String plantId;
	
	public int getSpecimenId() {
		return specimenId;
	}
	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}
	public String getLattitude() {
		return lattitude;
	}
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPlantId() {
		return plantId;
	}
	public void setPlantId(String plantId) {
		this.plantId = plantId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return specimenId + " " + lattitude + " " + longitude + " " + description + " " + plantId;
	}
	

}
