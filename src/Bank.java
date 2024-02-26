import javax.swing.plaf.SplitPaneUI;

public class Bank {
    private double balance;

    public void checkBalance(){
        System.out.println("Your balance is: " + balance);
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("You transferred: " +"$" + balance);
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance-=amount;
            System.out.println("You accepted " + balance + "$");
        }else{
            System.out.println(" Недостаточно средств: ");
        }
    }
    public void transaction(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println(amount);
            System.out.println("You transferred to Another person: " + balance);
        }else{
            System.out.println(" Недостаточно средств: ");
        }
    }

}

