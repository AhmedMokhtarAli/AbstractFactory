public interface IPayment {
    public String getPayment();
    public class VisaCard implements IPayment{

        @Override
        public String getPayment() {
            return "Payment done by visa card";
        }
    }
    public class MasterCard implements IPayment
    {

        @Override
        public String getPayment() {
            return "Payment done by master card";
        }
    }
}
