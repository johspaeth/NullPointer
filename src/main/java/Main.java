
public class Main {
  public static void main(String... args) {
    NullPointerTargetMaintainAndDeleted.A a = new NullPointerTargetMaintainAndDeleted.A();
    a.bad();

    NullPointerTargetAdded.A t = new NullPointerTargetAdded.A();
    t.bad();

    Unchanged unchanged = new Unchanged();
    unchanged.doOperation();
  }
}
