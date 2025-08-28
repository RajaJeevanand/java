import java.util.Scanner;

public class IfStatment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        //GROUP 1
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("Your name is empty!");
        } else {
            System.out.println("Your name is " + name);
        }

        // GROUP 2
        System.out.print("Please enter your age: ");
        age = sc.nextInt();

        if (age >= 65) {
            System.out.println("You are senior!");
        } else if (age >= 18) {
            System.out.println("You are a adult!");
        } else if (age <= 0) {
            System.out.println("You are a child!");
        } else {
            System.out.println("You are a new born baby!");
        }

        //GROUP 3
        System.out.println("Are you student true/false");
        isStudent = sc.nextBoolean();
        if(isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }

        sc.close();
    }
}
