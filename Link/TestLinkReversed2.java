package Link;

public class TestLinkReversed2 {

	//实现链表逆序
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link a = new Link();
		Link b = new Link();
		Link c = new Link();
		Link d = new Link();
		Link e = new Link();
		a.value=1;
		a.next=b;
		b.value=2;
		b.next=c;
		c.value=3;
		c.next=d;
		d.value=4;
		d.next=e;
		e.value=5;
		e.next=null;
		
		Link head = linkReversed(a);
		while(head !=null) {
			System.out.println(head.value);
			head = head.next;
		}
		
	}
	
	public static Link linkReversed(Link head) {
		Link newHead = null;
		Link temp = null;
		
		while(head != null) {
			temp = head.next;
			head.next = newHead;
			newHead = head;
			head = temp;
		}
		
		return newHead;
	}
	
	static class Link{
		int value;
		Link next;
	}

}
