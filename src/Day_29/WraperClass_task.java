package Day_29;

public class WraperClass_task {
    public static void main(String[] args) {
        String str="^+!j4546*/-a_|v-:!a???()&+";
        String empty="";
        for(int i=0; i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
                empty+=str.charAt(i);
            }

        }

        System.out.println("empty = " + empty);






    }
}
