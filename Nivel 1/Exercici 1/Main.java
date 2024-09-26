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

        System.out.println("Original list " + months);

        months.add(7, new Month("August"));

        System.out.println("List with august added " + months);

        HashSet<Month> newMonths = new HashSet<>(months);

        newMonths.add(new Month("August"));
        System.out.println("HashSet without duplicates: " + newMonths);


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
