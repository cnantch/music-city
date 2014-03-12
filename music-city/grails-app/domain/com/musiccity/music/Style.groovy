package com.musiccity.music

class Style {
	
	String name
	
	static hasMany = [
		bands: Band
	]

    static constraints = {
    }
}
