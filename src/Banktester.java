public class Banktester {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.accounttype="Visa";
        bank.amount=25000;
        bank.Apr=0;
        bank.accountnumber=012332;
        bank.sortcode=93320;
        bank.deposit();
        bank.withdraw();
    }
}
