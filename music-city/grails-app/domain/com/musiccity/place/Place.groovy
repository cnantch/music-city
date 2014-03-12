package com.musiccity.place

import com.musiccity.event.Event

class Place {

	
	String name
	String description
	String street
	String city
	String zip
	String country
	String photo
	
	static belongsTo = [event: Event]
	
	
    static constraints = {
		description type: "text"
    }
}
