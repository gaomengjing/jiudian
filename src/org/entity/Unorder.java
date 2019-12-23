package org.entity;

public class Unorder {
	private int uno_id;
	private int uno_date;
	private int ord_id;
	
	public Unorder() {
		
	}
	public Unorder(int uno_id, int uno_date, int ord_id) {
		super();
		this.uno_id = uno_id;
		this.uno_date = uno_date;
		this.ord_id = ord_id;
	}
	public int getUno_id() {
		return uno_id;
	}
	public void setUno_id(int uno_id) {
		this.uno_id = uno_id;
	}
	public int getUno_date() {
		return uno_date;
	}
	public void setUno_date(int uno_date) {
		this.uno_date = uno_date;
	}
	public int getOrd_id() {
		return ord_id;
	}
	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}
	@Override
	public String toString() {
		return "Unorder [uno_id=" + uno_id + ", uno_date=" + uno_date + ", ord_id=" + ord_id + "]";
	}
	
	
}
