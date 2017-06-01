/**
 * Created by rotkom on 2017-06-01.
 */
public class Transfer {
    public static void main(String[] args) {
        String bankAccount = "12 3456 7890 1234 5678 0090";
        double amount = 97.5;
        String title = "Przelew za przejazdy";
        WireTransfer transfer = new WireTransfer(bankAccount, amount, title); // dodaj więcej pól do konstruktora
        System.out.println(transfer.printWireTransfer());
    }
}
