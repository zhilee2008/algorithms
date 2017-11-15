package Link;

public class TestMergeTwoLink {
	
	// 首先每个链表都是有序的

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link a = new Link();
		Link b = new Link();
		Link c = new Link();
		Link c1 = new Link();
		a.value=1;
		a.next=b;
		b.value=4;
		b.next=c;
		c.value=6;
		c.next=null;

		
		Link d = new Link();
		Link e = new Link();
		Link f = new Link();
		Link f1 = new Link();
		
		d.value=0;
		d.next=f;
		f.value=7;
		f.next=f1;
		f1.value=8;
		f1.next=null;
		

		Link head =merge(a,d);
		while(head !=null) {
		System.out.println(head.value);
		head = head.next;
	}
		
	}
	
	static class Link{
		int value;
		Link next;
	}
	
	public static Link merge(Link I1,Link J1) {
		
		Link head=new Link();
		Link temp = null;
		while(I1!=null||J1!=null) {
			if(I1.value>J1.value) {
				if(head.next==null) {
					head=J1;
				}else {
					if(temp==null) {
						head.next=J1;
						temp = head.next;
					}else {
						if(J1!=null) {
							temp.next = J1;
							temp=temp.next;
						}
					}
				}
				J1 = J1.next;
				
			}else {
				if(head.next==null) {
					head=I1;
				}else {
					if(temp==null) {
						head.next=I1;
						temp = head.next;
					}else {
						if(I1!=null) {
							temp.next = I1;
							temp=temp.next;
						}
					}
				}
				I1 = I1.next;
			}
			
			if(J1==null) {
				temp.next = I1;
				break;
			}
			if(I1==null) {
				temp.next = J1;
				break;
			}
		}
		
		
		return head;
	}

}
