import java.util.Scanner;
 class ac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int weekno = sc.nextInt();
        if(weekno == 1){
            System.out.println("monday");
        }
        else if(weekno == 2){
            System.out.println("Tuesday");
        }
        else if(weekno == 3){
            System.out.println("Wednesday");
        }
        else if(weekno == 4){
            System.out.print("Thursday");
        }
         else if(weekno == 5){
            System.out.println("Friday");
        }
        else if(weekno == 6){
            System.out.println("Saturday");
        }
        else if(weekno == 4){
            System.out.println("Sunday");}
        else{
            System.out.println("invalid");
        }
    }
}
    
