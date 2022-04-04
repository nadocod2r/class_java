package ch16;

import java.sql.*;

public class JDBC_Ex01 {
	public static void main(String[] args) {
		
		String driverName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/student_db";
		String username="root";
		String password="1234";
		String query="select * from smembers";
//		String query2="delete from smembers where id='tiger'";
		String query2="insert into smembers (num,name,id,pw,email) values (108,'aaa','aaa','1234','aaa@gmail.com')";
				
		
		ResultSet ret=null;
		
		Connection conn=null;
		Statement stmt=null;
		
		try {
			Class.forName(driverName); // mysql jdbc 드라이버 호출
			conn = DriverManager.getConnection(url, username,password);
			System.out.println("DB 연결 완료!!!");
			stmt=conn.createStatement(); //SQL 실행용 statement 객체 생성
			ret=stmt.executeQuery(query); //SQL 실행-반환되는 결과값을 ResultSet으로 받음
			
			while(ret.next()) {
				String pid=ret.getString("id");
				String ppw=ret.getString("pw");
				System.out.println(pid);
				System.out.println(ppw);
				
			}
			
			int rnum=stmt.executeUpdate(query2);
			
			if (rnum==1) {
//				System.out.println("회원탈퇴성공!!!");
				System.out.println("회원가입성공!!!");
			}else {
//				System.out.println("회원삭제성공");
				System.out.println("회원가입실패");
			}
			
			

		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("JDBC 드라이버 로드 에러!!!");
		} catch (SQLException e) {

		}
	}
}
