import java.util.Scanner;
public class even{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int s = sc.nextInt();
   
   if(s%2==0){
    for(int i = 1;i<=s/2;i++){
        int n = i*2;
        System.out.print(n+" ");
   }}
   else{
   for(int j = 1;j<=s;j++){
    if(j%2==0){
        continue;}
    System.out.print(j+" ");
   }



   }
    }}
    
