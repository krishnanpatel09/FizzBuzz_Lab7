package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        for(int i=1;i<=100;i++){
            System.out.println(Fizzbuzz((i)));
        }
    }

    public static String Fizzbuzz(int n){
        if (n % 3 == 0 && n % 5 == 0)
            return "FizzBuzz";

        if (n % 3 == 0) {
            return "Fizz";
        }
         if (n % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(n);
    }
}
