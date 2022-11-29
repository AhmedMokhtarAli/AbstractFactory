public class FristBankFactory implements BankFactory {
    @Override
    public Bank getBank(String id) {
        switch (id) {
            case "1234":
                return new BankMasr();
            case "5678":
                return new BankAlex();
            case "9012":
                return new QNB();
        }
        return null;

    }

    @Override
    public IPayment getPayment(int num) {
        switch (num) {
            case 12:
                return new IPayment.VisaCard();
            case 34:
                return new IPayment.MasterCard();
        }
        return null;
    }
}
