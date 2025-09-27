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
    System.out.println(list.get(2));
  }
}
