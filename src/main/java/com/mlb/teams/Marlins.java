package com.mlb.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mlb.common.StadiumCoordinates;
import com.mlb.common.StadiumNames;
import com.mlb.common.StadiumTimeZones;

@Component
public class Marlins implements Team {

	private final String stadium = StadiumNames.Marlins_Park;	
	private final Integer timeZone;
	
	private final double latitude = 25.778655; 
	private final double longitude = -80.220305;	

	@Autowired
	public Marlins(StadiumTimeZones stadiumTimeZones) {
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
