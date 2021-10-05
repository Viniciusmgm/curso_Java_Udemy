package continuacao_POO.composicao.post.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import continuacao_POO.composicao.post.entities.Comment;
import continuacao_POO.composicao.post.entities.Post;

public class PostAndComment {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
						   sdf.parse("25/12/2007 14:26:37"), 
						   "Traveling to New Zealand", 
						   "I'm going to visit this wonderful country", 
						   12
						   );
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good Night");
		Comment c4 = new Comment("May the Force with you");
		Post p2 = new Post(
						   sdf.parse("01/02/2017 15:46:57"), 
						   "Good night guys", 
				           "See you tomorrow", 
				           5
				           );
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1.toString());
		
	}
}
