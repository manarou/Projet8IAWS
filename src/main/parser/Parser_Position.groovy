package main.parser

import groovy.json.JsonSlurper
import net.sf.json.JSONObject
import groovy.json.JsonOutput

class Parser_Position {
	private float longitude
	private float latitude
		
	Parser_Position() {
		longitude = 0
		latitude = 0
	}
	
	/**
	 * Le document retourné par l'API n'est pas du Json mais est une sorte de liste
	 * @param documentJson
	 */
	void parserPosition(def documentJson) {
		println documentJson
		
		List lst = new ArrayList(documentJson)
		println lst
		Map mp = new HashMap().putAll(documentJson)
		println mp
		
		/*JSONObject jsonParse =*/ //println new JSONObject().putAll(null)
		
		//JSONOutput js = 
		
		//.fromObject(documentJson).toString()
		//println jsonParse.
		//.collectEntries {documentJson}.toString()
		
		//println jsonParse.toString()
		//latitude = result.place.lat
		//longitude = result.place.lon
	}
	
	float getLongitude() {
		longitude
	}
	
	float getLatitude() {
		latitude
	}
	
}
