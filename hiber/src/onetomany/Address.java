package onetomany;

public class Address {
	private int aid;
	public final int getAid() {
		return aid;
	}
	public final void setAid(int aid) {
		this.aid = aid;
	}
	public final String getCity() {
		return city;
	}
	public final void setCity(String city) {
		this.city = city;
	}
	public final String getStreet() {
		return street;
	}
	public final void setStreet(String street) {
		this.street = street;
	}
	public final Employee getEmp() {
		return emp;
	}
	public final void setEmp(Employee emp) {
		this.emp = emp;
	}
	private String city;
	private String street;
	private Employee emp;
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", street=" + street + ", emp=" + emp + "]";
	}
	
}		
