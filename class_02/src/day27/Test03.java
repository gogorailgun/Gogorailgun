package day27;

import day27.dao.*;
import day27.sql.*;
import day27.vo.*;
import DB.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;


public class Test03 {
/*
 	작업 코드를 입력받는다.
 		l 	: 회원 아이디 리스트 조회
 		==> 콘솔 화면에 아이디 리스트가 출력
 		
 		i	: 회원 정보 조회
 		==> 회원아이디를 입력받아서
 			해당 아이디의 정보를 조회하고
 			콘솔 화면에 출력
 			p : 전단계 이동
 		q 	: 프로그램 종료
 */
	
	MemberSQL mSQL;
	MemberVO mVO;
	
	public Test03() {
		
		Scanner sc = new Scanner(System.in);
		String pcode = sc.next();
		System.out.println("작업 코드를 입력하세요! : ");
		
		Connection con = db.getCon();
		
		
		switch(pcode) {
		case "l":
			System.out.println("회원 아이디 리스트 조회");
			mSQL.getSQL(1001);
			
		case "i" :
		
		case "p" :
			
		case "q" :
			System.out.println("프로그램을 종료합니다");
			break;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
