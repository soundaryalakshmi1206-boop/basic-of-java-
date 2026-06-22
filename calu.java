import java.util.Scanner;
public class calu { 
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        
        System.out.println("input of the first one:");
        int a = n.nextInt();
        System.out.println("input of the second one:");
        int b = n.nextInt();
        System.out.println("input of the third one:");
        int c = n.nextInt();
         int sum = a+b+c;
         float result = sum / 3;
         System.out.println(result);




        

    }
    
}
