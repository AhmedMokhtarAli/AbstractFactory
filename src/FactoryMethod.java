public class FactoryMethod {
    public static void main(String[] args) {
        BankFactory factory=new FristBankFactory();
        Bank bank=factory.getBank("901");
        System.out.println(bank.getCash());
    }
}
