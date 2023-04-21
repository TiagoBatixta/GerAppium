package org.test.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebElement;

import static org.junit.matchers.JUnitMatchers.containsString;
import static org.test.Hooks.driver;

public class DeviceScreen extends BaseScreen {
    public void swipe_tool_bar() {
        TouchAction swipe = new TouchAction(driver);
        swipe.press(370, 0).waitAction().moveTo(370, 1000).release().perform();
    }

    public void clicar_versao(){
        MobileElement versao = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
        versao.click();
    }

    @AndroidFindBy(id = "br.com.stone.posandroid.settingsapp:id/titleToolbar")
    private RemoteWebElement sobre;
    public void validar_sobre(){
        String titulo = sobre.getAttribute("text");
        Assert.assertThat("Está na tela sobre", titulo, containsString("SOBRE"));
    }
}
