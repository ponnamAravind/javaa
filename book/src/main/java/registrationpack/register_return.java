package registrationpack;

public class register_return 
{
 private String name;
 private  String email;
 private String number;
 private String password;
public String getName() 
{
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getnumber() {
	return number;
}
public void setnumber(String number) {
	this.number = number;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) 
{
	this.password = password;
}
@Override
public String toString() {
	return "register_return [name=" + name + ", email=" + email + ", number=" + number + ", password=" + password
			+ "]";
}

}
