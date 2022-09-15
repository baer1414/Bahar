package Day_29;

public class WraperC_tas {
    public static void main(String[] args) {
String str="A number is a mathematical object used to count, measure, and label. The original " +
        "examples are the natural numbers 1, 2, 3, 4, and so forth ";

        String empty="";
        int sum=0;
        for(int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
               sum+= Integer.parseInt(str.charAt(i)+"");
                empty+=str.charAt(i);

            }

        }

        System.out.println("empty = " + empty);
        System.out.println("sum = " + sum);


    }
}
