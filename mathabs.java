import java.util.Scanner;

public class mathabs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("inpur a number:");
        float input = sc.nextFloat();
        if(input>0)
        {
          if(input<1){
            System.out.println("Positive Small number");}
        
           else if(input > 1000000){
            System.out.println("Large positive number");
         }
        
           else {
            System.out.println("positive number");}
        }
        else if(input < 0)
        {
            if(Math.abs(input)>1){
            System.out.println("Negataive small number");}
            else if(Math.abs(input)< 1000000){
                System.out.println("Negative large number");
            }
            else{
                System.out.println("Negative number");
            }
        }
        
        else{
            System.out.println("Zero");
           }
        }

        

              
        

    }
