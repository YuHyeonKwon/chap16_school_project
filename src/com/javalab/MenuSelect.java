package com.javalab;
/*
 * 콘솔 화면에 보여줄 메뉴와 입력된 객체들에 관한 정보를 저장할 ArrayList를
 * 필드로 갖고 있는 클레스
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSelect {
	

	// 학생, 교수, 학과, 성적 데이터 저장용 ArrayList 생성
	List<Student> studentList = new ArrayList<Student>(); 			// 학생 ArrayList
	List<Professor> professorList = new ArrayList<Professor>();		// 교수 ArrayList
	List<Department> departmentList = new ArrayList<Department>();	// 학과 ArrayList
	List<Takes> takesList = new ArrayList<Takes>(); 				// 성적 ArrayList

	// 키보드에서 입력받을 Scanner 객체 생성
	Scanner scanner = new Scanner(System.in);
	int ch;

	// 콘솔 화면에서 보여질 메인 메뉴를 보여주는 메소드
	public void displayMenu() {
		System.out.println("==================================================");
		System.out.println("작업을 선택하세요.");
		System.out.println("--------------------------------------------------");
		System.out.println("1. 학생등록");
		System.out.println("2. 교수등록");
		System.out.println("3. 학과등록");
		System.out.println("4. 성정등록");
		System.out.println("5. 학생조회");
		System.out.println("6. 교수조회");
		System.out.println("7. 학과조회");
		System.out.println("8. 성적조회");
		System.out.println("9. 종료");
		System.out.println("==================================================");
	}

	// 사용자가 키보드로 입력한 값을 입력 받는 메소드
	public void selectMenu() {
		while (true) {
			displayMenu();
			System.out.println("작업을 선택하세요.");
			ch = scanner.nextInt();
			switch (ch) {
			case 1: // 학생등록
				while (true) {
					System.out.println("1. 학생등록 메뉴를 선택하셨습니다.");
					System.out.println("학번?");
					String id = scanner.next();
					System.out.println("학생명?");
					String name = scanner.next();
					System.out.println("학생 주민번호?");
					String jumin = scanner.next();
					System.out.println("학년?");
					int year = scanner.nextInt();
					System.out.println("주소?");
					String address = scanner.next();
					System.out.println("학과번호?");
					int department = scanner.nextInt();

					Student student = new Student(id, jumin, name, year, address, department);
					studentList.add(student);

					System.out.println("학생 정보가 성공적으로 저장되었습니다.");
					break;
				} // end while
				break; // end 
			case 2: // 교수등록
				while (true) {
					System.out.println("2. 교수등록 메뉴를 선택하셨습니다.");
					System.out.println("교수ID?");
					String id = scanner.next();
					System.out.println("교수 주민번호?");
					String jumin = scanner.next();
					System.out.println("교수성명?");
					String name = scanner.next();
					System.out.println("교수학과?");
					int department = scanner.nextInt();
					System.out.println("교수직책?");
					String grade = scanner.next();
					System.out.println("교수입사날짜?");
					String hiredate = scanner.next();

					Professor professor = new Professor(id, jumin, name, department, grade, hiredate);
					professorList.add(professor);
					System.out.println("교수 정보가 성공적으로 저장되었습니다.");
					break;
				}
				break; // end case 2
			case 3: // 학과등록
				while (true) {
					System.out.println("4. 학과등록 메뉴를 선택하셨습니다.");
					System.out.println("학과코드?");
					int id = scanner.nextInt();
					System.out.println("학과명?");
					String name = scanner.next();
					System.out.println("교실몇호?");
					String office = scanner.next();
					
					Department department = new Department(id, name, office);
					departmentList.add(department);
					System.out.println("학과 정보가 성공적으로 저장되었습니다.");
					break;
				} // end while
				break;
			case 4: // 성적등록
				while (true) {
					System.out.println("4. 성적등록 메뉴를 선택하셨습니다.");
					System.out.println("학번?");
					String id = scanner.next();
					System.out.println("학과과목?");
					String subject = scanner.next();
					System.out.println("학과점수?");
					String score = scanner.next();
					
					Takes takes = new Takes(id, subject, score);
					takesList.add(takes);
					System.out.println("학과 정보가 성공적으로 저장되었습니다.");
					break;
				} // end while
				break;
			case 5: // 학생조회
				while (true) {
					System.out.println("5. 학생조회 메뉴를 선택하셨습니다.");
					studentList.forEach(student -> System.out.println(student));
					System.out.println("학생 조회가 성공적으로 조회되었습니다.");
					break;
				} // end while
				break;
			case 6: // 교수조회
				while (true) {
					System.out.println("6. 교수조회 메뉴를 선택하셨습니다.");
					professorList.forEach(professor -> System.out.println(professor));
					System.out.println("교수 조회가 성공적으로 조회되었습니다.");
					break;
				} // end while
				break;
			case 7: // 학과조회
				while (true) {
					System.out.println("7. 학과조회 메뉴를 선택하셨습니다.");
					departmentList.forEach(department -> System.out.println(department));
					System.out.println("학과 조회가 성공적으로 조회되었습니다.");
					break;
				} // end while
				break;
			case 8: // 성적조회
				while (true) {
					System.out.println("8. 성적조회 메뉴를 선택하셨습니다.");
					takesList.forEach(takes -> System.out.println(takes));
					System.out.println("성적 조회가 성공적으로 조회되었습니다.");
					break;
				} // end while
				break;
			case 9: // 종료
				System.out.println("프로그램 종료를 선택하셨습니다. bye~");
				System.exit(0);
				break;
			default:
				System.out.println("프로그램 종료를 선택하셨습니다. bye~");
				System.exit(0);
				
			} // end swich
			
		} // end while
		
	} // end method

} // class e
