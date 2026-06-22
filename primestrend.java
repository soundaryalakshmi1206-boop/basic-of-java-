import java.util.Scanner;
public class primestrend{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start  = sc.nextInt();
        int end = sc.nextInt();
        int primecount =0;
        
        for(int i = start;i<=end;i++){
            int count = 0;
            if(i<=1){
                continue;
            }
            for(int j = 2;j<=i/2;j++){
                if(i%j==0){

                count++;
                break;
                

            }}

        
        if(count==0){
            primecount++;}}
        System.out.println("total prime number:"+primecount);
   
}}


        
