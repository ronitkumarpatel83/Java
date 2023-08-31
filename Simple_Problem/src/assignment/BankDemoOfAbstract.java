package assignment;

// Abstract base class
abstract class Bank {
    abstract double calculateLoanInterest(double amount);
    abstract double calculateDepositInterest(double amount);
}

// Child class Sbi_bank
class SbiBank extends Bank {
    @Override
    double calculateLoanInterest(double amount) {
  
        return amount * 0.08;
    }

    @Override
    double calculateDepositInterest(double amount) {
        
        return amount * 0.06;
    }
}

// Child class Axis_bank
class AxisBank extends Bank {
    @Override
    double calculateLoanInterest(double amount) {
        
        return amount * 0.09;
    }

    @Override
    double calculateDepositInterest(double amount) {
        
        return amount * 0.07;
    }
}

// Child class Icici_bank
class IciciBank extends Bank {
    @Override
    double calculateLoanInterest(double amount) {
        
        return amount * 0.07;
    }

    @Override
    double calculateDepositInterest(double amount) {
       
        return amount * 0.05;
    }
}

public class BankDemoOfAbstract {
    public static void main(String[] args) {
        Bank sbiBank = new SbiBank();
        Bank axisBank = new AxisBank();
        Bank iciciBank = new IciciBank();

        double loanAmount = 100000;
        double depositAmount = 50000;

        System.out.println("SBI Bank - Loan Interest: " + sbiBank.calculateLoanInterest(loanAmount));
        System.out.println("SBI Bank - Deposit Interest: " + sbiBank.calculateDepositInterest(depositAmount));

        System.out.println("Axis Bank - Loan Interest: " + axisBank.calculateLoanInterest(loanAmount));
        System.out.println("Axis Bank - Deposit Interest: " + axisBank.calculateDepositInterest(depositAmount));

        System.out.println("ICICI Bank - Loan Interest: " + iciciBank.calculateLoanInterest(loanAmount));
        System.out.println("ICICI Bank - Deposit Interest: " + iciciBank.calculateDepositInterest(depositAmount));
    }
}


