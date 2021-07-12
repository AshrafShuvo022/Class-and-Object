package accountdemo;

public class Account {
    
    int accountID;
    double balance;
    String transactionType;
    
    
    Account(){
    accountID=0;
    balance= -1.0;
    transactionType=null;
    
    }
    
    Account(int accountID,double balance,String transactionType)
    
    {
        this.accountID=accountID;
        this.balance=balance;
        this.transactionType=transactionType;
    }
    
    public double changeBalance(double x)
    
    {
        if("debit".equals(transactionType)){
        return balance-x;
        }
        
        else if("credit".equals(transactionType)){
        return balance+x;
        }
        else
            return 0;
    }
}

