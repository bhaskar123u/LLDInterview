/*
 * Usecase :
 * When we want N number of functionality in our different classes in same order, but their internal implementation of each functionality may differ
*/

public class Template {
    public static void main(String[] args) throws Exception {
        System.out.println("Template Design Pattern");
        System.out.println();

        PaymentFlow impl1 = new PaymentFlowImpl1();
        impl1.actualMethod();
        System.out.println();

        PaymentFlow impl2 = new PaymentFlowImpl2();
        impl2.actualMethod();
    }
}
