package monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("First monster's name:: ");
                String n = keyboard.next();
                System.out.print("First monster's size:: ");
                int s = keyboard.nextInt();
                keyboard.nextLine();
		//instantiate monster one
		Skeleton m1 = new Skeleton(n, s, 1);
		//ask for name and size
		System.out.print("Second monster's name:: ");
                String n2 = keyboard.next();
                System.out.print("Second monster's size:: ");
                int s2 = keyboard.nextInt();
                keyboard.nextLine();
		//instantiate monster two
                Zombie m2 = new Zombie(n2, s2, 1);
                
                System.out.println("\n");
                System.out.println(m1.toString());
                System.out.println(m2.toString());
                System.out.println("\n");
                
                if(m1.isBigger(m2)){
                    System.out.println(m1.getName() + " is bigger than " + m2.getName());
                }else{System.out.println(m2.getName() + " is bigger than " + m1.getName());}
                if(m1.namesTheSame(m2)){
                    System.out.println(m1.getName() + " has the same name as " + m2.getName());
                }else{System.out.println(m1.getName() + " does not have the same name as " + m2.getName());}
                
	}
}