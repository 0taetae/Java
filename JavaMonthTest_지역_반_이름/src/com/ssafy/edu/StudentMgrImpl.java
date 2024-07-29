package com.ssafy.edu;

import java.util.Arrays;

public class StudentMgrImpl implements StudentMgr {
	private StudentMgrImpl() {
		this.addStudent(new Student(1111, "김싸피", "12기", 27, "자바전공"));
		this.addStudent(new Student(1112, "박싸피", "12기", 26, "비전공 파이썬"));
		this.addStudent(new Student(1113, "홍싸피", "12기", 24, "데이터"));
		this.addStudent(new Student(1114, "김삼성", "12기", 29, "자바전공"));
	}
	
	public static StudentMgrImpl getInstance() {
		return null;
	};
	
	private static final int MAX_SIZE = 100;
	private Student[] students = new Student[MAX_SIZE];
	private int size;

	@Override
	public boolean addStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student[] search() {
		return Arrays.copyOf(students, size);
	}

	@Override
	public Student search(int num) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student[] search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int studentNum, String major) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean delete(int studentNum) {
		// TODO Auto-generated method stub
		return false;
	}

}
