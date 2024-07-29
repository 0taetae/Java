package p0729.dto;

public record BoxOffice(Integer rank, String movieNm, String openDt, Integer audiAcc) {

    public String sayHello() {
    	return "Hello";
    	
    }
    public final String toString() {
    	return "박스오피스 정보:"+rank+" : "+movieNm+":"+openDt+":"+audiAcc;
    }
    
    
}
