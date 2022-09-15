package Day_35;

public class ParentChildTest {
    public static void main(String[] args) {
        childClass cd=new childClass();
       //cd.print_message_P();
       cd.print_message_C();

       ParentClass parentClass=new ParentClass();
       parentClass.print_message_P();
    }
}
