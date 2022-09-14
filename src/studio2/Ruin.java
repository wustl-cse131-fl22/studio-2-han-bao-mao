
package studio2;
import java.util.Scanner;
public class Ruin {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("What is start amount?");
int start = in.nextInt();
System.out.println("What is the win chance?");
double chance = in.nextDouble();
System.out.println("What is your win limit?");
int limit = in.nextInt();


while (start<limit && start>0)
	
	{		double randomNumber = Math.random();
			boolean result = randomNumber > chance ;
		if(result==true)
		{
			start++;
			System.out.println("Win");
		}
			else
				{
			start--;
			System.out.println("lose");
				}
	}
 
	
	}


}
