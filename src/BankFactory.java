public interface BankFactory {
    public Bank getBank(String id);
    public IPayment getPayment(int num);
}
