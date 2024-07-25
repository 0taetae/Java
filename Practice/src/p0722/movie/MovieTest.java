package p0722.movie;

import p0718.movie.Movie;
import p0718.movie.MovieManager;
import p0718.movie.SeriesMovie;

public class MovieTest {

	public static void main(String[] args) {
		MovieManager ob = new MovieManager();
		
		Movie ob1 = new Movie(1, "t1","d1","g1",100);
		Movie ob2 = new Movie(2, "t2","d2","g2",200);
		
		ob.add(ob1);
		ob.add(ob2);
		System.out.println("***일반영화***");
		for(Movie movie : ob.getMovies()) {
			if(movie == null) continue;
			System.out.println(movie.toString());
		}
		
		SeriesMovie obb1 = new SeriesMovie(1,"t1","d1","g1",11,111,"e1");
		SeriesMovie obb2 = new SeriesMovie(2,"t2","d2","g2",22,222,"e2");
		
		ob.add(obb1);
		ob.add(obb2);
		System.out.println("***시리즈 영화***");
		for(Movie movie : ob.getSeriesMovies()) {
			System.out.println(movie.toString());
		}
		System.out.println("***title에 1이 포함된 영화***");
		for(Movie movie : ob.searchByTitle("1")) {
			System.out.println(movie.toString());
		}
		/*for(Movie movie : ob.getList()) {
			if(movie ==null) continue;
			System.out.println(ob.getRunningTimeAvg());
		}*/
		System.out.println("***평균 상영 시간***");
		System.out.println(ob.getRunningTimeAvg());

	}

}
