package JAVABOOK;

public class Greetings {
public static void  main(String[] args) {
	
	System.out.println("class Greetings");
	
System.out.println("Welcome to java"); 	
	

// Excerise 0.1 type in the above program compiple it and run it 
System.out.println("Welcome " + "to " + "Java");



//excerise 0.2 mmodify your program to print out a diffrent greeting

System.out.println("Good Morning : ");
System.out.println("Have " + "A " + "good " + "rest " + "of " + "your " + "night");
	

System.out.println("excerise 0.3 what happens if you change a public keyword to publick?" );

System.out.println("An error comes out before starting the program");

int i = 1; //decalre and initizialize an integer variable

	while (i < 10) {
		System.out.println(i*i);
		// loops through as long as i is less than 10
			i = i + 1;
		
	
		
	}
System.out.println("Now we are going to write a code that will square the number along side with the square"); {
	int j = 1;            // declares and initalize an integer variable
	//System.out.println(i);
	while (j < 10) //"loop" as long as i is less than 10
	{
		System.out.print(j + " ");  //print the square of i 
		
		
		/*
		 * note: 
		 * ln is not applied
		 * 
		 * 
		 */
		System.out.println(j*j);			//followed by a square
		
		j = j +1; 				//	increment (add 1 to) i
		
	}
		
	System.out.println("Excerise 0.4");
		//exerise 0.4 modify the numberedsquares program to print out the squares of the numbers 10 through 19. widen the space between i and its square to five spaces. insert an appropriate statment 
		// to print a nice title at the top of your table. you willprobably want a line or two of blannk space between the title and the columns of numbers.
	System.out.println("Square of numbers ranged from  10 to 19 : ");
		int k = 10;
		while(k < 19) {
	
			System.out.println();
			System.out.println(); 
			System.out.print(k + " "+ " " + " " + " " + " ");
		
			System.out.println(k*k);
			k = k+ 1;
// exercise 0.5 why does not * i+i*i) work ? or does it.
			//System.out.println(k+k*k);
		// this will add the whole number + antoher int which is not what we are looking for .
		}
		
		
		
		
		
		
		
	}
}




}