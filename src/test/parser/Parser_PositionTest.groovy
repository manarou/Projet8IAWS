package test.parser;
import static org.junit.Assert.*;
import groovy.util.GroovyTestCase;
import main.parser.Parser_Position
import main.ws.WS_PositionOSM

class Parser_PositionTest extends GroovyTestCase{
	void testParser() {
		//def docJsonTest = "[[place_id:1, p1:a, , p2:2, lat:78.46847, lon:17.51477, p2:2]]"
		WS_PositionOSM positionTest = new WS_PositionOSM()
		def docJsonTest = positionTest.positionOSM("Blanat","46500","Rocamadour")
		
		def parseur = new Parser_Position()
		parseur.parserPosition(docJsonTest)
		
		println parseur.getLatitude()
		println parseur.getLongitude()
		
		assertEquals(parseur.getLongitude(),17.51477)
		assertEquals(parseur.getLatitude(),78.46847)
	}
}
