package org.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.entity.Room;

public class DBUtil {
	private  static final String DRIVERNAME="oracle.jdbc.OracleDriver";
	private  static final String URL="jdbc:oracle:thin:@localhost:1521:ORCL";
	private  static final String USERNAME="scott";
	private  static final String PASSWORD="itshaorui.cn";
	public static PreparedStatement pstmt=null;
	public static Connection connection=null;
	public static ResultSet rs=null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVERNAME);
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);		
	}
	
	public static PreparedStatement createPreparedStatement(String sql,Object[] params) throws ClassNotFoundException, SQLException {
		//鑾峰彇閾炬帴
		 //getConnection();
		 //pstmt=connection.prepareStatement(sql);
		pstmt=getConnection().prepareStatement(sql);
		 //String sql="insert into college(StuDepNo,StuDep) values(?,?)";
		// pst.setString(1, college.getStuDepNo());
		 if(params!=null) {
			 for(int i=0;i<params.length;i++) {
				 //闂彿鐨勪釜鏁扮瓑浜庢暟缁勫厓绱犵殑涓暟锛岃�岄棶鍙蜂粠1寮�濮嬶紝鏁扮粍浠�0寮�濮嬶紝鏁卛+1
				 pstmt.setObject(i+1, params[i]);
			 }
		 }
		 return pstmt;
	}
	
	//閫氱敤鐨勫鍒犳敼
	public static boolean executeUpdate(String sql,Object[] params) {
		//Object[] params:瀛樻斁sql璇彞閲岀殑鍊�		
		 try {
			 pstmt=createPreparedStatement(sql, params);
			 int count=pstmt.executeUpdate();
			 if(count>0)
				 return true;
			 else
				 return false;
		 }catch(ClassNotFoundException e){
			 e.getStackTrace();
				return false;
		 }catch(SQLException e) {
				e.getStackTrace();
				return false;
			}catch(Exception e) {
				e.getStackTrace();
				message("閿欒淇℃伅锛�");
				return false;
			}finally {
				closeAll(null, pstmt, connection);
			}
	}

	//閫氱敤鐨勬煡锛氳繑鍥炲�兼槸涓�涓泦鍚�
	public static ResultSet executeQuery(String sql,Object[] params){
		//Customer cutomer =null;
		//List<Customer> cutomers=new ArrayList<Customer>();
		 try {		
			 pstmt=createPreparedStatement(sql, params);
			 rs=pstmt.executeQuery();
			 return rs;
		 }catch(ClassNotFoundException e){
			 e.getStackTrace();
				return null;
		 }catch(SQLException e) {
				e.getStackTrace();
				return null;
			}catch(Exception e) {
				e.getStackTrace();
				message("閿欒淇℃伅锛�");
				return null;
		}
			
	}
//	public static boolean Query(String sql,Object[] params){
//		//Customer cutomer =null;
//		//List<Customer> cutomers=new ArrayList<Customer>();
//		
//		 try {		
//			 pstmt=createPreparedStatement(sql, params);
//			boolean result=pstmt.executeQuery() != null;
//			 return result;
//		 }catch(ClassNotFoundException e){
//			 e.getStackTrace();
//				return false;
//		 }catch(SQLException e) {
//				e.getStackTrace();
//				return false;
//			}catch(Exception e) {
//				e.getStackTrace();
//				message("閿欒淇℃伅锛�");
//				return false;
//		}
//			
//	}
//	
	
	public static void closeAll(ResultSet rs,Statement stmt,Connection connection) {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(connection!=null) connection.close();
		}catch (SQLException e) {
			e.getStackTrace();
		}
		
	}
	
	private static void message(String msg) {
		int type=JOptionPane.YES_NO_OPTION;
		String title="淇℃伅鎻愮ず";
		JOptionPane.showMessageDialog(null, msg,title,type);		
	}
}
