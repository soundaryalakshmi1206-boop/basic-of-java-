import java.util.Scanner;
public class q{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int prime  = sc.nextInt();
        boolean isprime = true;
        for(int i = 2;i <=Math.sqrt(prime);i++){
         if(prime%i==0) {
            isprime = false;
            break;
         }  
        }
        if(isprime){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }}}
