package testold;
import java.util.ArrayList;
import java.util.List;

public class TestLinkReversedB {
	 

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

		// Link head = a;
		// while(head !=null) {
		// System.out.println(head.value);
		// head = head.next;
		// }
		
		

		Link start = b;
		Link m = b;
		Link n = e;

		Link temp = null;

		Link begin = null;
		Link end = n.next;

		Link head = a;
		while (head != null) {
			if (head.next == m) {
				begin = head;
			}

			if (head == m) {
				Link N = head.next;
				head.next = temp;
				temp = head;
				head = N;
				m = N;
			} else {
				head = head.next;
			}

			if (head == end) {
				begin.next = n;
				start.next = head;
				break;
			}

		}
		head = a;
		while (head != null) {
			System.out.println(head.value);
			head = head.next;
		}

	}
	


	static class Link {
		int value;
		Link next;
	}

}
