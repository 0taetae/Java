package p0722.movie;

public class SeriesMovie extends Movie{
	private int seriesNum;
	private String episode;
	
	public SeriesMovie() {
		super();
		
	}
	
	public SeriesMovie(int seriesNum, String episode) {
		super();
		this.seriesNum = seriesNum;
		this.episode = episode;
	}

	public int getSeriesNum() {
		return seriesNum;
	}

	public void setSeriesNum(int seriesNum) {
		this.seriesNum = seriesNum;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}

	@Override
	public String toString() {
		return String.format("seriesNum : %d | episode : %s", seriesNum, episode);
	}
	
	
	
}
