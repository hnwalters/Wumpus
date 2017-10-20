/**
 * 
 * @author JGore & Hayden N. Walters
 *
 */
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class mainHunt {

	public static void main(String[] args) throws IOException
	{
		Scanner fin=new Scanner(new FileReader("rooms.txt"));
		int n=fin.nextInt();
			int [] a=new int[n];
				fin.close();
				
		System.out.println("Welcome to Hunt the Wumpus!");
		System.out.println("You are in room 1.");
		System.out.println("You have 3 arrows left.");
		
		int arrow = 3;
		
		Scanner cin=new Scanner(System.in);
		System.out.println("What will you do?");
		String command;
		
		while(true)
		{
			command = cin.nextLine();
			
			if(command.equalsIgnoreCase("Shoot"))
			{
				arrow=arrow-1;
				System.out.println("You now have " + arrow + " arrow(s) left");
				if(arrow==0)
				{
					System.out.println("You have no more arrows left. Game over!");
					break;
				}
			}
			if(command.equalsIgnoreCase("Move"))
			{
				if(move.equals("N")){
					if(x == 0)
						b = true;
					else
						x--;
				}
					
				if(move.equals("S")){
					if(x == n-1)
						b = true;
					else
						x++;
				}
					
				if(move.equals("E")){
					if(y == n-1)
						b = true;
					else
						y++;
				}
					
				if(move.equals("W")){
					if(y == 0)
						b = true;
					else
						y--;
				}
				
			}
		}
		cin.close();
	}

}
