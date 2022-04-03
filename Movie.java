public class Movie
{
	//Constants
	private final int TERRIBLE_RATING_POINTS = 1;
	private final int BAD_RATING_POINTS = 2;
	private final int OK_RATING_POINTS = 3;
	private final int GOOD_RATING_POINTS = 4;
	private final int GREAT_RATING_POINTS = 5;
	
	//Attributes
	private String name;
	private String mpaaRating;
	private int terribleRatings = 0;
	private int badRatings = 0;
	private int okRatings = 0;
	private int goodRatings = 0;
	private int greatRatings = 0;

	//Methods
	
	public void addRating(MovieRating rating)
	{
		if ((rating == MovieRating.TERRIBLE) || (rating == MovieRating.BAD)
				|| (rating == MovieRating.OK) || (rating == MovieRating.GOOD)
				|| (rating == MovieRating.GREAT))
		{
			switch (rating)
			{
				case TERRIBLE:
					terribleRatings++;
					break;
				case BAD:
					badRatings++;
					break;
				case OK:
					okRatings++;
					break;
				case GOOD:
					goodRatings++;
					break;
				case GREAT:
					greatRatings++;
					break;
			}
		}
	}

	public double getAverageRating()
	{
		int ratingsCount = terribleRatings + badRatings + okRatings + goodRatings + greatRatings;
		
		int totalRatingPoints = (	(terribleRatings * TERRIBLE_RATING_POINTS) + 
									(badRatings * BAD_RATING_POINTS) + 
									(okRatings * OK_RATING_POINTS) + 
									(goodRatings * GOOD_RATING_POINTS) + 
									(greatRatings * GREAT_RATING_POINTS)
								);
		
		double averageRating = (double)totalRatingPoints / ratingsCount;
		
		return averageRating;
	}
	
	//Setter (Mutator)
	public void setName(String newName)
	{
		name = newName;
	}
	
	//Getter (Accessor)
	public String getName()
	{
		return name;
	}
	
	//Setter (Mutator)
	public void setMpaaRating(String newRating)
	{
		mpaaRating = newRating;
	}
	
	//Getter (Accessor)
	public String getMpaaRating()
	{
		return mpaaRating;
	}

	//Enumerations
	public enum MovieRating 
	{
	    TERRIBLE,
	    BAD,
	    OK,
	    GOOD,
	    GREAT
	}
}
