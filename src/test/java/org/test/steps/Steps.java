package org.test.steps;
import org.test.screen.DeviceScreen;
import cucumber.api.java.pt.*;

public class Steps {
    DeviceScreen home = new DeviceScreen();

    @Dado("^que pucho o status bar$")
    public void que_pucho_o_status_bar(){
        home.swipe_tool_bar();
    }
    @Quando("^clicar na versao do produto$")
    public void clicar_na_versao_do_produto(){
        home.clicar_versao();
    }
    @Então("^sera aberta a activity sobre$")
    public void sera_aberta_a_activity_sobre(){
        home.validar_sobre();
    }
}
