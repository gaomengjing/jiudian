package org.dao;

import java.util.List;

import org.entity.Customer;

public interface ICustomerDao {

		//添加
		public boolean addCustomer(Customer customer);
		 //修改
		public boolean updateCustomer(String cus_tel,Customer customer);
		public boolean updatePassword(int cus_tel,Customer customer);
		//删除
		public boolean deleteCustomer(int cus_tel);
		//查询
		//全部
		public  List<Customer> queryAllCustomers();
		
		public  List<Customer> queryCustomerById(int cus_tel);

		public  int login(Customer customer);

}
