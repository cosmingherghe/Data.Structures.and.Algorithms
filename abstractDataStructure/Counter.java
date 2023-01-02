package abstractDataStructure;

public class Counter {

  private String name;
  private int counter;

  public Counter(String str) { //Name of the instance
    this.name = str;
    this.counter = 0;
  }
  
  public void increment() {
    this.counter++;
  }

  public int getCounter() {
    return counter;
  }

  @Override
  public String toString() {
    return "Counter [name=" + name + ", counter=" + counter + "]";
  }

  public int GetElement(int elements[], int i) {
    return elements[i];
  }
}