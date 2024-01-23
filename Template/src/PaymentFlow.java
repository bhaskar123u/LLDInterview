public abstract class PaymentFlow {

  public abstract void method1();
  
  public abstract void method2();
  
  public abstract void method3();
  
  public abstract void method4();

  // final method so that the order can't be changed.
  public final void actualMethod() {
    method1();
    method2();
    method3();
    method4();
  } 
}
