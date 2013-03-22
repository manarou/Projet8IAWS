package test.ws
import main.ws.*


class WS_PositionOSMTest extends GroovyTestCase {

  void testPositionOSM() {  
    WS_PositionOSM positionTest = new WS_PositionOSM()
    def retour = positionTest.positionOSM("Blanat","46500","Rocamadour")
	println retour
	assertTrue(retour != "Erreur")
  }
}
