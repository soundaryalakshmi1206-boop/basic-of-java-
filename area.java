import java.util.Scanner;
public class area{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        
        System.out.println("value of the lenght");
        int length = a.nextInt();
        System.out.println("value of the  breadth");
        int b = a.nextInt();
        int area = length*b;
        System.out.println(area);
    }
}