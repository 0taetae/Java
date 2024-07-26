package p0726.movie;

public interface IMovieManager{
	void add(Movie ob1);
	Movie[] getList() ;
	Movie[] searchByTitle(String title) throws TitleNotFoundException;
	Movie[] getMovies() ;
	
	SeriesMovie[] getSeriesMovies() ;
	
	double getRunningTimeAvg();
	
	void saveData();
}
