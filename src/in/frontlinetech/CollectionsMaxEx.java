package in.frontlinetech;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsMaxEx implements Comparable {


    public static <T> void main(String[] args) {
        List<Product> pl = new LinkedList<>();
        pl.add(new Product(1,"AC",25000,35000,33));
        pl.add(new Product(1,"TV",35000,45000,43));
        pl.add(new Product(1,"Oven",15000,25000,23));

        String[] sar= {"Zulu","Amy","1000","Erica"};

        ArrayList<String> pal= new ArrayList<>();
        pal.add("Amy");
        pal.add("1000");
        pal.add("Zulu");
        pal.add("Erica");


        List<String> l = new LinkedList<>();
        l.add("Amy");
        l.add("Zulu");
        l.add("1000");
        l.add("0");

        List l2 = l;
        Collections.sort(l2);
        //Collections.sort(pl);

        pl.sort(Comparator.comparingDouble(Product::getPsp).reversed());
 System.out.println(pl);


    }
    public static <T extends Comparable> T max(Collection<T> c)
    {
        if (c.isEmpty()) throw new NoSuchElementException();
        Iterator<T> iter = c.iterator();
        T largest = iter.next();
        while (iter.hasNext())
        {
            T next = iter.next();
            if (largest.compareTo(next) < 0)
                largest = next;
        }
        return largest;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
