package Ass30july;

public class Movie {
	String movieName;
    int movieCost;
    String movieCatgory;

	public void set_movieName(String moviename)
	{
		this.movieName=moviename;
	}
	public String get_movieName()
	{
		return movieName;
	}
	public void set_movieCost(int movieCost)
	{
		this.movieCost=movieCost;
	}
	public int get_movieCost()
	{
		return movieCost;
	}
    public void set_movieCatgory(String movieCatgory)
    {
    	this.movieCatgory=movieCatgory;
    }
    public String get_movieCatgory()
    {
    	return movieCatgory;
    }
}
