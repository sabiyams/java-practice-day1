class BankAccount{
    private double balance;
    //consturctor
    public BankAccount(double initialnalance){
        if(balance>=0){
            balance=initialnalance;
        }else{
            System.out.println("balace cannot be negative");
        }
    }
    //getter
    public double getbalance(){
            return balance;
    }
    //deposite
    public void deposite(double amount){
        if(amount>=0){
            balance+=amount;
            System.out.println(amount);
        }else{
            System.out.println("deposite cannot be negative");
        }
    }
    //withdraw
    public void withdraw(double amount){
        if(amount>=0 && amount<=balance){
            balance-=amount;
            System.out.println(amount);
        }else{
            System.out.println("withdraw cna not be negative");
        }
    }
}
public class encapsulation {

    public static void main(String[] args) {
        BankAccount obj=new BankAccount(2000);
        obj.deposite(100);
        obj.withdraw(500);
        System.out.format("total balance:"+obj.getbalance());
    }
}