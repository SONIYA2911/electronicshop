import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class User {
private Long id;
private String name;
private String emailId;
private Date dateOfBirth;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public User(Long id, String name, String emailId, Date dateOfBirth) {
	super();
	this.id = id;
	this.name = name;
	this.emailId = emailId;
	this.dateOfBirth = dateOfBirth;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public static User createUser(String details) throws NumberFormatException, ParseException {
	SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
	
	User user=new User(Long.parseLong(details.split(",")[0]),details.split(",")[1],details.split(",")[2],sdf.parse(details.split(",")[3]));

return user;

}}