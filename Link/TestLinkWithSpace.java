package Link;
import java.util.ArrayList;
import java.util.List;

public class TestLinkWithSpace {

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
		
//		Link head = a;
//		while(head !=null) {
//			System.out.println(head.value);
//			head = head.next;
//		}
		List<Link> list = new ArrayList<Link>();
		Link head = a;
		while(head !=null) {
			list.add(head);
			head = head.next;
		}
		
		for(int i=list.size()-1;i>=0;i--) {
			if(i==0) {
				list.get(i).next=null;
			}else {
				list.get(i).next = list.get(i-1);
			}
			
		}
		
		Link headS = e;
		while(headS !=null) {
			System.out.println(headS.value);
			headS = headS.next;
		}
		
		
	}
	
	static class Link{
		int value;
		Link next;
	}

}
