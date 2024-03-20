package booking;

public class booking_return 
{
	private String name;
	private String password;
  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
private String busno;
  private String bustype;
  private String source;
  private String endpoint;
public String getBusno() {
	return busno;
}
public void setBusno(String busno) {
	this.busno = busno;
}
public String getBustype() {
	return bustype;
}
public void setBustype(String bustype) {
	this.bustype = bustype;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getEndpoint() {
	return endpoint;
}
public void setEndpoint(String endpoint) {
	this.endpoint = endpoint;
}
@Override
public String toString() {
	return "booking_return [name="+name+"busno=" + busno + ", bustype=" + bustype + ", source=" + source + ", endpoint=" + endpoint
			+ "]";
}
  
}
