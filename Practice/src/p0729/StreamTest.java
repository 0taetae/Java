package p0729;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamTest {
	public static void main(String[] args) throws IOException {
		
		/* BufferedReader 이해하기 */
		
		// BufferedReader는 입력으로 들어오는 데이터를 버퍼 단위 (묶음)으로 입력받는 것을 말합니다.
		// InputStreamReader는 시스템으로 들어오는 입력을 쭉 받아오는 역할입니다.
		
		// 이해하기.
		// System.in: 시스템으로 들어오는 데이터.
		// InputStreamReader: 입력으로 들어오는 데이터를 Stream(흐름, 쭉) 읽어온다.
		// BufferedReader: 입력 스트림을 버퍼 단위로 읽어온다.
		// 방향 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// 사용한 자원은 반드시 해제해준다.
		// Checked Exception이 발생함을 확인한다.
		// 해당 코드를 굳이 처리해 줄 필요가 없다면 예외를 회피해보자.
		br.close();
		
		/* BufferedWriter 이해하기 */
		
		// BufferedWriter는 BufferedReader와 반대로 출력하는데 사용합니다.
		
		// 이해하기.
		// BufferedWriter: 버퍼 단위로 데이터를 출력한다.
		// OutputStreamReader: 출력하려는 데이터를 Stream(흐름, 쭉) 읽어온다.
		// System.out: 시스템에 출력한다.
		// 방향 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 사용한 자원은 반드시 해제해준다.
		// Checked Exception이 발생함을 확인한다.
		// 해당 코드를 굳이 처리해 줄 필요가 없다면 예외를 회피해보자.
		bw.close();
	}
}
