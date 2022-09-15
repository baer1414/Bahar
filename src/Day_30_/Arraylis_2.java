package Day_30_;

import java.util.ArrayList;

public class Arraylis_2 {
    public static void main(String[] args) {
        //remove
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(100);
        nums.add(101);
        nums.add(190);
        nums.add(5);
        nums.add(55);
        System.out.println("nums = " + nums);

      //  while(nums.size()>1){
       //     nums.remove(1);
      //  }
       // System.out.println("nums = " + nums);


       nums.remove(1);
        System.out.println("nums = " + nums);
        nums.remove(1);
        System.out.println("nums = " + nums);
        nums.add(60);
        nums.add(200);
        System.out.println("nums = " + nums);
        System.out.println("nums.size() = " + nums.size());

        int num=5;
        Integer Num=5;
      //  nums.remove(num);
        nums.remove(Num);
        System.out.println("nums = " + nums);//10, 190, 55, 60, 200

        nums.remove(new Integer(10));
        System.out.println("nums = " + nums);
        nums.remove(Integer.valueOf(55));
        System.out.println("nums = " + nums);

        nums.remove(Integer.parseInt("1"));
        System.out.println("nums = " + nums);

        nums.clear();
        System.out.println("nums = " + nums);


    }
}
