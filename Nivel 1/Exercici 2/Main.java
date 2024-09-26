import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

    List<Integer> list =new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println("First list"+ list);

    List<Integer> list2= new ArrayList<Integer>();

    ListIterator<Integer>listIterator=list.listIterator(list.size());

    while (listIterator.hasPrevious()) {
          list2.add(listIterator.previous());
        }

        System.out.println("Second list in reverse order: " + list2);
        }
}
