package ru.mirea.lab16;

public class ex1 {
    public void exceptionDemo(){
        System.out.println(2/0);
    }
    public void exceptionDemo2(){
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        ex1 e1 = new ex1();
        e1.exceptionDemo2();
        e1.exceptionDemo();

    }
}
