package Day_30_;

import java.util.ArrayList;

public class Arrli_3 {
    public static void main(String[] args) {
        //get()   indexOf()    lastIndexOf()
        ArrayList<String> names=new ArrayList<>();
        names.add("Ahmet");
        names.add("Mustafa");
        names.add("Talip");
        names.add("Alparslan");
        names.add("İhsan");
        names.add("Talha");
        names.add("Bilge");
        names.add("Bahar");
        names.add("Hatice");
        names.add("Çiğdem");
        System.out.println("names.size() = " + names.size());

        for(String str:names){
            System.out.print(str  + " ");
        }

        System.out.println();
         for(int i=0;i<names.size();i++){
     System.out.print(names.get(i)+" ");
         }


        System.out.println("\names.get(0) = " + names.get(0));

        int alparslan= names.indexOf("Alparslan");
        System.out.println("alparslan = " + alparslan);

        names.add("Hasan");
        System.out.println("names = " + names);

        names.set(3,"Hasan");
        System.out.println("names = " + names);
        System.out.println("names.indexOf(\"Hasan\") = " + names.indexOf("Hasan"));

        System.out.println("names.lastIndexOf(\"Hasan\") = " + names.lastIndexOf("Hasan"));

        names.remove("Hasan");
        System.out.println("names = " + names);
        names.remove("Hasan");
        System.out.println("names = " + names);
    }
}
