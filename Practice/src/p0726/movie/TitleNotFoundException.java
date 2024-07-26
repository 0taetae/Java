package p0726.movie;

public class TitleNotFoundException extends Exception{
	private String title;
	
	public TitleNotFoundException(String title) {
		super(title + " 제목을 포함하는 영화가 존재하지 않습니다.");
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	
	/*public TitleNotFoundException(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "영화를 찾지 못했음";
	}*/
	
	
}
