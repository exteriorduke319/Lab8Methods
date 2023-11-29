import java.util.Scanner;

public class GetUsername {
    public static void main(String[] args) {
        Scanner drake = new Scanner(System.in);

        String username = InputHelper.getNonZeroLenString(drake, "Please enter your username: ");

        System.out.println("The username you entered is: " + username);
    }
}
