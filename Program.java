//TOPIC:     Chapter 5, Programming Project 10, Page 375 
//CLASS:     Program

import java.util.Scanner;
import java.text.DecimalFormat;

public class Program
{
    public static void main(String[] args)
    {
        Movie movie = new Movie();
        
        //Input
		movie.setName("Saving Private Ryan");
		movie.setMpaaRating("R");
		
		movie.addRating(Movie.MovieRating.TERRIBLE);
		movie.addRating(Movie.MovieRating.BAD);
		movie.addRating(Movie.MovieRating.OK);
		movie.addRating(Movie.MovieRating.GOOD);
		movie.addRating(Movie.MovieRating.GREAT);
		
		//Process
		double averageRating = movie.getAverageRating();
		
		//Output
		DecimalFormat decimalFormat = new DecimalFormat("0.0");
		String formattedAverageRating = decimalFormat.format(averageRating);
		System.out.println("Average rating: " + formattedAverageRating);

		//Pause Program Execution
		System.out.println("Press the enter key to terminiate the program...");
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        keyboard.close();
    }
}

