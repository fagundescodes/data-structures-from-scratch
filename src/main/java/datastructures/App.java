package datastructures;

public class App {
  public static void main(String[] args) {
    MyArray<Object> list = new MyArray<>(5);
    MyArrayList<Object> arrayList = new MyArrayList<>();

    arrayList.set(1, "B");
    arrayList.set(0, "A");
    Object geted = arrayList.get(0);
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);
    list.push(5);
    Object removed = list.pop();
    Object deleted = list.delete(2);
    System.out.println(list.get(1));
    System.out.println("Removed " + removed);
    System.out.println("Deleted " + deleted);
    System.out.println("Get test " + geted);
  }
}
