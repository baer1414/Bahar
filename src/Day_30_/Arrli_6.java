package Day_30_;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Arrli_6 {
    public static void main(String[] args) {
        ArrayList<String> fruitInBasket=new ArrayList<>();
        fruitInBasket.add("elma");
        fruitInBasket.add("armut");
        fruitInBasket.add("kayısı");
        fruitInBasket.add("üzüm");
        fruitInBasket.add("erik");

        ArrayList<String> fruitInPlate=new ArrayList<>();
        fruitInPlate.add("armut");
        fruitInPlate.add("kayısı");
        fruitInPlate.add("üzüm");

       fruitInBasket.removeAll(fruitInPlate);
        System.out.println("fruitInBasket = " + fruitInBasket);

        //System.out.println("fruitInPlate.equals(fruitInBasket) = " + fruitInPlate.equals(fruitInBasket));
        //System.out.println(fruitInPlate == fruitInBasket);

        ArrayList<Integer> listOfNums=new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(200);


        printListNumbers(listOfNums);

        System.out.println("sum(listOfNums) = " + sum(listOfNums));
        System.out.println("getList(20) = " + getList(20));
        System.out.println("random(20) = " + random(20));

        ArrayList<String> stringsNums=new ArrayList<>();
        stringsNums.add("10");
        stringsNums.add("100");
        stringsNums.add("101");
        stringsNums.add("1000");

        System.out.println("tolsLis(stringsNums) = " + tolsLis(stringsNums));
        System.out.println(tolsLis(stringsNums).get(0) + tolsLis(stringsNums).get(1));
        System.out.println(Arrays.toString(tontArr(stringsNums)));


    }


    public static void printListNumbers(ArrayList<Integer> nums){

        for(Integer I:nums){
            System.out.println(I+"");
        }
    }

    public static int sum(ArrayList<Integer> nums){
         int sum=0;
        for(Integer I:nums){
            sum+=I;

        }
        return sum;
    }

public static ArrayList<Integer> getList(int i) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int j = 0; j <= i; j++) {
        list.add(j);
    }
    return list;
}


    public static ArrayList<Integer> random(int param) {
        Random rm=new Random();
        ArrayList<Integer> rmli=new ArrayList<>();
        for(int i=0;i<param;i++){
            rmli.add(rm.nextInt(param)+1);
        }
        return rmli;
    }

public static ArrayList<Integer> tolsLis(ArrayList<String> strLis){
    ArrayList<Integer> intLis=new ArrayList<>();
    for(String s:strLis){
        intLis.add(Integer.valueOf(s));


    }
    return intLis;
}

public static int[] tontArr(ArrayList<String> strl){
        int[] myArr=new int[strl.size()];
        for(int i=0;i<strl.size();i++){
            myArr[i]=Integer.parseInt(strl.get(i));
        }
       return myArr;
}




}
