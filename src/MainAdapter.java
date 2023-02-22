public class MainAdapter {
    public static void main(String[] args) {

        // Object for Xpay
        Xpay xpay = new XpayImpl();


        xpay.setCreditCardNo("4789565884102355");
        xpay.setCustomerName("Mosine HAJJAR");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);


        PayD payD = new XpayToPayDAdapter(xpay);


        testPayD(payD);
    }

    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount() + "DH");
    }
}
