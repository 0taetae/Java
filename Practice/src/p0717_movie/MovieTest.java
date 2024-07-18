package p0717_movie;

public class MovieTest {

	public static void main(String[] args) {
		MovieManager ob = new MovieManager();
		
		Movie ob1 = new Movie(1, "t1","d1","g1",100);
		Movie ob2 = new Movie(2, "t2","d2","g2",200);
		
		ob.add(ob1);
		ob.add(ob2);
		for(Movie movie : ob.getList()) {
			if(movie == null) continue;
			System.out.println(movie.toString());
		}
		

	}

}
