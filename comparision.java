package comparision;
import java.util.Scanner;
import java.lang.Double;
public class comparision {
	public static void main(String[] args){
				int x1,x2,y1,y2;
				int p1,p2,q1,q2;
				double distance1;
				double distance2;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter x1 point:");
				x1=sc.nextInt();
				System.out.println("enter x2 point:");
				x2=sc.nextInt();
				System.out.println("enter y1 point:");
				y1=sc.nextInt();
				System.out.println("enter y2 point:");
				y2=sc.nextInt();
				Scanner sc1 = new Scanner(System.in);
				System.out.println("enter p1 point:");
				p1=sc.nextInt();
				System.out.println("enter p2 point:");
				p2=sc.nextInt();
				System.out.println("enter q1 point:");
				q1=sc.nextInt();
				System.out.println("enter q2 point:");
				q2=sc.nextInt();
				distance1=Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
				distance2=Math.sqrt(Math.pow(p2-p1,2)+ Math.pow(q2-q1,2));
				System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")"+"is"+" " + distance1);
				System.out.println("distancebetween"+"("+p1+","+q1+"),"+"("+p2+","+q2+")"+"is"+" " + distance2);
				Double obj1 = distance1;
				Double obj2 = distance2;
				int val = Double.compare(obj1, obj2);
			    System.out.println(val);
			      if(val > 0)
			      {
			         System.out.println("distance1 is greater than distance2");
			      } 
			      else if(val < 0) 
			      {
			        System.out.println("distance1 is less than distance2");
			      }
			      else
			      {
			         System.out.println("distance1 is equal to distance2");
			      }
				
				
			}
}

