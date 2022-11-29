public class AbstractFactory {
    public static void main(String[] args) {
        BankFactory factory=new FristBankFactory();
        Bank bank=factory.getBank("9012");
        IPayment payment=factory.getPayment(12);
        System.out.println(bank.getCash()+"\n"+payment.getPayment());
    }
}
