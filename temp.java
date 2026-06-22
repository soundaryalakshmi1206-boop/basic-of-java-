import java.util.Scanner;
public class temp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value a:");
        int a = sc.nextInt();
        System.out.print("enter the value b:");
        int b = sc.nextInt();
          int temp = a ;
          a = b;
          b = temp;
          System.out.print(a );
          System.out.print(b );




    }
    
}
