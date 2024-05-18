public class Main {
    public static void main(String[] args) {
        Account Vasya = new Account(325874 );
        Account Petya = new Account(0, "Petr");
        Account Misha = new Account(500);
        Bank cashier = new Bank();
        cashier.transfer(Vasya.getAccNumber(), Petya.getAccNumber(), 5000);









   }
}
