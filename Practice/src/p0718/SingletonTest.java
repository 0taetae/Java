package p0718;

import java.lang.*;

class SingletonClass extends Object {
  // TODO:SingletonClass에 Singleton Design Pattern을 적용하시오.
	private static SingletonClass instance = new SingletonClass();
	
	private SingletonClass() {
		super();
	}
	public static SingletonClass getInstance() {
		return instance;
	}

  // END
  public void sayHello() {
    System.out.println("Hello");
  }

}

public class SingletonTest {
  public static void main(String[] args) {
    // TODO:SingletonClass를 사용해보세요.
	  SingletonClass sc1 = SingletonClass.getInstance();
	  SingletonClass sc2 = SingletonClass.getInstance();
	  
	  System.out.println(sc1==sc2);
    // END
  }
}
