package com.musiccity.event

import com.musiccity.music.Band
import com.musiccity.place.Place


class Event {

	String name
	Date date
	String description
	String photo
	String price
	Place place
	
	static belongsTo = Band
	
	static hasMany = [
		bands: Band
	]
	
	
    static constraints = {
		photo nullable: true
    }
}
