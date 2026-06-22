import java.util.Scanner;
 class triangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of the width:");
        double width = s.nextDouble();
        System.out.print("Enter the value of the height:");
        double height = s.nextDouble();
        double area = width*height;
        double perimeter = 2*(width+height);
        System.out.println(area);
        System.out.println(perimeter);

        


    }
    
}
