 import java.util.Scanner;
 public class calculator{
   
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
        
        
        System.out.print("Enter the operator");
        char ch =sc.next().trim().charAt(0);
    if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
        System.out.println("Enter two numbers");       int a = sc.nextInt();
            int b = sc.nextInt();
        if(ch == '+'){
            ans = a + b;
           }
           
        else if(ch == '-'){
            ans = a - b;
           } 
         else if(ch == '*'){
            ans = a - b;

           } 
         else if(ch == '/'){
            if(b != 0){
            ans = a - b;
           } }
         else if(ch == '%'){
            ans = a - b;
           } 
         else if(ch == 'x'||ch =='X'){
            break;
           } 
        else{
            System.out.println("Invalid error");
        }
    }
    System.out.println(ans);


    }
}}