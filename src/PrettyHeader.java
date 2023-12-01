import java.util.Scanner;
public class PrettyHeader {
    public static void main(String[] args) {
        Scanner mariahcarey = new Scanner(System.in);

        System.out.println("Please enter a message");
        String message = mariahcarey.nextLine();
        InputHelper.prettyHeader(message);


    }
}
