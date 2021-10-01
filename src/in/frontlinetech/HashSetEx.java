package in.frontlinetech;

import java.util.*;

public class HashSetEx
{
    public static void main(String[] args) {
        SortedSet s = new TreeSet();//HashSet();
        for(int i=0;i<100000;i++)
        s.add(i);

       // Iterator it = s.iterator();
       // System.out.println(it.next());

        Comparator cmp = s.comparator();
         Iterator it = s.iterator();
         while(it.hasNext()) {
             int previous=(int) it.next();
             int current= (int) it.next();
             //System.out.println(it.next() + " Hashcode : "+it.next().hashCode());
             System.out.println(cmp.compare(current,previous));

         }


        System.out.println(s.contains(95000));
    }
}
