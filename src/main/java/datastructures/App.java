package datastructures;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    MyArray<Object> list = new MyArray<>();
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(5);
    Object removed = list.pop();
    Object deleted = list.delete(2);
    System.out.println(list.get(3));
    System.out.println("Removed " + removed);
    System.out.println("Deleted " + deleted);
  }
}
