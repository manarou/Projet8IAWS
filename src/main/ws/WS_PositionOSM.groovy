package main.ws

import groovyx.net.http.*
import static groovyx.net.http.ContentType.JSON


//OSM = Open Street Map
/**
 * 
 * @author Guilleux
 *
 */
class WS_PositionOSM {

	/**
	 * @param adresse
	 * @param cp
	 * @param ville
	 * @return document au format json d'OSM représentant le résultat de la
	 * recherche de l'adresse passée en paramètres
	 */
	def positionOSM(def adresse, def cp, def ville) {
	  
		def retourJson = "Erreur"
		def adresseServeur = new HTTPBuilder("http://nominatim.openstreetmap.org")
		
		//Build du path
		def path = '/search/fr/' + adresse + '/' + cp + '/' + ville + '/?format=json'
		
		adresseServeur.request(Method.GET, JSON) {
		
			uri.path = path
		  
			// En cas de réussite
			response.success = { resp, json ->
				retourJson = json
			}
		  
			// En cas d'échec
			// handler for any failure status code:
			response.failure = { resp ->
				println "Unexpected error: ${resp.statusLine.statusCode} : ${resp.statusLine.reasonPhrase}"
			}
		}
		retourJson
	}
}
