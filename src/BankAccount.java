import java.util.Scanner;


public class BankAccount {
    public static void main(String[] args) {
        String name="Jane Doe";
        int accnum = 00012345;

        Scanner input = new Scanner(System.in);

        while(name== "Jane Doe"){
            System.out.print("Please enter your name:");
            name = input.nextLine();

            if(name == "Jane Doe"){
                 System.out.println("Error!-Please try Again:");

                break;
            }
            else {
                System.out.println("Welcome please enter your account number: ");

            }
        }
       while(accnum == 00012345){
           System.out.print("Please enter your account number: ");
           accnum = input.nextInt();
           if(accnum == 00012345){
               System.out.println("Error!- Please try again:");
               break;
           }
           else{
               System.out.println("Welcome to the system!");
           }

       }
    }

  public class Transactable{
      public void lodge(){
          System.out.println("Please enter amount you would like to lodge: ");
      }
  public void withdraw(){

  }
    }
public class Taxable{
        public void calcPay(){


        }
}
}
