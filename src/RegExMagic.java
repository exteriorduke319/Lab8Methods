import java.util.Scanner;
public class RegExMagic {
    public static void main(String[] args) {
        Scanner gorg = new Scanner(System.in);

        String ssn = InputHelper.getRegExString(gorg, "Enter your SSN: ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.printf("Your SSN is: %s", ssn);
        System.out.println();
        System.out.println();

        String mnumber = InputHelper.getRegExString(gorg, "Enter your Student M Number: ", "(M|m)\\d{5}");
        System.out.printf("Your Student M Number is: %s", mnumber);
        System.out.println();
        System.out.println();

        String menu = InputHelper.getRegExString(gorg, "Menu:     O - Open     S - Save     V - View     Q - Quit", "[OoSsVvQq]");
        System.out.printf("You chose: %s", menu);
    }
}
