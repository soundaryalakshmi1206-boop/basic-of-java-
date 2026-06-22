
import java.util.Scanner;
public class reversedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int original = a;
        int rev = 0;
        while(a>0){
            int last = a%10;
            rev = rev*10+last;
            a = a/10;
        }

        if(original==rev){
        System.out.println("palindrome");}
    else{
        System.out.println("not a palindrome");
    }}}
        