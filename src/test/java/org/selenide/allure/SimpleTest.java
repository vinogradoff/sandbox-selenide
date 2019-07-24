package org.selenide.allure;

import com.codeborne.selenide.logevents.*;
import io.qameta.allure.selenide.*;
import org.junit.jupiter.api.*;

import java.io.*;

import static com.codeborne.selenide.Selenide.*;

public class SimpleTest {

  @BeforeAll
  static void init(){
    SelenideLogger.addListener("AllureSelenide",new AllureSelenide());

  }

  @Test
  void openGoogle() throws IOException {
    System.setProperty("wdm.chromeDriverVersion","2.25"); // just take old and incompatible chrome driver
    open("https://google.com/ncr");
    //java.lang.IllegalStateException: No webdriver is bound to current thread: 1. You need to call open(url) first.
  }


}
