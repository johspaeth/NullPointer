public class Main {
  public static void main(String... args) {
    NullPointerTargetMaintainAndDeleted.A a = new NullPointerTargetMaintainAndDeleted.A();
    a.bad();

    NullPointerTargetMaintainAndDeleted.Removed t = new NullPointerTargetMaintainAndDeleted.Removed();
    t.bad();

    Unchanged unchanged = new Unchanged();
    unchanged.doOperation();

    Object o = null;
    Object x = foo(o);
    x.notify();
  }

  public static Object foo(Object o){
  	return o;
  }
}
