package com.mlb.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mlb.common.StadiumCoordinates;
import com.mlb.common.StadiumNames;
import com.mlb.common.StadiumTimeZones;

@Component
public class Braves implements Team {

	private final String stadium = StadiumNames.Turner_Field;	
	private final Integer timeZone;
	
	private final double latitude = 33.734805; 
	private final double longitude = -84.389996;	

	@Autowired
	public Braves(StadiumTimeZones stadiumTimeZones) {
		this.timeZone = stadiumTimeZones.getStadiumTimeZone(stadium);
	}

	@Override
	public String getStadium() {
		return stadium;
	}

	public Integer getTimeZone() {
		return timeZone;
	}

	@Override
	public StadiumCoordinates getStadiumCoordinates() {
		return new StadiumCoordinates(latitude, longitude);
	}
}
