package p0718;

class UnbelievableUserInfo {
    // 이름은 null이 될 수 없음.
    public String name = "홍길동";
    
    // 계좌는 0보다 커야 함.
    public int account = 10000;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null) {
			this.name = name;
		}
		else {
			System.out.println("나도 필요해");
		}
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		if (account >=0) {
			this.account = account;
		}
		else {
			System.out.println("마통 안돼");
		}
		
	}
    
    

    // TODO: name 과 account에 부적절한 값이 할당되지 못하도록 처리하시오.
    //  name과 account 는 private으로 변경되어야 한다.

    // END
}

public class UnbelievableTest {
    public static void main(String[] args) {
        UnbelievableUserInfo info = new UnbelievableUserInfo();
        System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount());
//        info.name = null;
        info.setName(null);
//        info.account = -1000;
        info.setAccount(-1000);
        System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount());
    }
}
