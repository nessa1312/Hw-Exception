public class Main {
    public static void main(String[] args) {
        String abc = "sdjfb_aljsf564";
        String passWord = "5123sd kjfaad";
        String congPassWord = "5123sdkjfaad";
        try {
            Data.validateLogin(abc);
            Data.validatePassword(passWord, congPassWord);
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}