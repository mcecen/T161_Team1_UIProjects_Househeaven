package tests.US022;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HauseHaven_Mahmut;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TC001  {
    @Test
    public void testValidLoginWithHauseHavenMahmut() {
        // HauseHaven_Mahmut nesnesi üzerinden sayfa elementlerine erişilir
        HauseHaven_Mahmut mahmutPage = new HauseHaven_Mahmut();

        // 1. QA ortamı açılır
        Driver.getDriver().get("https://qa.hauseheaven.com/");

        // 2. "Sign In" butonuna tıklanır
        mahmutPage.signInButton.click();

        // 3. Kayıtlı kullanıcı adı ve şifre girilir
        mahmutPage.emailInput.sendKeys("mahmutas100@gmail.com");  // QA ortamına kayıtlı kullanıcı
        mahmutPage.passwordInput.sendKeys("326588.Ma");

        // 4. "Login" butonuna tıklanır
        mahmutPage.loginButton.click();
        ReusableMethods.bekle(2); // sayfa yüklenmesi için kısa bekleme

        // Test sonrası tarayıcıyı kapat
        Driver.quitDriver();
    }


}
