import java.util.Scanner;
public class primeusingdiv
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long  count  = 0;
        if(x==1){
            System.out.println("Nor prime Neither compostive");
        }
        for(int i = 2;i<= x/2;i++){
            if(i%x==0){
                count++;
                break;
            }
            
        }
        if(count == 0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }}}
