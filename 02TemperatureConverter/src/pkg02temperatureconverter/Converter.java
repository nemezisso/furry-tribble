package pkg02temperatureconverter;

public class Converter {
    public Converter(double celsius){
        System.out.println("Fahrenheit: "+((celsius*1.8) + 32));
        System.out.println("Kelvin: "+(celsius+273.15));
        System.out.println("Rankine: "+ ((celsius+273.15)*1.8));
        System.out.println("Réaumur: "+((celsius*4)/5));
        System.out.println("Rømer: "+(celsius*21/40+7.5));
        System.out.println("Delisle: "+(100-celsius)*3/2);
        System.out.println("Newton: "+celsius*33/100);
    }
}
