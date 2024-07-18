package p0717_movie;

public class MovieManager {

	private static int MAX_SIZE = 100;
	private int size=0;
	private Movie[] movieList = new Movie[MAX_SIZE];
	
	public void add(Movie movie) {
		movieList[size] = movie;
		size++;
	}
	public Movie[] getList() {
		return movieList;
	}
	
	public Movie serachByTitle(String title) {
		for(int i=0;i<MAX_SIZE;i++) {
			if(movieList[i].getTitle().equals(title)) {
				return movieList[i];
			}
		}
		return null;  //예외
	}

}
