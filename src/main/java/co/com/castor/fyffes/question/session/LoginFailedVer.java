package co.com.castor.fyffes.question.session;

import co.com.castor.fyffes.ui.session.LoginUI;
import co.com.castor.fyffes.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginFailedVer implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor user){
        return Text.of(LoginUI.TXT_FOUND_LOGIN_FAILED).viewedBy(user).asString().contains(Constants.TXT_LOGIN_FAILED);
    }

    public static Question <Boolean> loginFailed(){
        return new LoginFailedVer();
    }
}
