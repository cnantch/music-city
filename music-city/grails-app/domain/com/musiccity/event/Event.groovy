package com.musiccity.event

import com.musiccity.music.Style;
import com.musiccity.place.Place


class Event {

	String name
	Date date
	String description
	String photo
	String price
	Place place
	
	static hasMany = [styles: Style]
	
	
    static constraints = {
		photo nullable: true
    }
}
