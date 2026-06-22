import java.util.Scanner;
 class i {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE SHAPE NAME TO FIND THE AREA AND PERIMETER:");
        String shape = s.nextLine();
  



       
        
        
        if(shape.equals("circle") ){
                System.out.print("enter the radius value of r:");
                double r = s.nextDouble();
                double area = 3.14*r*r;
                System.out.println("THE AREA OF CIRCLE:" + area);
                double perimeter = 2*3.14*r;
                System.out.println("THE PERIMETER OF CIRCLE:" + perimeter);
        }
        else if(shape.equals("rectangle")){
                System.out.print("enter the value of l:");
                double l = s.nextDouble();
                System.out.print("enter the value of b:");
                double b = s.nextDouble();
                double a= l*b;
                System.out.println("THE AREA OF RECTANGLE:" + a);
                double p = 2*(l+b);
                System.out.println("THE PERIMETER OF RECTANGLE:" + p);
        }

        else if(shape.equals("square")){
                System.out.print("enter the value of side:");
                double side = s.nextDouble();
                double ar = side*side;
                System.out.println("THE AREA OF square:" + ar);
                double per = 4*side;
                System.out.println("THE PERIMETER OF SQUARE:" + per);
        }
        else{
                System.out.println("no shape identified");}



        }


        


    }
    

