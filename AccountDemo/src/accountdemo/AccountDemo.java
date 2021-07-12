package accountdemo;

public class AccountDemo {

    
    public static void main(String[] args) {
        Account sai=new Account(1001,5000,"credit");
        
        System.out.println("Account ID is : "+sai.accountID);
        System.out.println("Orginal Balance : "+sai.balance);
        System.out.println("Transaction Type : "+sai.transactionType);
        System.out.println("Changed Balance : "+sai.changeBalance(50));
    
        
    }
    
}
