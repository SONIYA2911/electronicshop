import java.util.ArrayList;
import java.util.List;

public class postBO {

public List<Post>FindPost(List<Post>postList,String name){
	{
		List<Post>list1=new ArrayList<Post>();
		for (Post post : postList) {
			if(post.getPostedBy().equals(list1))
			{
				list1.add(post);
			}
			
		}
		return list1;
	}
		
}
public List<Post> FindPost(List<Post> postList,int numberOfUpVotes){
	List<Post>list2=new ArrayList<Post>();
	for(Post post:postList) {
		if(post.getNumberOfUpvotes().) {
			list2.add(post);
		}
	}
	return postList;
}
}