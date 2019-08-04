public class Unchanged {
  Object field;
  public Unchanged() {
    this.field = null;
  }
  
  public void doOperation(){
    this.field.notify();
  }
  
}
