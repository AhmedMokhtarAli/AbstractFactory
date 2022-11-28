public class FactoryMethod {
    public static void main(String[] args) {
        BankFactory factory=new FristBankFactory();
        Bank bank=factory.getBank("9012");
        System.out.println(bank.getCash());
    }
}
