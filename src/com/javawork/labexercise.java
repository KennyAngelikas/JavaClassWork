package JavaClassWork.src.com.javawork;
// 1/30/22
// Kenneth Angelikas
// Lab Exercise
public class labexercise {

    static double find_tax(double subtotal, double TAX_RATE) {
        double tax = subtotal * TAX_RATE;
        return tax;
    }

    static double find_tip(double subtotal, double TIP_RATE){
        double tip = subtotal * TIP_RATE;
        return tip;
    }

    static String recipt(double subtotal, double total, double tip, double tax) {
        String order = ("Subtotal: $" + subtotal + "\n" + "Tax: $" + tax + "\n" + "Tip: $"  + tip + "\n" + "Total: $" + total);
        return order;
    }

    public static void main(String[] args) {

        final double TAX_RATE = 0.08;
        double subtotal = 38 + 40 + 30;
        // find_tax(subtotal,TAX_RATE);
        double tax = find_tax(subtotal,TAX_RATE);

        final double TIP_RATE = 0.2;
        double tip = find_tip(subtotal, TIP_RATE);

        double total = subtotal + tax + tip;
        System.out.println(recipt(subtotal, total, tip, tax));

    }
}
