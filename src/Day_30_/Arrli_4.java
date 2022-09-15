package Day_30_;

import java.util.ArrayList;
import java.util.Collections;

public class Arrli_4 {
    public static void main(String[] args) {
        // addAll()  removeAll()
        ArrayList<String> position=new ArrayList<>();
        position.add("QA");
        position.add("DEVELOPER");
        position.add("UXDESİGNER");
        position.add("DEVEPS ENGINEER");
        position.add("SCRUM MASTER");

        ArrayList<String> tools=new ArrayList<>();
        tools.add("SELENİUM");
        tools.add("JAVA");
        tools.add("FIGMA");
        tools.add("AZURE");
        tools.add("JIRA");


        position.addAll(tools);
        System.out.println("position = " + position);

        tools.addAll(position);
        System.out.println("tools = " + tools);

       // ArrayList<String> other=new ArrayList<>();
     //   other.addAll(Collections.singleton("PRODUCT OWNER"));

        //System.out.println("tools.removeAll(other) = " + tools.removeAll(other));

        tools.removeAll(position);
        System.out.println("tools = " + tools);


    }
}
