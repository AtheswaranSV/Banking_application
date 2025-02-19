import java.util.*;
public class bank{
    public static void main(SDtring args[]){
        Scanner in=new Scanner(Sysstem.in);
        System.out.println("Enter Account number: ");
        String acno =in.nextLine();
        System.out.println("Enter Account holder name: ");
        String acname=in.next();

        account ac=new account(acno,acname);

        while(true){
            System.out.println("Banking menu");
            System.out.println("1.Checking balance");
            System.out.println("2.Deposit money");
            System.out.println("3.Withdraw money");
            System.out.println("4.Exit");

            int ch=in.nextInt();
            switch(ch){
                case 1->{System.out.println("Balance : "+ac.getbalance());}
                case 2->{System.out.println("Enter amount to Deposit : "); double da =in.nextDouble();ac.deposit(da);}
                case 3->{System.out.println("Enter amount to Withdraw : "); double dw =in.nextDouble();ac.withdraw(dw);}
                 case 4->{System.out.println("Exiting.........");in.close();}
                 default->{System.out.println("IInvalid choice");}
            }
        }
    }
}
class account{
    private String acno;
    private String acname;
    private double balance;

    public account(String acno,String acname){
        this.acno=acno;
        this.acname=acname;
        double balance=0.0;
    }
    public String getacno(){
        return acno;
    }
    public String getacname(){
        return acname;
    }
    public double getbalance(){
        return balance;

    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Deposited:"+amount);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0&&balance>=amount){
            balance=balance-amount;
            System.out.println("Withdraw: "+amount);
        }
        else{
            System.out.println("Invalid withdrawal amount");
        }
    }
}
