package pkg03calculateageinseconds;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj swój wiek: ");
        Scanner in=new Scanner(System.in);
        int age=in.nextInt();
        
        BigInteger ageInSeconds=new BigInteger("31536000"); // 31536000= 365*24*3600 
        ageInSeconds=ageInSeconds.multiply(BigInteger.valueOf(age));
        System.out.println(ageInSeconds);
    }
    
}
