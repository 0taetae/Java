package p0726.node;

import java.io.File;
import java.io.IOException;

public class UseFileTest {

    public static void main(String[] args) {
        try {
            // 절대 경로
            File temp = new File("c:\\Temp");
            System.out.printf("존재? %b, 디렉토리? %b%n", temp.exists(), temp.isDirectory());

            // 상대경로
            File current = new File(".");   // 현재 나의 위치 - 어디서 자바 애플리케이션을 실행했는가?
            System.out.printf("여기는 어디? %s%n", current.getCanonicalPath());

            // 상대경로의 기준은 java program을 실행하는 위치(소스와 무관)
            // d:\>java -cp .;[project_root]\bin [package].UseFileStream

            // TODO: readme.txt에 해당하는 File 객체를 만들어 보자.
            //  프로젝트와 무관하게 파일을 찾을 때(절대 경로)
            File readme = new File("C:\\Users\\githubAlgorithm\\Practice\\src\\p0726\\node\\readme.txt");
            //System.out.println(readme.canRead());
            //  프로젝트 내부에서 파일을 찾을 때(상대 경로)
            readme = new File("./src/p0725/node/readme.txt");
            //  특정 클래스 기준으로 파일을 찾을 때
            readme = new File(UseFileTest.class.getResource("./readme.txt").getFile());
            System.out.println(readme.canRead());
            // END
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
