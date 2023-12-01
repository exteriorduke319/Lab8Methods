import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner methodman = new Scanner(System.in);

        double inputPrice;
        double totalPrice = 0;
        boolean doneCheck;

        do {
            inputPrice = InputHelper.getRangedDouble(methodman, "Enter the item price: ", 0.5, 9.99);
            totalPrice += inputPrice;
            doneCheck = InputHelper.getYNConfirm(methodman, "Do you want to add another item? [Y/N]");
        } while(doneCheck);

        System.out.printf("Total Cost: $%.2f", totalPrice);
    }
}
