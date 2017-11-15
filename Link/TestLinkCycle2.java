package Link;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestLinkCycle2 {

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
		
		Link slow = a;
		
		Link fast = a;
		
		Link meet = null;
		
		while(slow !=null) {
			slow = slow.next;
			fast = fast.next;
			if(fast.next==null) {
				break;
			}
			fast = fast.next;
			
			if(slow == fast) {
				meet=slow;
				break;
			}
		}
		
		while(head!=null && meet!=null) {
			head=head.next;
			meet=meet.next;
			if(head == meet) {
				System.out.println(head.value);
				break;
			}
			
		}
		
		
	}
	
	static class Link{
		int value;
		Link next;
	}

}
