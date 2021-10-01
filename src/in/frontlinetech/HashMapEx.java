package in.frontlinetech;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map m = new LinkedHashMap();
        for(int i = 0 ;i<1000;i++)
        m.put(String.valueOf(i),"val "+(i));
        m.replace(String.valueOf(777),"val "+(7777));
        m.forEach((k,v) ->  System.out.println("Key is "+k+" Value is "+v));
        if(m.containsKey("7777"))
        System.out.println("Found Match "+m.get("777"));
        else
            System.out.println("No Match Found ");
        System.out.println("Size  "+m.size());

        System.gc();

    }
}
