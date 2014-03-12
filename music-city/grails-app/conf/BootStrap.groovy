import com.musiccity.music.Style

class BootStrap {

    def init = { servletContext ->
		
		initStyle()
		
    }
    def destroy = {
    }
	
	
	def initStyle() {
		['acoustic', 'ambient', 'blues', 'classical', 'country', 'electronic',
		'emo', 'folk', 'hardcore', 'hip hop', 'indie', 'jazz', 'latin',
		'metal', 'pop', 'pop punk', 'punk', 'reggae', 'rnb', 'rock', 'soul', 'world',
		'60s', '70s', '80s', '90s'].each {
		
			new Style(name: it).save(flush: true, failOnError: true)
		}
	}
}
