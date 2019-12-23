package org.entity;

public class Admin {
	private int adm_id;
	private String adm_name;
	private String adm_sex;
	private int adm_tel;
	private String adm_password;
	
	
	public Admin() {
	
	}

	public Admin(int adm_id, String adm_name, String adm_sex,  int adm_tel,String adm_password) {
		super();
		this.adm_id = adm_id;
		this.adm_name = adm_name;
		this.adm_sex = adm_sex;
		this.adm_tel = adm_tel;
		this.adm_password = adm_password;
		
	}

	public int getAdm_id() {
		return adm_id;
	}

	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}

	public String getAdm_name() {
		return adm_name;
	}

	public void setAdm_name(String adm_name) {
		this.adm_name = adm_name;
	}

	public String getAdm_sex() {
		return adm_sex;
	}

	public void setAdm_sex(String adm_sex) {
		this.adm_sex = adm_sex;
	}

	public String getAdm_password() {
		return adm_password;
	}

	public void setAdm_password(String adm_password) {
		this.adm_password = adm_password;
	}

	public int getAdm_tel() {
		return adm_tel;
	}

	public void setAdm_tel(int adm_tel) {
		this.adm_tel = adm_tel;
	}

	@Override
	public String toString() {
		return "Admin [adm_id=" + adm_id + ", adm_name=" + adm_name + ", adm_sex=" + adm_sex + ", adm_password="
				+ adm_password + ", adm_tel=" + adm_tel + "]";
	}
	
	
	
}
