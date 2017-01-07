package pkg02temperatureconverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj temperature w stopniach celsiusza: ");
        Scanner in=new Scanner(System.in);
        double temp;
        temp=in.nextDouble();
        Converter converter=new Converter(temp);
    }
    
    
}
