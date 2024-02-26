import java.util.Scanner;

public class LoginPhone {
    private int login;

    public LoginPhone() {
    }

    public int phoneParol() {
        LoginPhone loginPhone = new LoginPhone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код-пароль");
        int parol = 4354;
        int paroll = scanner.nextInt();
        if (paroll == parol) {
            System.out.println("Успешьно");
        } else {
            System.out.println(" Не правильно");
            System.exit(0);
        }


        return parol;

    }


    public LoginPhone(int login) {
        this.login = login;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "LoginPhone{" +
                "login=" + login +
                '}';
    }
}

