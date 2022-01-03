import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Post{
private Long id;
private String content;
private String type;
private Date postedTime;
private User postedBy;
private int numberOfUpVotes;
private int numberOfDownVotes;



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Date getPostedTime() {
	return postedTime;
}
public void setPostedTime(Date postedTime) {
	this.postedTime = postedTime;
}
public User getPostedBy() {
	return postedBy;
}
public void setPostedBy(User postedBy) {
	this.postedBy = postedBy;
}

public int getNumberOfUpvotes() {
	return numberOfUpVotes;
}
public void setNumberOfUpvotes(int numberOfUpVotes) {
	this.numberOfUpVotes = numberOfUpVotes;
}
public int getNumberOfDownloads() {
	return numberOfDownVotes;
}
public void setNumberOfDownloads(int numberOfDownVotes) {
	this.numberOfDownVotes = numberOfDownVotes;
}



public Post(Long id, String content, String type, Date postedTime, User postedBy, int numberOfUpVotes,
		int numberOfVotes) {
	super();
	this.id = id;
	this.content = content;
	this.type = type;
	this.postedTime = postedTime;
	this.postedBy = postedBy;
	this.numberOfUpVotes = numberOfUpVotes;
	this.numberOfDownVotes = numberOfDownVotes;
}



public Post() {
	super();
	// TODO Auto-generated constructor stub
}



@Override
public String toString() {
	return "Post [id=" + id + ", content=" + content + ", type=" + type + ", postedTime=" + postedTime + ", postedBy="
			+ postedBy + ", numberOfUpVotess=" + numberOfUpVotes + ", numberOfDownVotes=" + numberOfDownVotes + "]";
}



@Override
public int hashCode() {
	return Objects.hash(content, id, numberOfDownVotes, numberOfUpVotes, postedBy, postedTime, type);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Post other = (Post) obj;
	return Objects.equals(content, other.content) && Objects.equals(id, other.id)
			&& numberOfDownVotes == other.numberOfDownVotes && numberOfUpVotes == other.numberOfUpVotes
			&& Objects.equals(postedBy, other.postedBy) && Objects.equals(postedTime, other.postedTime)
			&& Objects.equals(type, other.type);
}



public static Post CreatePost(String detail,User user)throws NumberFormatException, ParseException {
	SimpleDateFormat sdf=new SimpleDateFormat();
	Post post=new Post(Long.parseLong(detail.split(",")[0]),
			detail.split(",")[1],detail.split(",")[2],
			sdf.parse(detail.split(",")[3]),User.createUser(detail.split(",")[4]),Integer.parseInt(detail.split(",")[5]),
			Integer.parseInt(detail.split(",")[6]));
		
	
	return post;
	
}

	
	
	
	
}
