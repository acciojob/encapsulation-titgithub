package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //   obj.name = "Shubham";
        //   System.out.println(obj.name);
        obj.setName("Abhi");
        System.out.println(obj.getName());
    }
}
  
