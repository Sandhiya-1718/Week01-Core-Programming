import java.util.Arrays;
import java.util.Scanner;
public class Quadratic{
	public static double[] rootsFinder(double a, double b, double c){
       double delta=Math.pow(b,2)-4*a*c;
	   System.out.println("Delta value:"+delta);
       double[] roots;
       if(delta>0){
           roots = new double[2];
           roots[0]=(-b+Math.sqrt(delta))/(2*a);
           roots[1]=(-b-Math.sqrt(delta))/(2*a);
       }
       else if(delta==0){
           roots=new double[1];
           roots[0]=(-b)/(2*a);
       }
       else{
           roots=new double[0];
       }
       return roots;
   }
   public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   System.out.print("Enter the value of a:");
       double a=scanner.nextDouble();
	   scanner.nextLine();
       System.out.print("Enter the value of b:");
       double b=scanner.nextDouble();
	   scanner.nextLine();
       System.out.print("Enter the value of c:");
       double c=scanner.nextDouble();
	   scanner.nextLine();
	   scanner.close();
       double roots[]=rootsFinder(a,b,c);
       System.out.println("The roots are: "+Arrays.toString(roots));  
   }
}