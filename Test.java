/**
 * Created by rotkom on 2017-06-01.
 */
public class Test {
    public static void main(String[] args) {
        double amount = 199;
        String title = "Przelew do ZUSu";
        WireTransfer przelew = new WireTransfer("", amount, title); // dodaj więcej pól do konstruktora
        System.out.println(przelew.printWireTransfer());
    }
}