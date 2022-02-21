package co.com.castor.fyffes.question.session;

import co.com.castor.fyffes.ui.session.LoginUI;
import co.com.castor.fyffes.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginVer implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor user){
        return Text.of(LoginUI.TXT_FOUND_LOGIN).viewedBy(user).asString().contains(Constants.TXT_LOGIN);
    }

    public static Question <Boolean> loginSuccess(){
        return new LoginVer();
    }
}
