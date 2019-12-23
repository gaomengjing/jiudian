package org.entity;

public class Ord {
	private int ord_id;
	private int rom_id;
	private int ord_date;	
	private String cus_id;
	
	public Ord() {
		
	}
	public Ord(int ord_id,int rom_id, int ord_date,  String cus_id) {
		super();
		this.ord_id = ord_id;
		this.ord_date = ord_date;
		this.rom_id = rom_id;
		this.cus_id = cus_id;
	}
	public int getOrd_id() {
		return ord_id;
	}
	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}
	public int getOrd_date() {
		return ord_date;
	}
	public void setOrd_date(int ord_date) {
		this.ord_date = ord_date;
	}
	public int getRom_id() {
		return rom_id;
	}
	public void setRom_id(int rom_id) {
		this.rom_id = rom_id;
	}
	public String getCus_id() {
		return cus_id;
	}
	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}
	@Override
	public String toString() {
		return "Ord [ord_id=" + ord_id + ", ord_date=" + ord_date + ", rom_id=" + rom_id + ", cus_id=" + cus_id + "]";
	}
	
	
}
