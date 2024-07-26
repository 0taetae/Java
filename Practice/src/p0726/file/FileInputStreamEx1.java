package p0726.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException, InterruptedException{
		InputStreamReader is=new FileReader("src/p0726/file/data1.txt");
		BufferedReader br=new BufferedReader(is);
		
		String str;
		while((str=br.readLine()) != null)
		{
			System.out.println(str);
			Thread.sleep(100);  
		}
		is.close();
		br.close();
		//-------------------------------------------------------------
/*		InputStreamReader is=new FileReader("src/w0124_file/data1.txt");
		
		int readdata;
		while(true)
		{
			readdata=is.read();   // character 로 읽는다. 한글 처리 가능
			if(readdata==-1)      // -1 (End Of File: 파일의 끝)
				break; 
			
			System.out.print((char)readdata);
			Thread.sleep(100);  
		}
		is.close();
*/		
//---------------------------------------------------------------------
/*		InputStream is=new FileInputStream("src/w0124_file/data1.txt");
		
		int readdata;
		while(true)
		{
			readdata=is.read();   // byte로 읽는다. 한글 깨짐
			if(readdata==-1)      // -1 (End Of File: 파일의 끝)
				break; 
			
			System.out.print((char)readdata);
			Thread.sleep(100);  // 100/1000=0.1초
		}
		is.close();
*/	
	}
}
