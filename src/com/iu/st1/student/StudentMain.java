package com.iu.st1.student;
/*
 * 
 * StudentUtil() 메서드를 이용해 출력하기
 * @since 22.01.04
 * 
 * 
 * */
public class StudentMain {
	public static void main(String[] args) {
		// makStudnet 호출
		// 이름, 번호, 국어, 영어, 수학 출력
		StudentUtil stdutil = new StudentUtil();
//		Student std = stdutil.makeStudnt();
//		
		
//		System.out.printf("이름: %s%n번호: %d%n국어: %d%n영어: %d%n수학: %d%n", 
//				std.name, std.number, std.kor, std.eng, std.math);
		Student[] stds = stdutil.makeStudnts();
		
		for (int i = 0; i < stds.length; i++) {
			Student std = stds[i];
			System.out.println("이름: " + std.name);
			System.out.println("번호: " + std.number);
			System.out.println("국어: " + std.kor);
			System.out.println("영어: " + std.eng);
			System.out.println("수학: " + std.math);
		}
		
		
	}

}