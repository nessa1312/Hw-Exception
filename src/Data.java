import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {
    public static boolean validatePassword(String password, String confirmPassword) throws WrongPasswordException {

        Pattern pattern = Pattern.compile("\\w{1,20}");
        Matcher matcherPass = pattern.matcher(password);
        Matcher matcherConfPass = pattern.matcher(confirmPassword);
        if (password.length() == confirmPassword.length() & matcherPass.matches() & matcherConfPass.matches()) {
            return true;
        } else {
            throw new WrongPasswordException("Пароль некорректен");
        }

    }

    public static boolean validateLogin(String login) throws WrongLoginException {

        Pattern pattern = Pattern.compile("\\w{1,20}");
        Matcher matcher = pattern.matcher(login);
        if (matcher.matches()) {
            return true;
        } else {
            throw new WrongLoginException();
        }
    }
}
