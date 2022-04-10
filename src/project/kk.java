package project;

import java.util.Scanner;

public class kk {
	
	public static void main(String[] args) {
		
		
		System.out.println("   ");
		
				Scanner sc=new Scanner(System.in);
				System.out.println("welcome to KANNADADA KOTYADIPATHI");
				System.out.println("enter your name");
				String name=sc.next();
				System.out.println("enter your occupation");
				String occupation=sc.next();
				System.out.println(" participant:Name:"+name+"\nOccupation:"+occupation+"");
						
				System.out.println("Money Tree:");
				System.out.println("LEVEL 1:\n1.Rs1000\n2.Rs 2000\n3.Rs 3000\n4.Rs 5000\n5.Rs 10,000\n");
				System.out.println("LEVEL 2:\n6.Rs 20,000\n7.Rs 60,000\n8.Rs 1,1,00,000\n9.Rs 3,20,000\n");
				System.out.println("LEVEL 3:\n10.Rs 25,00,000\n11.Rs 50,00,000\n12.Rs 1,00,00,000\n");

				//GAME BEGINS

				System.out.println("Let's begin the  Kannadada Kotyadipathi!!!!");
				System.out.println("1.Which of these could you order by asking for a byte.?");
				System.out.println("    1.shoes                      2.shirts\n");
				System.out.println("    3.caps                       4.coffee\n");

				System.out.println("enter your choice:");
				int n=sc.nextInt();
				if(n==4)
				{
					
					System.out.println("Congratulations!!! It's a right answere."+name);
					System.out.println("you have won Rs.1000");
				}
				else {
					System.out.println("Sorry..Better luck next time."+name);
					System.out.println("thank you for participating");
					System.exit(0);
					}

				System.out.println("2.What’s name of deity at Belur Temple.?");
				System.out.println("    1.Manjunatha                2.Bahubali\n");
				System.out.println("    3.Chennakeshava             4.Virupaksha\n");
				System.out.println("enter your choice:");
				int m=sc.nextInt();
				if(m==3)
				{
					System.out.println("Congratulations!!! It's a right answere."+name);
					System.out.println("you have won Rs.2000");
				}
				else {
					
					System.out.println("Sorry..Better luck next time."+name);
					System.out.println("thank you for participating");
					System.out.println("you have won Rs.1000");
					System.exit(0);
				}

				System.out.println("3.Which Bollywood actress made her cinematic debut in Kannada movie Prema Loka ?\n");
				System.out.println("     1.Sridevi                                2.Madhuri Dixit\n");
				System.out.println("     3.Juhi Chawla                            4.Kajol\n");
				System.out.println("enter your choice:");
				int o=sc.nextInt();
				if(o==3)
				{
					
					System.out.println("Congratulations!!! It's a right answere."+name);
					System.out.println("you have won Rs.3000");
				}
				else {
					System.out.println("Sorry..Better luck next time."+name);
					System.out.println("thank you for participating");
					System.out.println("you have won Rs.2000");
					System.exit(0);
				}

				System.out.println("Here come's your 4th question:\n");
				System.out.println( "4.Which was the first Indian film to be screened at United Nations.?");
				System.out.println("        1.Slumdog Millionaire                 2.Lagaan\n");
				System.out.println("        3.Lage Raho Munnabhai                  4.Chak De India\n");	
				System.out.println("enter your choice:");
				int p=sc.nextInt();
				if(p==3)
				{

					System.out.println("Congratulations!!! It's a right answere."+name);
					System.out.println("you have won Rs.5000");
				}
				else {
					System.out.println("Sorry..Better luck next time."+name);
					System.out.println("you have won Rs.3000");
					System.out.println("thank you for participating");
					System.exit(0);
				}

				System.out.println("5.Which was the first multinational corporation (MNC) to set-up its base in Bangalore.?");
				System.out.println("          1.IBM                         2.Cisco Systems\n");
				System.out.println("           3.Texas Instruments          4.General Electric\n");
				System.out.println("enter your choice:");
				int r=sc.nextInt();
				if(r==3)
				{

					System.out.println("Congratulations!!! It's a right answere."+name);
					System.out.println("you have won Rs.10,000");
				}
				else {
					System.out.println("Sorry..Better luck next time."+name);
					System.out.println("thank you for participating");
					System.out.println("you have won Rs.5000");
					System.exit(0);
				}
				
				
		System.out.println("LEVEL1 COMPLETED SUCCESSFULLY");
		System.out.println("If you wish to continue or quit?");
		String b=sc.next();
		 if( b.equals("quit"))
	        { 
			 System.out.println("thank you for participating");
			 System.out.println("you have won Rs.10,000");
	        	System.exit(0);
	        }
	        else
	        {

		System.out.println("6.In which of these films, Dr. Vishnuvardhan played the role of a soldier.?");
		System.out.println("          1.Jayasimha                  2.Muttina Haara\n");
		System.out.println("          3.Jananayaka                 4.Kartavya\n");
		System.out.println("enter your choice:");
		int s=sc.nextInt();
		if(s==2)
		{

			System.out.println("Congratulations!!! It's a right answere."+name);
			System.out.println("you have won Rs.20,000");
		}
		else {
			System.out.println("Sorry..Better luck next time."+name);
			System.out.println("thank you for participating");
			System.out.println("you have won Rs.10,000");
			System.exit(0);
		}

		  

		System.out.println("7.In the Mahabharata, who shot seven arrows into the mouth of a barking dog that belonged to the Pandavas to silence it.?");
		System.out.println("             1.Ekalavya                   2.Karna\n");
		System.out.println("             3.Bhishma                    4.Drona\n");
		System.out.println("enter your choice:");
		int t=sc.nextInt();
		if(t==1)
		{
			System.out.println("Congratulations!!! It's a right answere."+name);
			System.out.println("you have won Rs.60,000");
		}
		else {
			
			System.out.println("Sorry..Better luck next time."+name);
			System.out.println("you have won Rs.20,000");
			System.out.println("thank you for participating");
			System.exit(0);
		}


		System.out.println("8.Which of these was an Indian car model manufactured by Premier Automobiles Limited.?");
		System.out.println("         1.Paridhi                      2.Parineeta\n");
		System.out.println("         3.Padmavati                    4.Padmini\n");
		System.out.println("enter your choice:");
		int u=sc.nextInt();
		if(u==4)
		{
			System.out.println("Congratulations!!! It's a right answere."+name);
			System.out.println("you have won Rs.1,00,000");
		}
		else {
			System.out.println("Sorry..Better luck next time."+name);
			System.out.println("you have won Rs.60,000");
			System.out.println("thank you for participating");
			System.exit(0);
		}


		System.out.println("9.The village Sangolli, where Sangolli Rayanna was born, is situated in which district?");
		System.out.println("           1.Bijapur                   2. Bidar\n");
		System.out.println("           3.Belagavi            4. Bagalakote\n");
		System.out.println("enter your choice:");
		int v=sc.nextInt();
		if(v==3)
		{
			System.out.println("Congratulations!!! It's a right answere."+name);
			System.out.println("you have won Rs.3,20,000");
		}
		else {
			System.out.println("Sorry..Better luck next time."+name);
			System.out.println("you have won Rs.1,00,000");
			System.out.println("thank you for participating");
			System.exit(0);
			
		}
		}
		System.out.println("LEVEL2 COMPLETED SUCCESSFULLY");
		System.out.println("If you wish to continue or quit?");
        String c=sc.next();
        if( c.equals("quit"))
        { 
        	System.out.println("thank you for participating");
        	System.out.println("you have won Rs.3,20,000");
        	System.exit(0);
        }
        else
        {

		System.out.println("10.Which poet is also known as Karnatakada Kabira.?");
		System.out.println("      1.K S Nissar Ahmad                   2.Asadulla Baig\n");
		System.out.println("      3.Shishunala Sharif                  4. S K Karim Khan\n");
		System.out.println("enter your choice:");
		int w=sc.nextInt();
		if(w==3)
		{
			System.out.println("Congratulations!!! It's a right answere."+name);
			System.out.println("you have won Rs.25,00,000");
			
		}
		else {
			System.out.println("Sorry..Better luck next time."+name);
			System.out.println("thank you for participating");
			System.out.println("you have won Rs.3,20,000");
			System.exit(0);
		}

		System.out.println("11.According to Mahabharata, who among the following is the wife of Pandu apart from Kunti.?");
		System.out.println("            1.Madri                  2.Aditi\n");
		System.out.println("            3.Gandhari               4.Satyavati\n");
		System.out.println("enter your choice:");
		int x=sc.nextInt();
		if(x==1)
		{
			System.out.println("Congratulations!!! It's a right answere."+name);
			
			System.out.println("you have won Rs.50,00,000");
		}
		else {
			System.out.println("Sorry..Better luck next time."+name);
			System.out.println("you have won Rs.25,00,000");
			System.out.println("thank you for participating");
			System.exit(0);
		}


		System.out.println("12.Whose memorial ground is called Chaityabhoomi.?");  
		System.out.println("             1.B R Ambedkar              2.Chadra Shekhar Azad\n");
		System.out.println("             3.Rajendra Prasad           4.Lala Lajpat Rai\n");
		System.out.println("enter your choice:");
		int y=sc.nextInt();
		if(y==1)
		{
			System.out.println("Congratulations!!! It's a right answere."+name);
			System.out.println("you have won Rs.1,00,00,000");
		}
		else {
			System.out.println("Sorry..Better luck next time."+name);
			System.out.println("you have won Rs.50,00,000");
			System.out.println("thank you for participating");
			System.exit(0);
		}
        }
	}
}
