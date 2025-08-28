import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // SHOPPING CART PROGRAM

        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency;
        double  total;

        System.out.print("what item would you like to buy?: ");
        item = sc.next();
        System.out.print("what is the price for each?: ");
        price = sc.nextDouble();
        System.out.print("what is the quantity for the item?: ");
        quantity = sc.nextInt();

        total = price * quantity;
        System.out.println("Your total is $" + total);

        sc.close();
    }

}
