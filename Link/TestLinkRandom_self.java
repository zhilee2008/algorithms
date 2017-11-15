
package Link;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestLinkRandom_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link a = new Link();
		Link b = new Link();
		Link c = new Link();
		Link d = new Link();
		Link e = new Link();
		a.value=1;
		a.random=c;
		a.next=b;
		b.value=2;
		b.random=a;
		b.next=c;
		c.value=3;
		c.random=null;
		c.next=d;
		d.value=4;
		d.random=e;
		d.next=e;
		e.value=5;
		e.random=e;
		e.next=null;
		
		
		Link head = randomLink(a);
//		a.next=e;
		while(head !=null) {
			System.out.println("value:"+head.value+";random:"+head.random+";next:"+head.next);
			head = head.next;
		}
		
		
		
	}
	
	static class Link{
		int value;
		Link random;
		Link next;
	}
	
	public static Link randomLink(Link a) {
		
		Link head =a;
		List<Link> list = new ArrayList<Link>();
		int i=0;
		Map map = new HashMap();
		while(head!=null) {
			map.put(head, i);
			Link node = new Link();
			node.value=head.value;
			list.add(node);
			head = head.next;
			i++;
		}
		
		
		int j=0;
		head=a;
		while(head!=null) {
			if(j<list.size()-1) {
				list.get(j).next=list.get(j+1);
			}
			if(head.random!=null) {
				Link test = head.random;
				int r= (int) map.get(test);
				Link random = list.get(r);
				list.get(j).random = random;
			}
			head = head.next;
			j++;
		}
		
		
		return list.get(0);
	}

}
