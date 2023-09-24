import java.util.Scanner;
 class BankAccount{
    private double balance;

    public BankAccount(double intialBalance){
        balance=intialBalance;
    }
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Money Deposited:" +
            amount);
        }else {
            System.out.println("Invalid amount for deposit!");
        }
    }
    public void withDraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println("Money withdraw:" + amount);
        }else{
            System.out.println("Insufficient amount for withdrawal");
        }
    }
}
class AtmInterface {
 private BankAccount account;
 private Scanner scanner;
 public AtmInterface(BankAccount account){
    this.account=account;
    scanner = new Scanner(System.in);
 }
  public void showMenu(){
    System.out.println("****Welcome****");
    System.out.println("**Menu**");
    System.out.println("1.Check Balance");
    System.out.println("2.Deposite Amount");
    System.out.println("3.Withdraw Amount");
    System.out.println("4.Exit");

  }
  public void start(){
    int choice;
    do{
        showMenu();
        System.out.print("Select the option:");
        choice = scanner.nextInt();
        switch(choice){
            case 1:checkBalance();break;
            case 2: deposit();break;
            case 3: withdraw();break;
            case 4: 
            System.out.println("Exiting ATM.Thank You!");
            break;
            default:
            System.out.println("Invalid choice. Plaese select a valid option");
        }
        } while(choice != 4);
    }

private void checkBalance(){
    System.out.println("Current Balance:" + account.getBalance());
}
private void deposit(){
    System.out.print("Enter deposit amount:");
    double amount = scanner.nextDouble();
    account.deposit(amount);
}
private void withdraw(){
    System.out.print("Enter withdrawal amount:");
    double amount = scanner.nextDouble();
    account.withDraw(amount);
}
}

