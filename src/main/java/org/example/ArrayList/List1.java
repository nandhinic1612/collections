package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
public class List1 {
    public static void main(String []args){
        int a[] = new int[5];   //fixed size
        ArrayList<Integer> alist=new ArrayList<Integer>();
       /* alist.add(3);
        alist.add(4);*/
        for(int i=1;i<=10;i++)
        alist.add(i);
        //add some other topics

        alist.add(10);  //supports repetation
        alist.add(10);
        System.out.println((alist));

        Iterator i=alist.iterator();
        System.out.println("using iterator");
        System.out.println(i.next());

      /*  while(i.hasNext())
        System.out.println(i.next());
*/   //iteration

        ArrayList slist=new ArrayList();
        slist.add(100);
        slist.add("ram");
        slist.add('R');
        System.out.println(slist);
        System.out.println(slist.get(1)); // array index

       slist.set(1,"sita");//update
        System.out.println(slist);

        /*slist.remove(2); //remove
        System.out.println(slist);*/

        }
    }


