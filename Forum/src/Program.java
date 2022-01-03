import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of posts ");
		int count=Integer.parseInt(sc.nextLine());
		int i=1;
		List<User> UserList=new ArrayList<User>();
		List<Post> PostList=new ArrayList<Post>();
		do {
			System.out.println("enter the post details");
			String details=sc.nextLine();
			User userObj=new User();
			userObj=userObj.createUser(details);
			UserList.add(userObj);
			
			System.out.println("enter the post details");
			String postDetails=sc.nextLine();
			Post postObj=new Post();
			postObj=postObj.CreatePost(postDetails,userObj);
			PostList.add(postObj);
			i++;
		}while(i<count);
		
		postBO obj=new postBO();
		System.out.println("enter your search condition by \n1.name \n2.by downvotes");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			System.out.println("enter the name");
			String userName=sc.nextLine();
			PostList=obj.FindPost(PostList, userName);
			System.out.println(PostList.get(0));
		case 2:
			System.out.println("enter the votes");
			int upvote=Integer.parseInt(sc.nextLine());
			obj.FindPost(PostList, upvote);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
