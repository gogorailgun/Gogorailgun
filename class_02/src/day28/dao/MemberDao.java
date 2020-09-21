package day28.dao;

import DB.*;
import day28.sql.*;
import day28.vo.*;

import java.util.*;
import java.sql.*;

public class MemberDao {
	MemberVO mVO;
	MyJDBC db;
	MemberSQL mSQL;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public MemberDao() {
		db = new MyJDBC();
		mSQL = new MemberSQL();
	}
	
	// 회원리스트 가져오기 데이터베이스 작업 전담 처리함수
	public ArrayList<MemberVO> getList(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.SEL_MEMB_LIST);
		pstmt = db.getPSTMT(con, sql);
		try {
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO mVO = new MemberVO();
				
				mVO.setMno(rs.getInt("mno"));
				mVO.setId(rs.getString("id"));
				mVO.setName(rs.getString("name"));
				mVO.setMail(rs.getString("mail"));
				
				list.add(mVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return list;
	}
	
	
	
	// 아이디 카운트 조회 전담 처리함수
	public int idCount(String id) {
		int cnt = 0 ; 
		
		return cnt;
	}
	
	public int addMemb(MemberVO mVO){
		
		int cnt = 0;
		
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		pstmt = db.getPSTMT(con, sql);
		
		try {
			pstmt.setString(1, mVO.getId());
			pstmt.setString(2, mVO.getName());
			pstmt.setString(3, mVO.getPw());
			pstmt.setString(4, mVO.getMail());
			pstmt.setString(5, mVO.getTel());
			pstmt.setString(6, mVO.getGen());
			pstmt.setInt(7, mVO.getAno());
			// 5. 질의명령 실행 요청하고 결과 반환받고
			cnt = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
}