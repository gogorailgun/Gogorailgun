package day28.sql;

public class MemberSQL {
	public final int SEL_MEMB_LIST	=	1001;
	public final int SEL_MEMB_INFO	= 	1002;
	public final int ADD_MEMB = 3001;
	// 질의명령 반환해줄 함수
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		// 코드값에 따라 반환해줄 질의명령 분기처리
		switch(code) {
		case SEL_MEMB_LIST:
			buff.append("SELECT ");
			buff.append("	mno, id, name, mail ");
			buff.append("FROM ");
			buff.append("	member01 ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			buff.append("ORDER BY ");
			buff.append("	MNO ");
			break;
		case SEL_MEMB_INFO:
			buff.append("SELECT ");
			buff.append("	mno, id, name, mail, tel, avt ano, avatar, aname, m.gen, joindate ");
			buff.append("FROM ");
			buff.append("	member01 m, avatar a ");
			buff.append("WHERE ");
			buff.append("	avt = ano ");
			buff.append("	AND id = ? ");
			break;
		case ADD_MEMB:
			buff.append("INSERT INTO ");
			buff.append("	member01( ");
			buff.append("		mno, id, name, pw, mail, tel, gen, avt ");
			buff.append("	) ");
			buff.append("VALUES( ");
			buff.append(" 	(SELECT NVL(MAX(mno) +1, 1000) FROM member01), ");
			buff.append(" 	?, ?, ?, ?, ?, ?, ? ");
			buff.append(")");
			break;
		}
		
		return buff.toString();
	}
}