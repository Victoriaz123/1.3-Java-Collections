import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        // print original list
        System.out.println("Lista original: " + months);

        //Add month of August
        months.add(7, new Month("August"));

        // Print the new list
        System.out.println("Lista con Agosto: " + months);

        //Convert the Arraylist into HashSet
        HashSet<Month> newMonths = new HashSet<>(months);

        // Confirm that the HashSet does not allow duplicates and try to add August again
        newMonths.add(new Month("August"));
        System.out.println("HashSet (without duplicates): " + newMonths);


        System.out.println("Print elements with a FOR loop");
        for (Month value : newMonths) {
            System.out.println(value + " ");
        }


        System.out.println("Print elements with an iterator");
        Iterator<Month> iterator = newMonths.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
