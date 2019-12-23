package org.entity;

/**
 * @author Administrator
 *
 */
public class Room {
	private int rom_id;
	private int rom_prise;
	private String rom_type;
	private int adm_id;
	private int rom_status;

	public Room(int rom_id, String rom_type,int rom_prise, int adm_id, int rom_status) {
		super();
		this.rom_id = rom_id;
		this.rom_prise = rom_prise;
		this.rom_type = rom_type;
		this.adm_id = adm_id;
		this.rom_status = rom_status;
	}
	public int getRom_id() {
		return rom_id;
	}
	public void setRom_id(int rom_id) {
		this.rom_id = rom_id;
	}
	public int getRom_prise() {
		return rom_prise;
	}
	public void setRom_prise(int rom_prise) {
		this.rom_prise = rom_prise;
	}
	public String getRom_type() {
		return rom_type;
	}
	public void setRom_type(String rom_type) {
		this.rom_type = rom_type;
	}
	public int getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}
	public int getRom_status() {
		return rom_status;
	}
	public void setRom_status(int rom_status) {
		this.rom_status = rom_status;
	}
	@Override
	public String toString() {
		return "Room [rom_id=" + rom_id + ", rom_type=" + rom_type + ", rom_prise=" + rom_prise + ", adm_id=" + adm_id
				+ ", rom_status=" + rom_status + "]";
	}
	
	
	
}
