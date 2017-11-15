package Link;

public class TestLinkReversed {

	//实现链表逆序
	//给出m 和 n 逆序m和n之间的节点
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
		
		int m=2,n=4;
		
		Link head = linkReversed(a,m,n);
		while(head !=null) {
			System.out.println(head.value);
			head = head.next;
		}
		
	}
	
	public static Link linkReversed(Link head,int m, int n) {
		
		int from = m;
		
		int to = n;
		
		if (m>n) {
			from = n;
			to = m;
		}
		
		Link newHead = null;
		Link temp = null;
		Link mPre = null;
		int i = 1;
		while(head != null) {
			
			if(i>to) {
				head = head.next;
			}
			
			if(i<from) {
				newHead = head;
				head = head.next;
			}else {
				temp = head.next;
				head.next=newHead;
				newHead = head;
				head = temp;
			}

			i++;
		}
		
		return head;
	}
	
	static class Link{
		int value;
		Link next;
	}

}
