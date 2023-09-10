package org.example;

public class ExceptionExample {

    public static void main(String[] args) {
//        Thread.sleep(5000);
        try {
            System.out.println(9/0);
        }catch (Exception e){
           e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());
        }finally{
            System.out.println("finally");
        }
    }
}
