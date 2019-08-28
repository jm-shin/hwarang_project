package hwarang.artg.funding.model;

import java.sql.Date;

public class CorporationVO {
	private int num;
	private String id;
	private String password;
	private String name;
	private String address;
	private String ceoname;
	private Date regdate;
	private int phonenum;
	private int account;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCeoname() {
		return ceoname;
	}

	public void setCeoname(String ceoname) {
		this.ceoname = ceoname;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "CorporationVO [Num=" + num + ", id=" + id + ", password=" + password + ", name=" + name + ", address="
				+ address + ", ceoname=" + ceoname + ", regdate=" + regdate + ", phonenum=" + phonenum + ", account="
				+ account + "]";
	}

}
