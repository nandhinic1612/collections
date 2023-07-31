package org.example.HashMap;

import java.util.HashMap;

public class test1 {
    public static void main(String []args){
        HashMap hash =new HashMap();
        hash.put("red",23);
        hash.put("greeen", 3);
        hash.put("yellow", 6);
        System.out.println(hash);

       // System.out.println(hash.toString());
      //  System.out.println(hash.compute(key, value));

//       int newhash=hash.compute("green", (key, value) -> value - value * 10/100);
//       System.out.println(newhash);

//       int NewHash= hash.computeIfAbsent("white", (key) -> 22);
//       System.out.println(NewHash);
    }
}
