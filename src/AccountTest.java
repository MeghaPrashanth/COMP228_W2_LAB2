import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Account myAccount = new Account("Megha Gururaja");

        System.out.printf("Initial name is : %s%n%n",myAccount.getName());

        System.out.println("Please enter an Account name :");

       String accName = input.nextLine();

       myAccount.setName(accName);

       System.out.println();

       System.out.printf("Name of my account is : %s%n", myAccount.getName());
    }
}
