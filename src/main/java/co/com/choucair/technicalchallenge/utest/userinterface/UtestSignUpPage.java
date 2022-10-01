package co.com.choucair.technicalchallenge.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSignUpPage extends PageObject {
    public static final Target SIGNUP_BUTTON = Target.the("button that displays the sign up form")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_FIRSTNAME = Target.the("input where the user's first name is written")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("input where the user's last name is written")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAILADDRESS = Target.the("input where the user's email address is written")
            .located(By.id("email"));
    public static final Target BIRTHMONTH_SELECTOR = Target.the("selector where the user's birth month is chosen")
            .located(By.id("birthMonth"));
    public static final Target BIRTHMONTH_OPTION = Target.the("option with the user's birth month")
            .located(By.xpath("//select[@id='birthMonth']//option[contains(text(),'January')]"));
    public static final Target BIRTHDAY_SELECTOR = Target.the("selector where the user's birth day is chosen")
            .located(By.id("birthDay"));
    public static final Target BIRTHDAY_OPTION = Target.the("option with the user's birth day")
            .located(By.xpath("//select[@id='birthDay']//option[contains(text(),'8')]"));
    public static final Target BIRTHYEAR_SELECTOR = Target.the("selector where the user's birth year is chosen")
            .located(By.id("birthYear"));
    public static final Target BIRTHYEAR_OPTION = Target.the("option with the user's birth year")
            .located(By.xpath("//select[@id='birthYear']//option[contains(text(),'2003')]"));
    public static final Target NEXT_BUTTON = Target.the("button that moves to the next part of the form")
            .located(By.className("btn-blue"));
    public static final Target INPUT_PASSWORD = Target.the("input where the user's password is written")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("input where the user's password is confirmed")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMSOFUSE = Target.the("checkbox where the user accepts the terms of use")
            .located(By.id("termOfUse"));
    public static final Target CHECKBOX_PRIVACYPOLICY = Target.the("checkmark where the user accepts the privacy policy")
            .located(By.id("privacySetting"));
    public static final Target PAGE_TITLE = Target.the("page title")
            .located(By.xpath("//div[@class='image-box-header']//h1"));
}
