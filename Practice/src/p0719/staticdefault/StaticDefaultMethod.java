package p0719.staticdefault;

import java.util.Arrays;

interface Aircon {
    void makeCool();

    // TODO: 2. 건조기능을 추가해보자.
    default void dry() {
    	System.out.println("건조 기능 필요");
    }
    // END

    // TODO: 3.Aircon이 동작 방식에 대해 설명해보자.
    static void howto() {
    	System.out.println("냉매가 있어");
    }
    // END

    
}

class OldisButGoodies1 implements Aircon {
    @Override
    public void makeCool() {
        System.out.println("전체 냉각해줘");
    }
}

class OldisButGoodies2 implements Aircon {
    @Override
    public void makeCool() {
        System.out.println("집중 냉각해줘");
    }
}

// TODO: 1. 무풍 에어컨을 구현해보자.
class NoWindAircon implements Aircon{

	@Override
	public void makeCool() {
		System.out.println("바람이 꼭 있어야 하는건 이니야");
		
	}

	@Override
	public void dry() {
		System.out.println("건조 필수");
		
	}
	Aircon.howto();
	
}
// END

public class StaticDefaultMethod {
    public static void main(String[] args) {
        Aircon[] aircons = { new OldisButGoodies1(), new OldisButGoodies2() };
        for (Aircon aircon : aircons) {
            aircon.makeCool();
        }
    }
}
