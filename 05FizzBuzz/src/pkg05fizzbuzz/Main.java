package pkg05fizzbuzz;

public class Main {

    public static void main(String[] args) {
        int tab[]=new int[100];
        for(int i=0;i<100;i++){
            tab[i]=i+1;
            if(tab[i]%3==0)
                System.out.println("FIZZ");
            else if(tab[i]%5==0)
                System.out.println("BUZZ");
            else if(tab[i]%15==0)
                System.out.println("FIZZBUZZ");
            else
                System.out.println(tab[i]);
        }
    
    
    }
        
    
}
