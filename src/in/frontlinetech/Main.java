package in.frontlinetech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
   static ArrayList<Product> pal= new ArrayList<>();
   //static LinkedList<Product> ll = new LinkedList<>();
    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Frontline Electronics :");
        admin();
        customer();
      /*  for (int i =0; i<ll.size();i++) {
            System.out.println(ll.get(i));
        }*/
       // System.out.println(ll.getLast());
        Iterator it = pal.iterator();//.descendingIterator();
        while  (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
    public static void admin()
    {

        Scanner sc = new Scanner( System.in);
        Main m = new Main();
        for(;;) {
            Product pr = new Product();
            System.out.println("Enter Product details q to exit any other key to continue.");
            String ent;
            ent = sc.next();
            if(ent.equals("q")) break;
            int currpid=pr.getPid();
            pr.setPid(currpid+1);
            System.out.println("Enter Product Name :");
            ent = sc.next();
            pr.setPname(ent);
            System.out.println("Enter Product Cost Price :");
            ent = sc.next();
            pr.setPcp(Float.parseFloat(ent));
            System.out.println("Enter Product Selling Price :");
            ent = sc.next();
            pr.setPsp(Float.parseFloat(ent));
            System.out.println("Enter Product Qty :");
            ent = sc.next();
            pr.setPqty(Integer.parseInt(ent));
            pal.add(pr);



        }

    }
    public static void customer()
    {


        System.out.println("Customer : pending");
    }
}

