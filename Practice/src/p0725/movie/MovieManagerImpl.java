package p0725.movie;

import java.util.Arrays;

public class MovieManagerImpl implements IMovieManager {
	private static int MAX_SIZE = 100;
	private int size=0;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private static IMovieManager instance = new MovieManagerImpl();
	
	public static IMovieManager getInstance() {
		return instance;
	}
	public void add(Movie movie) {
		movieList[size] = movie;
		size++;
	}
	public Movie[] getList() {
		return Arrays.stream(movieList).filter((i)-> (i instanceof Movie == true)).toArray(Movie[]::new);
	}
	public Movie[] getMovies() {
		return Arrays.stream(movieList).filter((i) -> (i instanceof SeriesMovie == false)).toArray(Movie[]::new);
	}
	public SeriesMovie[] getSeriesMovies() {
		return Arrays.stream(movieList).filter((i)->(i instanceof SeriesMovie == true)).toArray(SeriesMovie[]::new);
	}
	
	
	public Movie[] searchByTitle(String title) throws TitleNotFoundException{
		Movie[] ms = Arrays.stream(getList()).filter(i->i.getTitle().contains(title)).toArray(Movie[]::new);
		
		if( ms.length == 0) {
			throw new TitleNotFoundException(title);
		}
		
		return ms;
		/*List<Movie> arl = new ArrayList<Movie>();
		
		for(int i=0;i<MAX_SIZE;i++) {
			if(movieList[i].getTitle().contains(title)) {
				arl.add(movieList[i]);
			}
		}
		return arl.toArray(Movie[]::new);*/
	}
	public double getRunningTimeAvg() {
		return Arrays.stream(getList()).mapToInt((i)->i.getRunningTime()).average().orElse(0);
	}
}
