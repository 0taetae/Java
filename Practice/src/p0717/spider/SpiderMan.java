package p0717.spider;

import p0717.Person;

public class SpiderMan extends Person{  // is a 
	
	Spider spider = new Spider() ;  // has a

	boolean isSpider;
	
	public SpiderMan(){
		this("������Ŀ");
	}
	
	public SpiderMan(String name){
/*		super();  // ������ �⺻�����ڰ� ��� error
*/		this(name, new Spider(),false);
	}
	
	public SpiderMan(String name, Spider spider, boolean isSpider) {
		super(name);
		this.spider = spider;
		this.isSpider = isSpider;
	}
	
	public void fireWeb() {
		if(this.isSpider) {
			this.spider.fireWeb();
		}
		else {
			System.out.println("����� ����");
		}
	}
	public void jump(int cm) { //�����ε�
		System.out.println(cm+"���� jump");
	}
	@Override
	public void jump() {  //�������̵�
		if(isSpider) {
			spider.jump();
		
		}
		else {
			//System.out.println("폴짝");
			super.jump();
		}
	}
	@Override
	public String toString() {
		return super.toString()+ " : "+isSpider;
	}

}
