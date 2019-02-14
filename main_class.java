package JavaSteps;

import javax.swing.JOptionPane;

public class main_class extends Mouse_class{
	
	public static void main(String []args)
	{
		System.out.println("  *                Welcome to 4th Source's BANDERSMOUSE                   *");
		System.out.println("  *     You will have to find the dungeon's mouse before it finds you >:) *");
		System.out.println("  *                           RULES OF THE GAME                           *");
		System.out.println("  *You will enter 2 digits as coordenates, like this: 2,2                 *");
		System.out.println("  *You will have 5 tries only, if you miss 6 times, it will get you!!     *");
		System.out.println("  *There are several sizes for your dungeon: 3x3, 5x5, 10x10 and custom size  *");
		System.out.println("  *Remember: bigger dungeon, bigger trouble!                              *");
		System.out.println("  *                                MENU                                   *");
		System.out.println("1: 3x3");
		System.out.println("2: 5x5");
		System.out.println("3: 10x10");
		System.out.println("4: Customized dungeon");
		String finalans;
		int wins = 0;
		int lost = 0;
		do 
		{
		int answer = Integer.parseInt(JOptionPane.showInputDialog(" Please choose the size of the dungeon" ));
		
		switch (answer){
		case 1:
		{	int c1 = 5;
			int c2 = 0;
		do
		{
			Mouse_class obj2 = new Mouse_class();
			Cat_class obj1 = new Cat_class();
			obj2.hidemouse3x3();
			System.out.println("Please input 2 numbers from 0 to 3");
			int ans1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first digit"));
			int ans2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second digit"));
		if (obj1.catchmouse(ans1, ans2) == true)
			{
				System.out.println("Congratulations, you WIN!");
				c2++;
				wins++;	
			}
		else if (c1 == 0)
		{
			System.out.println("You LOST!");
			lost++;
			break;
		}
			else
			{
				System.out.println("ERRRR, keep trying!");
				c1--;
				System.out.println("You have " +(c1)+" opportunities left!");
			}
		} 
		while (c1<5 && c2==0);
		}
			break;
		
		case 2:
		{	int c1 = 5;
			int c2 = 0;
		do
		{
			Mouse_class obj2 = new Mouse_class();
			Cat_class obj1 = new Cat_class();
			obj2.hidemouse5x5();
			System.out.println("Please input 2 numbers from 0 to 5");
			int ans1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first digit"));
			int ans2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second digit"));
		if (obj1.catchmouse(ans1, ans2) == true)
			{
				System.out.println("Congratulations, you WIN!");
				c2++;
				wins++;
			}
		else if (c1 == 0)
		{
			System.out.println("You LOST!");
			lost++;
			break;
		}
		else
			{
				System.out.println("ERRRR, keep trying!");
				c1--;
				System.out.println("You have " +(c1)+" opportunities left!");
			}
		} 
		while (c1<5 && c2 == 0);
		}
			break;
		
		case 3:
		{	int c1 = 5;
			int c2 = 0;
		do
		{
			Mouse_class obj2 = new Mouse_class();
			Cat_class obj1 = new Cat_class();
			obj2.hidemouse10x10();
			System.out.println("Please input 2 numbers from 0 to 10");
			int ans1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first digit"));
			int ans2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second digit"));
		if (obj1.catchmouse(ans1, ans2) == true)
			{
				System.out.println("Congratulations, you WIN!");
				c2++;
				wins++;
			}
		else if (c1 == 0)
		{
			System.out.println("You LOST!");
			lost++;
			break;
		}
		else
			{
				System.out.println("ERRRR, keep trying!");
				c1--;
				System.out.println("You have " +(c1)+" opportunities left!");
			}
		} 
		while (c1<5 && c2 == 0);
		}
			break;
		
		case 4:
		{	int c1 = 5;
			int c2 = 0;
		do
		{
			Mouse_class obj2 = new Mouse_class();
			Cat_class obj1 = new Cat_class();
			System.out.println("Enter the size of your customized dungeon");
			int custom1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first digit"));
			int custom2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second digit"));
			obj2.hidemousecustom(custom1, custom2);
			System.out.println("Please input 2 numbers from 0 to 10");
			int ans1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first digit"));
			int ans2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second digit"));
		if (obj1.catchmouse(ans1, ans2) == true)
			{
				System.out.println("Congratulations, you WIN!");
				c2++;
				wins++;
			}
		else if (c1 == 0)
		{
			System.out.println("You LOST!");
			lost++;
			break;
		}
		else
			{
				System.out.println("ERRRR, keep trying!");
				c1--;
				System.out.println("You have " +(c1)+" opportunities left!");
			}
		} 
		while (c1<5 && c2 == 0);
		}
			break;
		
		}
		finalans = JOptionPane.showInputDialog("Want to keep playing? Y/N");
		} 
		while (finalans.equalsIgnoreCase("y"));
		
		System.out.println("GAME OVER");
		System.out.println("You won " + wins + " times!");
		System.out.println("You lost "+ lost + " times!");
		
	}
}
