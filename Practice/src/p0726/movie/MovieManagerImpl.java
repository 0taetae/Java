package p0726.movie;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieManagerImpl implements IMovieManager {

	private List<Movie> movieList = null;
	private static IMovieManager instance = new MovieManagerImpl();
	private final String f = "movie.dat";
	
	public MovieManagerImpl() {
		loadData();
	}
	public static IMovieManager getInstance() {
		return instance;
	}
	public void add(Movie movie) {
		movieList.add(movie);
	}
	public Movie[] getList() {
		Movie[] result = new Movie[movieList.size()];
		return movieList.toArray(result);
		//return movieList.stream().filter((i)-> (i instanceof Movie == true)).toArray(Movie[]::new);
	}
	
	public Movie[] searchByTitle(String title) throws TitleNotFoundException{
		ArrayList<Movie> temp = new ArrayList<Movie>();
		for(Movie movie:movieList) {
			if(movie.getTitle().contains(title)) temp.add(movie);
		}
		Movie[] result = new Movie[temp.size()];
		return temp.toArray(result);
		/*Movie[] ms = Arrays.stream(getList()).filter(i->i.getTitle().contains(title)).toArray(Movie[]::new);
		
		if( ms.length == 0) {
			throw new TitleNotFoundException(title);
		}
		
		return ms;*/
		/*List<Movie> arl = new ArrayList<Movie>();
		
		for(int i=0;i<MAX_SIZE;i++) {
			if(movieList[i].getTitle().contains(title)) {
				arl.add(movieList[i]);
			}
		}
		return arl.toArray(Movie[]::new);*/
	}
	
	public SeriesMovie[] getSeriesMovies() {
		ArrayList<SeriesMovie> temp = new ArrayList<SeriesMovie>();
		for(Movie movie:movieList) {
			if(movie instanceof SeriesMovie) temp.add((SeriesMovie)movie);
		}
		SeriesMovie[] result = new SeriesMovie[temp.size()];
		return temp.toArray(result);
	}
	
	public Movie[] getMovies() {
		ArrayList<Movie> temp = new ArrayList<Movie>();
		for(Movie movie:movieList) {
			if(!(movie instanceof SeriesMovie)) temp.add(movie);
		}
		Movie[] result = new Movie[temp.size()];
		return temp.toArray(result);
	}
	
	public double getRunningTimeAvg() {
		int total = 0;
		for(Movie movie:movieList) {
			total += movie.getRunningTime();
		}
		return (double)total/movieList.size();
		//return Arrays.stream(getList()).mapToInt((i)->i.getRunningTime()).average().orElse(0);
	}
	
	private void loadData() {
		File target = new File(f);
		if(target.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(target));
				movieList = (ArrayList<Movie>) ois.readObject();
				ois.close();
			}catch (Exception e) {
				System.out.println("[SYSTEM]파일 읽기에 실패하였습니다.");
				e.printStackTrace();
			} 
		}
		else {
			movieList = new ArrayList<Movie>();
		}
		
	}
	
	public void saveData() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(movieList);
			System.out.println("저장되었습니다");
			oos.close();			
		}catch(Exception e) {
			System.out.println("[SYSTEM]파일 쓰기에 실패하였습니다.");
			e.printStackTrace();
		} 
	}
	
	
	
	
	
	
	
}
