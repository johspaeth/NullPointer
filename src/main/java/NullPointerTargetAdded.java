public class NullPointerTargetAdded {
  public static class A{
    public B uninitialized;
    
    void bad() {
      uninitialized.notify();
    }
  }
  
  public static class B{
    
  }
  
}
