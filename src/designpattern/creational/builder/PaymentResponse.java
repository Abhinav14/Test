package designpattern.creational.builder;

public class PaymentResponse {
    private final String transactionId;
    private final double amount;
    private final String status;
    private final String currency;
    private final String bankName;
    private final String vpa;

    private PaymentResponse(Builder builder){
        this.transactionId = builder.transactionId;
        this.amount = builder.amount;
        this.status = builder.status;
        this.currency = builder.currency;
        this.bankName = builder.bankName;
        this.vpa = builder.vpa;
    }

    public static class Builder{
        private final String transactionId;
        private final double amount;
        private final String status;
        private String currency;
        private String bankName;
        private  String vpa;

        public Builder(String transactionId, double amount, String status){
            this.transactionId = transactionId;
            this.amount = amount;
            this.status = status;
        }

        public Builder currency(String currency){
            this.currency = currency;
            return this;
        }

        public Builder bankName(String bankName){
            this.bankName = bankName;
            return this;
        }

        public Builder vpa(String vpa){
            this.vpa = vpa;
            return this;
        }

        public PaymentResponse build(){
            return new PaymentResponse(this);
        }

        }

    @Override
    public String toString() {
        return "PaymentResponse{" +
                "transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", currency='" + currency + '\'' +
                ", bankName='" + bankName + '\'' +
                ", vpa='" + vpa + '\'' +
                '}';
    }
}

