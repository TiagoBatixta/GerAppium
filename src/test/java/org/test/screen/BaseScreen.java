package org.test.screen;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.test.Hooks;

public class BaseScreen {
    public BaseScreen (){
        PageFactory.initElements(new AppiumFieldDecorator(Hooks.getDriver()), this);
    }
}
