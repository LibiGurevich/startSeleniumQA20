package org.example;

public class ExceptionsPractice {

    public static void main(String[] args) throws Exception {

        try {
            count();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());
        }finally{
            System.out.println("end of function");
        }

        pause();

    }

    public static void count(){
        System.out.println(9/0);
    }

    public static void pause() throws Exception{
        Thread.sleep(3000);
    }
}
