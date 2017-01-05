package pkg00namegenerator;
import java.util.Random;

public class Generator {
    private String[] maleName={"JAN","ADAM","ANDRZEJ","SŁAWOMIR"};
    private String[] femaleName={"ANNA","ELŻBIETA","ALEKSANDRA","JULIA"};
    private int choice;
    
    public void randomName(boolean a){
        Random r=new Random();
        if(a==true){
            choice=r.nextInt(4);
            System.out.println(maleName[choice]);
        }
        else{
            choice=r.nextInt(4);
            System.out.println(femaleName[choice]);        
        }
    }
}
