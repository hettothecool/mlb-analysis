package com.mlb.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mlb.common.StadiumCoordinates;
import com.mlb.common.StadiumNames;
import com.mlb.common.StadiumTimeZones;

@Component
public class Rangers implements Team {

	private final String stadium = StadiumNames.Globe_Life_Park;	
	private final Integer timeZone;
	
	private final double latitude = 32.751147; 
	private final double longitude = -97.082454;	

	@Autowired
	public Rangers(StadiumTimeZones stadiumTimeZones) {
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
