package com.musiccity.music

import com.musiccity.event.Event

class Band {
	
	String name
	
	static belongsTo = Style
	
	static hasMany = [
		styles: Style,
		events: Event
	]

    static constraints = {
    }
}
