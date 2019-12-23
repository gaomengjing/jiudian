package org.entity;

public class Customer {
	private static String cus_id;
	private static String cus_name;
	private static String cus_sex;
	private static int cus_age;	
	private static int cus_tel;
	private static String cus_password;
	
	
	public Customer(String cus_id,String cus_name,String cus_sex,int cus_age,int cus_tel,String cus_password) {
		this.cus_id = cus_id;
		this.cus_name = cus_name;
		this.cus_sex = cus_sex;
		this.cus_age = cus_age;
		this.cus_tel = cus_tel;
		this.cus_password = cus_password;
	}
	public Customer() {
		
	}
	public Customer(int cus_tel, String cus_password) {
		this.cus_tel = cus_tel;
		this.cus_password = cus_password;
		
	}
//	public Customer(String cus_id, int cus_tel) {
//		
//	}

	public static String getCus_id() {
		return cus_id;
	}
	public  void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}
	public static String getCus_sex() {
		return cus_sex;
	}
	public void setCus_sex(String cue_sex) {
		this.cus_sex = cue_sex;
	}
	public static int getCus_age() {
		return cus_age;
	}
	public void setCus_age(int cus_age) {
		this.cus_age = cus_age;
	}
	public static String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public static String getCus_password() {
		return cus_password;
	}
	public void setCus_password(String cus_password) {
		this.cus_password = cus_password;
	}
	public static int getCus_tel() {
		return cus_tel;
	}
	public void setCus_tel(int cus_tel) {
		this.cus_tel = cus_tel;
	}
	@Override
	public String toString() {
		return "Customer [cus_id=" + cus_id + ", cus_sex=" + cus_sex + ", cus_age=" + cus_age + ", cus_name=" + cus_name
				+ ", cus_password=" + cus_password + ", cus_tel=" + cus_tel + "]";
	}
	
	
}
