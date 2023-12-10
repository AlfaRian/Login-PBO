import java.util.Scanner;

public class Login{
    public static void main(String[] args) {
        String username = "rian123";
        String password = "alfa123";

        String captcha = generateCaptcha();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang! Silakan login.");

        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();

        System.out.println("Captcha: " + captcha);
        System.out.print("Masukkan Captcha (case insensitive): ");
        String inputCaptcha = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password) && inputCaptcha.equalsIgnoreCase(captcha)) {
            System.out.println("Login berhasil! Selamat datang, " + username + ".");
        } else {
            System.out.println("Login gagal. Pastikan username, password, dan Captcha benar.");
        }
    }

    private static String generateCaptcha() {
        String sourceChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder captcha = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * sourceChars.length());
            captcha.append(sourceChars.charAt(index));
        }

        return captcha.toString();
    }
}
