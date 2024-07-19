package p0719_tv1;

//결합도가 높다
//$java TvMain lg
// 마우스 우클릭 -> run as -> run configurations -> arguments -> program arguments -> variables -> string_prompt
public class TvMain {
	public static void main(String[] args) {
		String in=args[0];
		
		if(in.equals("lg")) {
			LgTv tv=new LgTv();
			tv.turnOn();
			tv.turnOff();
			tv.soundUp();
			tv.soundDown();
		}else if(in.equals("samsung")) {
			SamsungTv tv=new SamsungTv();
			tv.powerOn();
			tv.powerOff();
			tv.volumeUp();
			tv.volumeDown();
		}else {
			System.out.println("error");
		}
	}
}
