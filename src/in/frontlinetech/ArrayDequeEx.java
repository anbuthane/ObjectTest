package in.frontlinetech;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeEx {



    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(new Product(1,"AC",25000,35000,33));
        ad.addLast(new Product(1,"TV",35000,45000,43));
        ad.addFirst(new Product(1,"Oven",15000,25000,23));


        Iterator it = ad.iterator();
        while(it.hasNext())
        {
            System.out.println( it.next());
        }
        /*for (Object p:ad) {
            System.out.println(p);
        }*/
    }
}
