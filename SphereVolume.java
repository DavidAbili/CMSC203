import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//initializes variables 
		double diam;
		double rad;
		double volume;
		//prints purpose of the program
		System.out.println("The purpose of this progam is to ");;
		System.out.println("find the volume of a sphere");
		// prompts the user for input
		System.out.println("Enter the diameter:");
		//stores user input
		diam = input.nextDouble();
		rad = diam/2;
		//calculates the volume of a sphere
		volume = (4.0/3)*Math.PI * Math.pow(rad, 3);
		// prints volume
		System.out.println("Your volume is:"+ volume);


	}

}
