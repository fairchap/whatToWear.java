import java.util.Scanner;
import java.util.ArrayList;

/**
 * Program that decides what you should wear (at least that's what you think...)
 * @author Austin Fairchild
 */
public class whatToWear
{
	//creating the method
	public static void main(String[] args)
	{
		//counters for rating
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;

		//asking about weather
		//Scanner sc is creating the scanner keyboard for user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Is it sunny, cloudy, raining or snowing?");
		String weather = sc.nextLine();
		System.out.print(weather);

		//comparing what the user says
		if (weather.equals("sunny") || weather.equals("Sunny"))
		{
			counter1++;
			
		}

		else if (weather.equals("cloudy") || weather.equals("Cloudy"))
		{
			counter2++;
		}

		else if (weather.equals("raining") || weather.equals("Raining"))
		{
			counter3++;
		}

		else if (weather.equals("snowing") || weather.equals("Snowing"))
		{
			counter4++;
		}

		
		

		//asking about temperature
		System.out.print("Is it hot, warm, cold or freezing?");
		Scanner sc2 = new Scanner(System.in);
		String temp = sc2.nextLine();


		if (temp.equals("hot") || temp.equals("Hot"))
		{
			counter1++;
		}

		else if (temp.equals("warm") || temp.equals("Warm"))
		{
			counter2++;
		}

		else if (temp.equals("cold") || temp.equals("Cold"))
		{
			counter3++;
		}

		else if (temp.equals("freezing") || temp.equals("Freezing"))
		{
			counter4++;
		}

		

		//asking what season it is
		System.out.print("Is it winter, spring, summer or fall?");
		Scanner sc3 = new Scanner(System.in);
		String season = sc3.nextLine();

		if (season.equals("summer") || season.equals("Summer"))
		{
			counter1++;
		}

		else if (season.equals("spring") || season.equals("Spring"))
		{
			counter2++;
		}

		else if (season.equals("fall") || season.equals("Fall"))
		{
			counter3++;
		}

		else if (season.equals("winter") || season.equals("Winter"))
		{
			counter4++;
		}

		

		//asking about location
		System.out.print("Are you at the beach, mountains, city or countryside?");
		Scanner sc4 = new Scanner(System.in);
		String location = sc4.nextLine();

		if (location.equals("beach") || location.equals("Beach"))
		{
			counter1++;
		}

		else if (location.equals("city") || location.equals("City"))
		{
			counter2++;
		}

		else if (location.equals("countryside") || location.equals("Countryside"))
		{
			counter3++;
		}

		else if (location.equals("mountains") || location.equals("Mountains"))
		{
			counter4++;
		}

		

		//asking about skin pigment
		System.out.print("Is your skin color pale, tan, olive or dark?");
		Scanner sc5 = new Scanner(System.in);
		String skin = sc5.nextLine();


		if (skin.equals("dark") || skin.equals("Dark"))
		{
			counter1++;
		}

		else if (skin.equals("tan") || skin.equals("Tan"))
		{
			counter2++;
		}

		else if (skin.equals("olive") || skin.equals("Olive"))
		{
			counter3++;
		}

		else if (skin.equals("pale") || skin.equals("Pale"))
		{
			counter4++;
		}
		

		if (counter1 >= counter2 
			&& counter1 >= counter3 && counter1 >= counter4)
		{
			System.out.print("Chill, you need a margarita!");
		}

		if (counter2 >= counter1 && counter2 >= counter3 
			&& counter2 >= counter4)
		{
			System.out.print("Dont ruin a good today by thinking about a bad yesterday");
		}

		if (counter3 >= counter1 && counter3 >= counter2 
			&& counter3 >= counter4)
		{
			System.out.print("I cannot help you, I am just a computer system");
		}

		if (counter4 >= counter1 && counter4 >= counter2 
			&& counter4 >= counter3)
		{
			System.out.print("You probably should have been a mountain goat");
		}





	}



}