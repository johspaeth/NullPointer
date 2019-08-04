public class NullPointerTargetMaintainAndDeleted {
  public static class A{
    public B uninitialized;
    
    void bad() {
      uninitialized.notify();
    }
  }
  
  public static class B{
    
  }
  
  public static class Removed{
    public B uninitialized;
    
    void bad() {
      uninitialized.notify();
    }
  }
}
