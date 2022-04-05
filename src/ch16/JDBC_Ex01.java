package ch16;

import java.sql.*;

public class JDBC_Ex01 {
	public static void main(String[] args) {
		
//		String driverName="com.mysql.jdbc.Driver";
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/student";
		String id="root";
		String pw="1234";
		String sql="select * from smembers";
//		String sql2="delete from smembers where id='tiger'";
//		String sql2="insert into smembers (num,name,id,pw,email) values (108,'aaa','aaa','1234','aaa@gmail.com')";
//		String sql2="delete from smembers where num=108";
		String sql2="update smembers set pw='1234' where num=2";
				
		
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName(driver); // mysql jdbc 드라이버 호출
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 연결 완료!!!");
			stmt=conn.createStatement(); //SQL 실행용 statement 객체 생성
			rs=stmt.executeQuery(sql); //SQL 실행-반환되는 결과값을 ResultSet으로 받음
			
			while(rs.next()) {
				int pnum=rs.getInt("num");
				String pid=rs.getString("id");
				String ppw=rs.getString("pw");
				System.out.println(pnum+". "+pid+" "+ppw);
//				System.out.println(ppw);
				
			}
			
			int rnum=stmt.executeUpdate(sql2);
			
			if (rnum==1) {
//				System.out.println("회원탈퇴성공!!!");
				System.out.println("성공!!!");
			}else {
//				System.out.println("회원삭제성공");
				System.out.println("실패");
			}
			
			

		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("JDBC 드라이버 로드 에러!!!");
		} catch (SQLException e) {

		}
	}
}
