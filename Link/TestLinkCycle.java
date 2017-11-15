package Link;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestLinkCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link a = new Link();
		Link b = new Link();
		Link c = new Link();
		Link d = new Link();
		Link e = new Link();
		Link f = new Link();
		Link g = new Link();
		a.value=1;
		a.next=b;
		b.value=2;
		b.next=c;
		c.value=3;
		c.next=d;
		d.value=4;
		d.next=e;
		e.value=5;
		e.next=f;
		f.value=6;
		f.next=g;
		g.value=7;
		g.next=c;
		
		Link head = a;
		Set set= new HashSet();
		while(head !=null) {
			System.out.println(head.value);
			set.add(head);
			head = head.next;
			if(set.contains(head)) {
				System.out.println("head:"+head.value);
				 break;
			}
			
		}
		
	}
	
	static class Link{
		int value;
		Link next;
	}

}
