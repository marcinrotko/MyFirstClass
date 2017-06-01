/**
 * Created by rotkom on 2017-06-01.
 */
public class WireTransfer {

    //the WireTransfer class has two fields
    public String bankAccount;
    public double amount;
    public String title;

    //the WireClass has one contructor
    public WireTransfer( String enterBankAccount, double enterAmount, String enterTitle) {
        bankAccount = enterBankAccount;
        title = enterTitle;
        amount = enterAmount;
    }

    public WireTransfer(double title, double amount) {
    }

    //the WireTransfer class has method
    public String printWireTransfer(){
        return "Number the bank account is: " + bankAccount + "\nTitle is: " + title + "\nAmount is: " + amount;

    }


}
