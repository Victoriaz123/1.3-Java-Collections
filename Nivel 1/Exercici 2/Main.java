import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        // create new list and insert some elements
    List<Integer> list =new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println("First list"+ list);

         // create 2nd list
    List<Integer> list2= new ArrayList<Integer>();

        //Generate an iterator to iterate List in reverse order
        ListIterator<Integer>listIterator=list.listIterator(list.size());

        //hasPrevious() returns true if the list has previous element
     while (listIterator.hasPrevious()) {
            list2.add(listIterator.previous());
        }

        // print the second list in reverse order
        System.out.println("Second list in reverse order: " + list2);
        }
}