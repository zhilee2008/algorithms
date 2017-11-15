package Link;

import java.util.ArrayList;
import java.util.List;

public class TestMergeKLink {
	
	// 首先每个链表都是有序的

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link a = new Link();
		Link b = new Link();
		Link c = new Link();
		a.value = 1;
		a.next = b;
		b.value = 4;
		b.next = c;
		c.value = 6;
		c.next = null;
		
//Link p = new Link();
//Link q = new Link();
//Link r = new Link();
//Link s = new Link();
//
//p.value=3;
//p.next=q;
//q.value=5;
//q.next=r;
//r.value=13;
//r.next=s;
//s.value=15;
//s.next=null;


Link a2 = new Link();
Link b2 = new Link();
Link c2 = new Link();
a2.value = 11;
a2.next = b2;
b2.value = 13;
b2.next = c2;
c2.value = 15;
c2.next = null;




		Link d = new Link();
		Link e = new Link();
		Link f = new Link();

		d.value = 0;
		d.next = e;
		e.value = 7;
		e.next = f;
		f.value = 8;
		f.next = null;
		
		Link d2 = new Link();
		Link e2 = new Link();

		d2.value = 9;
		d2.next = e2;
		e2.value = 10;
		e2.next = null;
		
		List<Link> lists = new ArrayList<Link>();
		lists.add(a);
		lists.add(a2);
		lists.add(d);
		lists.add(d2);
	

		List headList = MergeKList(lists);
		Link head = (Link)headList.get(0);
		while (head != null) {
			System.out.println(head.value);
			head = head.next;
		}

	}

	static class Link {
		int value;
		Link next;
	}

	public static List merge(Link I1, Link J1) {
		
		List list = new ArrayList();

		Link head = new Link();
		Link temp = null;
		while (I1 != null || J1 != null) {
			if (I1.value > J1.value) {
				if (head.next == null) {
					head = J1;
				} else {
					if (temp == null) {
						head.next = J1;
						temp = head.next;
					} else {
						if (J1 != null) {
							temp.next = J1;
							temp = temp.next;
						}
					}
				}
				J1 = J1.next;

			} else {
				if (head.next == null) {
					head = I1;
				} else {
					if (temp == null) {
						head.next = I1;
						temp = head.next;
					} else {
						if (I1 != null) {
							temp.next = I1;
							temp = temp.next;
						}
					}
				}
				I1 = I1.next;
			}

			if (J1 == null) {
				temp.next = I1;
				break;
			}
			if (I1 == null) {
				temp.next = J1;
				break;
			}
		}
		list.add(head);
		return list;
	}
	
	public static List MergeKList(List lists) {
		
		if(lists.size()==0) {
			return null;
		}
		
		if(lists.size()==1) {
			return lists;
		}
		
		if(lists.size()==2) {
			return merge((Link)lists.get(0),(Link)lists.get(1));
		}
		
		List<Link> list1 = new ArrayList<Link>();
		List<Link> list2 = new ArrayList<Link>();
		
		int mid = lists.size()/2;
		
		for(int i=0;i<mid;i++) {
			list1.add((Link) lists.get(i));
		}
		
		for(int i=mid;i<lists.size();i++) {
			list2.add((Link) lists.get(i));
		}
		
		List list1Node=MergeKList(list1);
		List list2Node=MergeKList(list2);
		
		
		return merge((Link)list1Node.get(0),(Link)list2Node.get(0));
		
	}
	

}
