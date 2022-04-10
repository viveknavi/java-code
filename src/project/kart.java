package project;

import java.util.Scanner;

public class kart {

	public static void main(String[] args) {
		for (int i=0;i<=2;i++)
		{
			String name;
			String phnno;
			int choice;
			int electronics =1;
			int bikes=2;
			int cars =3;
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("                  ");
			System.out.println("well come to our kart");
			System.out.println("enter your name ");
			name=keyboard.next();
			System.out.println("enter your phonee number");
			phnno=keyboard.next();
			System.out.println("1.electronics");
			System.out.println("2. bikes");
			System.out.println("3. cars");
			System.out.println("enter your choice");

			choice = keyboard.nextInt();

			if (choice==1)
			{
				int mobiles=1;
				int laptop=2;
				int smartwatch=3;
				System.out.println("1.mobiles");
				System.out.println("2. laptop");
				System.out.println("3. smartwatch");

				choice = keyboard.nextInt();
				if(choice==1)
				{
					int redmi=1;
					System.out.println("1.redmi");
					int realme=2;
					System.out.println("2.realme");
					choice = keyboard.nextInt();
					if(choice==1)
					{
						System.out.println("redmi mobile comes with 4 gb ram 128gb rom 64mp camera ");
						System.out.println("it cost is rs 7000");
					}
					else if (choice==2)
					{
						System.out.println("realme mobile comes with 8 gb ram 128gb rom 64mp camera ");
						System.out.println("it cost is rs 17000");
					}
					System.out.println("do you wish to buy it?");
					if(keyboard.next().equals("yes"))
					{
						System.out.println("thank you for purchasing. come again Mr " +name);

					}
					else
					{
						System.out.println("thank you for visiting our kart "+name);
					}
				}
				else if(choice==2)
				{
					int hp=1;
					System.out.println("1.hp");
					int dell=2;
					System.out.println("2.dell");
					choice = keyboard.nextInt();
					if(choice==1)
					{
						System.out.println("hp laptop comes with 4 gb ram 1tb rom 512gb SSD ");
						System.out.println("it cost is rs 45000");
					}
					else if (choice==2)
					{
						System.out.println("dell laptop comes with 8 gb ram 1tb rom 512gb SSD 1gb graphics card ");
						System.out.println("it cost is rs 70000");
					}
					System.out.println("do you wish to buy it?");
					if(keyboard.next().equals("yes"))
					{
						System.out.println("thank you for purchasing. come again "+name);

					}
					else
					{
						System.out.println("thank you for visiting our kart "+name);
					}
				}
				else if(choice==3)
				{
					int boat=1;
					System.out.println("1.boat");
					int noise=2;
					System.out.println("2.noise");
					choice = keyboard.nextInt();
					if(choice==1)
					{
						System.out.println("boat comes with 4 inch round display with step counter and battery about 1 weak ");
						System.out.println("it cost is rs 4500");
					}
					else if (choice==2)
					{
						System.out.println("noise comes with 4 inch squre display with sleep monitoring, step counter ");
						System.out.println("it cost is rs 7000");
					}
					System.out.println("do you wish to buy it?");
					if(keyboard.next().equals("yes"))
					{
						System.out.println("thank you for purchasing. come again " +name);

					}
					else
					{
						System.out.println("thank you for visiting our kart "+name);
					}
				}
			}
			else if (choice==2)
			{
				int hero=1;
				int honda=2;
				int tvs=3;
				System.out.println("1.hero");
				System.out.println("2. honda");
				System.out.println("3. tvs");

				choice = keyboard.nextInt();
				if(choice==1)
				{
					int supersplendor=1;
					System.out.println("1.super splendor");
					int xtream=2;
					System.out.println("2.xtream");
					choice = keyboard.nextInt();
					if(choice==1)
					{
						System.out.println("super splendor comes with 110cc with mileage of 68kmpl ");
						System.out.println("it cost is rs 70000");
					}
					else if (choice==2)
					{
						System.out.println("xtream comes with 150cc with mileage of 48kmpl ");
						System.out.println("it cost is rs 145000");
					}
					System.out.println("do you wish to buy it?");
					if(keyboard.next().equals("yes"))
					{
						System.out.println("thank you for purchasing. come again " +name);

					}
					else
					{
						System.out.println("thank you for visiting our kart " +name);
					}
				}
				else if(choice==2)
				{
					int shine=1;
					System.out.println("1.shine");
					int unicorn=2;
					System.out.println("2.unicorn");
					choice = keyboard.nextInt();
					if(choice==1)
					{
						System.out.println("shine comes with 110cc with mileage of 68kmpl ");
						System.out.println("it cost is rs 125000");
					}
					else if (choice==2)
					{
						System.out.println("unicorn comes with 150cc with mileage of 48kmpl ");
						System.out.println("it cost is rs 141000");
					}
					System.out.println("do you wish to buy it?");
					if(keyboard.next().equals("yes"))
					{
						System.out.println("thank you for purchasing. come again "+name);

					}
					else
					{
						System.out.println("thank you for visiting our kart "+name);
					}
				}
				else if(choice==3)
				{
					int appachi=1;
					System.out.println("1.appachi");
					int starcity=2;
					System.out.println("2.starcity");
					choice = keyboard.nextInt();
					if(choice==1)
					{
						System.out.println("appachi comes with 160cc with mileage of 48kmpl ");
						System.out.println("it cost is rs 145000");
					}
					else if (choice==2)
					{
						System.out.println("starcity comes with 125cc with mileage of 70kmpl ");
						System.out.println("it cost is rs 70000");
					}
					System.out.println("do you wish to buy it?");
					if(keyboard.next().equals("yes"))
					{
						System.out.println("thank you for purchasing. come again " +name);

					}
					else
					{
						System.out.println("thank you for visiting our kart "+name);
					}
				}
			}
			else if (choice==3)
			{
				int mahindra=1;
				int tata=2;
				int toyata=3;
				System.out.println("1.mahindra");
				System.out.println("2. tata");
				System.out.println("3. toyata");

				choice = keyboard.nextInt();
				if(choice==1)
				{
					int xuv700=1;
					System.out.println("1.xuv700");
					int xuv500=2;
					System.out.println("2.xuv500");
					choice = keyboard.nextInt();
					if(choice==1)
					{
						System.out.println("The Mahindra XUV700 has 1 Diesel Engine and 1 Petrol Engine on offer. "
								+ "The Diesel engine is 2198 cc while the Petrol engine is 1999 cc ."
								+ " It is available with Automatic & Manual transmission.Depending upon the variant and fuel type");
						System.out.println("it cost is rs 22 lakh");
					}
					else if (choice==2)
					{
						System.out.println("XUV500 Specs, Features and Price The Mahindra XUV500 has 2 Diesel Engine and 1 Petrol Engine on offer. "
								+ "The Diesel engine is 2179 cc and 1997 cc while the Petrol engine is 2179 cc. "
								+ "It is available with Manual & Automatic transmission."
								+ "Depending upon the variant and fuel type the XUV500 has a mileage of & Ground clearance of XUV500 is 200mm.");
						System.out.println("it cost is rs 17 lakh");
					}
					System.out.println("do you wish to buy it?");
					if(keyboard.next().equals("yes"))
					{
						System.out.println("thank you for purchasing. come again "+name);

					}
					else
					{
						System.out.println("thank you for visiting our kart "+name);
					}
				}
				else if(choice==2)
				{
					int nexon=1;
					System.out.println("1.nexon");
					int altroz=2;
					System.out.println("2.altroz");
					choice = keyboard.nextInt();
					if(choice==1)
					{
						System.out.println("The Nexon is based on the revised Tata X1 platform debuted in 1998 with the Indica model "
								+ "and adopted by other Indian brand cars. It uses independent MacPherson dual-path strut with coil spring "
								+ "front suspensions and rear twist-beam with coil spring and shock absorber. The wheelbase is measured at 2,498 mm (98.3 in). ");
						System.out.println("it cost is rs 15 lakh");
					}
					else if (choice==2)
					{
						System.out.println("The all-new Altroz EV is derived from the Altroz hatchback, "
								+ "the first product built on the futuristic and versatile 'Agile Light Flexible Advanced' (ALFA) Architecture,"
								+ " and brings to life Tata Motors' radical new approach to design. The Altroz EV is a premium urban car, "
								+ "which is configured to meet the constantly evolving aspirations of customers.");
						System.out.println("it cost is rs 12 lakh");
					}
					System.out.println("do you wish to buy it?");
					if(keyboard.next().equals("yes"))
					{
						System.out.println("thank you for purchasing. come again "+name);

					}
					else
					{
						System.out.println("thank you for visiting our kart "+name);
					}
				}
				else if(choice==3)
				{
					int glanz=1;
					System.out.println("1. glanz");
					int fortuner=2;
					System.out.println("2.fortuner");
					choice = keyboard.nextInt();
					if(choice==1)
					{
						System.out.println("The new Toyota Glanza is equipped with a powerful yet fuel efficient K-series engine "
								+ " that  delivers a superior driving experience with exceptional power and low-end torque."
								+ " Giving  you all the thrills and performance you need to make your plans way more exciting.");
						System.out.println("it cost is rs 13 lakh");
					}
					else if (choice==2)
					{
						System.out.println("The Toyota Fortuner, also known as the Toyota SW4, is a mid-size SUV manufactured by "
								+ "Japanese automobile manufacturer Toyota. The Fortuner is built on the Hilux pickup truck platform."
								+ " It features two/three rows of seats and is available in rear-wheel drive or four-wheel drive configuration.");
						System.out.println("it cost is rs 43 lakh");
					}
					System.out.println("do you wish to buy it?");
					if(keyboard.next().equals("yes"))
					{
						System.out.println("thank you for purchasing. come again "+name);

					}
					else
					{
						System.out.println("thank you for visiting our kart "+name);
					}
				}System.out.println();
			}
		}
	}
}