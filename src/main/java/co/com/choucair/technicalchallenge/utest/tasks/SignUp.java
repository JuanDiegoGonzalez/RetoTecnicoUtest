package co.com.choucair.technicalchallenge.utest.tasks;

import co.com.choucair.technicalchallenge.utest.userinterface.UtestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.UUID;

public class SignUp implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strPassword;

    public SignUp(String strFirstName, String strLastName, String strEmailAddress, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strPassword = strPassword;
    }

    public static SignUp onThePage(String strFirstName, String strLastName, String strEmailAddress, String strPassword) {
        return Tasks.instrumented(SignUp.class, strFirstName, strLastName, strEmailAddress, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestSignUpPage.SIGNUP_BUTTON),
                Enter.theValue(strFirstName).into(UtestSignUpPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UtestSignUpPage.INPUT_LASTNAME),
                // Cambia el email en cada ejecución
                Enter.theValue(UUID.randomUUID().toString() + strEmailAddress).into(UtestSignUpPage.INPUT_EMAILADDRESS),
                Click.on(UtestSignUpPage.BIRTHMONTH_SELECTOR),
                Click.on(UtestSignUpPage.BIRTHMONTH_OPTION),
                Click.on(UtestSignUpPage.BIRTHDAY_SELECTOR),
                Click.on(UtestSignUpPage.BIRTHDAY_OPTION),
                Click.on(UtestSignUpPage.BIRTHYEAR_SELECTOR),
                Click.on(UtestSignUpPage.BIRTHYEAR_OPTION),
                Click.on(UtestSignUpPage.NEXT_BUTTON),
                Click.on(UtestSignUpPage.NEXT_BUTTON),
                Click.on(UtestSignUpPage.NEXT_BUTTON),
                Click.on(UtestSignUpPage.NEXT_BUTTON),
                Enter.theValue(strPassword).into(UtestSignUpPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UtestSignUpPage.INPUT_CONFIRMPASSWORD),
                Click.on(UtestSignUpPage.CHECKBOX_TERMSOFUSE),
                Click.on(UtestSignUpPage.CHECKBOX_PRIVACYPOLICY),
                Click.on(UtestSignUpPage.NEXT_BUTTON));
    }

    public String getStrFirstName() {
        return strFirstName;
    }

    public void setStrFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    public String getStrEmailAddress() {
        return strEmailAddress;
    }

    public void setStrEmailAddress(String strEmailAddress) {
        this.strEmailAddress = strEmailAddress;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }
}
