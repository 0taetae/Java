package p0729;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.google.gson.Gson;

class Person {
	private String name;
	private int age;
	private int height;

	public Person(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

public class JsonTest {

	public static void main(String[] args) throws Exception {
		// Q. Gson을 사용하기 위한 객체를 생성해 봅시다.
		Gson gson = new Gson();

		// Q. 이름은 김민재, 나이는 27, 키는 190인 person1 객체를 생성해 봅시다.
		Person person1 = new Person("김민재", 27, 190);

		// Q. person1 객체를 json 문자열로 변경해 봅시다.
		String personToJson = gson.toJson(person1);
		System.out.println(personToJson);
		
		// Q. person.json에 파일을 작성하도록 객체를 선언해 봅시다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("person.json")));
		gson.fromJson(personToJson, Person.class);
		bw.close();

		
		// Q. person2.json에 저장된 내용을 읽어오도록 객체를 선언해 봅시다.
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("person2.json")));
		
		// Q. json 문자열을 person2 객체로 변환해 봅시다.
		Person person2 = gson.fromJson(personToJson, Person.class);

		// Q. person2의 내용을 출력해봅시다.
		System.out.println("이름 : " + person2.getName());
		System.out.println("나이 : " + person2.getAge());
		System.out.println("키 : " + person2.getHeight());

	}

}
