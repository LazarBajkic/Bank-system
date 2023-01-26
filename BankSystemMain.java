import java.util.Scanner;

public class BankSystemMain {
    Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("===========Welcome===========");
        System.out.println("Your options are:\n1.withdraw money\n2.deposit money\n3.check balance");
        System.out.println("To choose na option,please typeout the number of the desired service: ");
        int choice=scan.nextInt();
        int accBal=0;
        
        if(choice==1&&accBal>1000){
            System.out.println("You chose to withdraw money\nHow much money wold you like to withdraw?");
            int withdrawAmnt=scan.nextInt();
            accBal=accBal-withdrawAmnt;
            System.out.println("You withdrew "+withdrawAmnt+ "\nYour current balance"+accBal);
            System.out.println("What would you like to do next?");
        }
        
        else if(choice==1&&accBal<1000){
            System.out.println("Sorry but you do not have enough money to withdraw! Please select a different option!");
                
                    choice=scan.nextInt();
                        
                    if(choice == 2){
                        System.out.println("How much money would you like to deposit?");
                        int depositAmnt=scan.nextInt();
                        accBal=depositAmnt+accBal;
                        System.out.println("You deposited: "+depositAmnt+"\nYour current balance: "+accBal);
                        System.out.println("What would you like to do now?");
                        choice=scan.nextInt();
                            }
                            else if(choice==3){
                            System.out.println("your balance is: "+accBal);
                            System.out.println("What would you like to do now?");
                            choice=scan.nextInt();
                }
            }
        
        else if(choice==2){
            
            System.out.println("How much money would you like to deposit?");
            int depositAmnt=scan.nextInt();
                accBal=depositAmnt+accBal;
                System.out.println("You deposited: "+depositAmnt+"\nYour current balance: "+accBal);
                choice=scan.nextInt();
                
                if(choice==1&&accBal>1000){
                    
                    System.out.println("You chose to withdraw money\nHow much money wold you like to withdraw?");
                    int withdrawAmnt=scan.nextInt();
                    accBal=accBal-withdrawAmnt;
                    System.out.println("You withdrew "+withdrawAmnt+ "\nYour current balance"+accBal);
                    System.out.println("What would you like to do now?");
                    choice=scan.nextInt();
                }
                else if(choice==3){
                    System.out.println("your balance is: "+accBal);
                }

            if(choice==3){
                System.out.println("your balance is: "+accBal);
                System.out.println("What would you like to do now?");
                choice=scan.nextInt();
            }
            
            else if(choice==1&&accBal>1000){
                    
                System.out.println("You chose to withdraw money\nHow much money wold you like to withdraw?");
                int withdrawAmnt=scan.nextInt();
                accBal=accBal-withdrawAmnt;
                System.out.println("You withdrew "+withdrawAmnt+ "\nYour current balance"+accBal);
                System.out.println("What would you like to do now?");
                choice=scan.nextInt();
            }
            
            else if(choice==2){
            
                System.out.println("How much money would you like to deposit?");
                depositAmnt=scan.nextInt();
                    accBal=depositAmnt+accBal;
                    System.out.println("You deposited: "+depositAmnt+"\nYour current balance: "+accBal);
                    System.out.println("What would you like to do now?");
                    choice=scan.nextInt();
        }
        
        else if(choice==3){
            System.out.println("your balance is: "+accBal);
        }

    }
    }
}
