package testold;
import java.util.ArrayList;
import java.util.List;

public class TestLinkIntersect {
	 

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Link a = new Link();
		Link b = new Link();
		Link c = new Link();
		Link d = new Link();
		Link e = new Link();
		Link f = new Link();
		Link g = new Link();
		a.value = 1;
		a.next = b;
		b.value = 2;
		b.next = c;
		c.value = 3;
		c.next = d;
		d.value = 4;
		d.next = e;
		e.value = 5;
		e.next = f;
		f.value = 6;
		f.next = g;
		g.value = 7;
		g.next = null;
		
		Link a_ = new Link();
		Link b_ = new Link();
		Link c_ = new Link();
		Link d_ = new Link();

		a_.value = 11;
		a_.next = b_;
		b_.value = 22;
		b_.next = c_;
		c_.value = 33;
		c_.next = d_;
		d_.value = 44;
		d_.next = c;
		
		
		
		Link headA = a;
		int Alength = 0;
		
		while(headA !=null) {
			Alength++;
			headA = headA.next;
		}
		
		Link headB = a_;
		int Blength = 0;
		
		while(headB !=null) {
			Blength ++;
			headB = headB.next;
		}
		
		
		if(Alength < Blength) {
			headA = a;
			headB = a_;
			int i=0;
			while(i!=Blength-Alength) {
				headB=headB.next;
				i++;
			}
		}else {
			headB = a_;
			int i=0;
			while(i!=Alength-Blength) {
				headA=headA.next;
				i++;
			}
		}
		
		Link headIntersect = null;
		while(headA != null&& headB !=null) {
            if(headA.next == headB.next) {
            		headIntersect=headA.next ;
            		System.out.println(headIntersect.value);
				break;
			}
			headA = headA.next;
			headB = headB.next;
			
		}
		

	}
	


	static class Link {
		int value;
		Link next;
	}

}
