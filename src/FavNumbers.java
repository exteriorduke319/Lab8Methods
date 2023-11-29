import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner outkast = new Scanner(System.in);

        int favInt = InputHelper.getInt(outkast, "Enter your favorite int: ");
        double favDouble = InputHelper.getDouble(outkast, "Enter your favorite double");

        System.out.println("Your favorite int is " + favInt + " and your favorite double is " + favDouble + ".");

    }
}
