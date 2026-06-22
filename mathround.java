import java.util.Scanner;
 class mathround {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input floating point number:");
        double a = sc.nextDouble();
        System.out.println("Input floating point  another number:");
        double b = sc.nextDouble();
        a = Math.round(a*1000);
        a = a/ 1000;
        b = Math.round(b*1000);
        b = b / 1000;
        if(a == b){
            System.out.println("They are the same up to three decimal places");
        }
        else{
            System.out.println("They are different");
        }
        

 

    }
    
    
}
