package utils

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide

class SetUpSelenoid {
    /*Use Selenoid docker containers
    * install docker and open
    * download selenoid configuration manager (cm)
    * install container ./cm selenoid start --vnc
    * install container ./cm selenoid-ui start
    * install container docker pull selenoid/chrome:88.0
     */
    fun setUp() {
        Configuration.remote = "http://localhost:4444/wd/hub"
        Configuration.browser = "chrome"
        Configuration.browserVersion = "88.0"
        Configuration.browserCapabilities.setCapability("enableVNC", true)
        Configuration.startMaximized = true
        Selenide.open("https://test.baikalpass.ru")
    }
}