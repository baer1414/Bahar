package Odev_;

import java.security.SecureRandom;
import java.util.Random;

public class Person_ {
  private   String name;
   protected String surName;
   int Id;
   double salary;

    public Person_(){

    }

    public Person_(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public  void numld() {
        Random random=new Random();
        this.Id=random.nextInt(100);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void start(){
        System.out.println("mesai 9:30 başlıyor");
    }
    public void Maas(){
       this.salary=salary+1200;
        System.out.println(salary);
    }
}
