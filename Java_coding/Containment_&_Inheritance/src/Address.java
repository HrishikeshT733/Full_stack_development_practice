
public class Address {
String city,country,state;
int pincode;
public Address(String city, String country, String state, int pincode) {
	super();
	this.city = city;
	this.country = country;
	this.state = state;
	this.pincode = pincode;
}
public Address() {
	super();
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [city=" + city + ", country=" + country + ", state=" + state + ", pincode=" + pincode + "]";
}

}
