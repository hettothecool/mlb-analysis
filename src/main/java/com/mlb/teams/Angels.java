package com.mlb.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mlb.common.StadiumCoordinates;
import com.mlb.common.StadiumNames;
import com.mlb.common.StadiumTimeZones;

@Component
public class Angels implements Team {

	private final String stadium = StadiumNames.Angel_Stadium;
	private final Integer timeZone;
	
	private final double latitude = 33.799925; 
	private final double longitude = -117.883194;
	
	@Autowired
	public Angels(StadiumTimeZones stadiumTimeZones) {
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
