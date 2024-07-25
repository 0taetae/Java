package p0725.trycatchfinally;

public class UseInstaller {
    public static void main(String[] args) {
        // TODO: InstallApp을 이용하면서 자원이 확실히 정리되도록 해보자.
    	InstallApp install = new InstallApp();
    	
    	try {
    		install.copy();// 리소스 사용
    		install.install();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    	install.delete();  //리소스 정리
    	}
        // END
        System.out.println("설치 종료");

    }
}
