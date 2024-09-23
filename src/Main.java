import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Blubb> list = new ArrayList<Blubb>();
        list.add(new Blubb(12, "Ulf"));
        list.add(new Blubb(1, "Alf"));
        list.add(new Blubb(3, "Bluff"));
        list.add(new Blubb(6, "Arne"));
        list.add(new Blubb(18, "Bengt"));

        //Collections.sort(list,new SizeComparator());

        Collections.sort(list, (o1, o2) -> o1.getSize() - o2.getSize()); //lambda expression, exakt samma som ovan
        // skriv kod som sorterar list i namnordning, eller nån ordning
        Collections.sort(list, (o1, o2) -> o2.getName().charAt(0) - o1.getName().charAt(0));
        System.out.println(list);
    }

//  class SizeComparator implements Comparator<Blubb> {
//      @Override
//      public int compare(Blubb o1, Blubb o2) {
//      return o1.getSize() - o2.getSize();
//  }
//}

    class NameSizeComparator implements Comparator<Blubb> {
        @Override
        public int compare(Blubb o1, Blubb o2) {
            return o1.getName().length() - o2.getName().length();
        }
    }
}