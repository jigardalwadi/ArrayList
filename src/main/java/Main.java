package main.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList list = new ArrayList();
       for(int i =0; i< 50;i++){
           list.add(i);
       }

        System.out.println(list.remove(4));
        list.printArray();
       // System.out.println(list.length);

    }
}
