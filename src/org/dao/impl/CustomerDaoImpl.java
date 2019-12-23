package org.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dao.ICustomerDao;
import org.entity.Customer;
import org.util.DBUtil;

public class CustomerDaoImpl implements ICustomerDao{

	//添加
	public boolean addCustomer(Customer customer) {
		String sql="insert into Customer(cus_id,cus_name,cus_sex,cus_age,cus_tel,cus_password) values(?,?,?,?,?,?)";
		Object[] params= {customer.getCus_id(),customer.getCus_name(),customer.getCus_sex(),customer.getCus_age(),customer.getCus_tel(),customer.getCus_password()};
		return DBUtil.executeUpdate(sql, params);
		
	}
   //修改
	public boolean updateCustomer(String cus_id,Customer customer){
		String sql="update Customer set cus_name=?,cus_sex=?,cus_age=?,cus_tel=?,cus_password=? where cus_id=?";
		Object[] params= {customer.getCus_name(),customer.getCus_sex(),customer.getCus_age(),customer.getCus_tel(),customer.getCus_password(),cus_id};
		return DBUtil.executeUpdate(sql, params);
	} 
	public boolean updatePassword(int cus_tel,Customer customer) {
		String sql="update Customer set cus_password=? where cus_tel=?";
		Object[] params= {customer.getCus_password(),cus_tel};
		return DBUtil.executeUpdate(sql, params);
	}
	//删除
	public boolean deleteCustomer(int cus_tel) {
		String sql="delete from customer where cus_tel=?";
		Object[] params= {cus_tel};
		return DBUtil.executeUpdate(sql, params);
    }
	    
    //查询
	
	public  List<Customer> queryAllCustomers() {
	    PreparedStatement pstmt=null;
		Customer customer =null;
		ResultSet rs=null;
		List<Customer> customers=new ArrayList<Customer>();
		 try {
			 String sql="select * from customer";
			 rs=DBUtil.executeQuery(sql, null);
			 while(rs.next()){
				 String cus_id=rs.getString("cus_id");
				 String cus_name=rs.getString("cus_name");
				 String cus_sex=rs.getString("cus_sex");
				 int cus_age=rs.getInt("cus_age");
				 int cus_tel=rs.getInt("cus_tel");
				 String cus_password=rs.getString("cus_password");
				 customer=new Customer(cus_id,cus_name,cus_sex,cus_age,cus_tel,cus_password);
				 //System.out.println("****"+customer);
				 customers.add(customer);
				 System.out.println(customers+"**");
			 }
			 return customers;
		 }catch(SQLException e) {
				e.getStackTrace();
				return null;
			}catch(Exception e) {
				e.getStackTrace();
				return null;
		}finally {
			DBUtil.closeAll(rs,pstmt,DBUtil.connection);
		}
	}
	
	public   List<Customer> queryCustomerById(int cus_tel) {
	    PreparedStatement pstmt=null;
    	Customer customer =null;
		ResultSet rs=null;
		List<Customer> customers=new ArrayList<>();
		 try {
			 String sql="select * from customer where cus_tel=?";
	         Object[] params= {cus_tel};	        	       
		     rs=DBUtil.executeQuery(sql, params);          
			 while(rs.next()){
				 String cus_id=rs.getString("cus_id");
				 String cus_name=rs.getString("cus_name");
				 String cus_sex=rs.getString("cus_sex");
				 int cus_age=rs.getInt("cus_age");
				 int cus_tel1=rs.getInt("cus_tel");
				 String cus_password=rs.getString("cus_password");
				 
				 System.out.println(cus_id+cus_name+cus_sex+cus_age+cus_tel1+cus_password);
				 customer=new Customer(cus_id,cus_name,cus_sex,cus_age,cus_tel1,cus_password);
				 customers.add(customer);
			 }
			 return customers;
		 }catch(SQLException e) {
				e.getStackTrace();
				return null;
			}catch(Exception e) {
				e.getStackTrace();
				return null;
		}finally {
			DBUtil.closeAll(rs,pstmt,DBUtil.connection);
		}
		
	}


public  int login(Customer customer) {
	int result=-1;
	int flag=-1;
	
	ResultSet rs=null;
	PreparedStatement pstmt=null;
	try {
		String sql="select count(*) from Customer where cus_tel=? and cus_password=?";
		Object[] params= {customer.getCus_tel(),customer.getCus_password()};
		 rs=DBUtil.executeQuery(sql, params);
		 
		 if(rs.next()) {
			 result=rs.getInt(1);
		 }
		 if(result>0) {
			 return 1;
		 }else {
			 return 0;
		 }
	}catch(SQLException e) {
		e.printStackTrace();
		return -1;
	}catch(Exception e){
		e.printStackTrace();
		return -1;
	}finally{
		DBUtil.closeAll(rs,pstmt,DBUtil.connection);
	}		
	}
	
	

}
