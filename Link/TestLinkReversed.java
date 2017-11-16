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
		 head =a;
		while(head !=null) {
			System.out.println(head.value);
			head = head.next;
		}
		
	}
	
	public static Link linkReversed(Link head,int m, int n) {
		// 1 2 3 4 5
		
		Link temphead=null;
		Link temptail=null;
		
		Link temp = null;
		Link tempNext = null;
		Link tempM = null;
		Link tempN = null;
		
		int i = 1;
		while(head != null) {
			if(i==m-1) {
				temphead = head;
			}
			if(i==m) {
				tempM = head;
			}
			
			if(i==n) {
				tempN = head;
				temptail = head.next;
				temphead.next=tempN;
				tempM.next=temptail;
			}
			if(i>n) {
				head = head.next;
			}else {
				if(i>=m) {
					tempNext = head.next;
					head.next = temp;
					temp = head;
					head = tempNext;
				}else {
					head = head.next;
				}
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
