package Link;

public class TestLinkPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link a = new Link();
		Link b = new Link();
		Link c = new Link();
		Link d = new Link();
		Link e = new Link();
		Link f = new Link();
		a.value=4;
		a.next=b;
		b.value=1;
		b.next=c;
		c.value=3;
		c.next=d;
		d.value=2;
		d.next=e;
		e.value=5;
		e.next=f;
		f.value=2;
		f.next=null;
		
		
		
		Link head = partition(a,3);
		while(head !=null) {
			System.out.println(head.value);
			head = head.next;
		}
		
	}
	
	static class Link{
		int value;
		Link next;
	}

	public static Link partition(Link head,int x) {
		Link nbegin=null;
		Link nsmall=null;
		Link nbig=null;
		
		while(head != null) {
			
			if(head.value>=x) {
				nbig=head;
	
			} 
			
			if(head.value<x) {
				if(nsmall == null) {
					nbegin = head;
					nsmall=head;
					//
					nbig.next=nsmall.next;
					nsmall.next=nbig;
				}else {
					if(nbig!=null) {
						Link temp = head;
						nbig.next=temp.next;
						temp.next=nsmall.next;
						nsmall.next=temp;
						nsmall=temp;
					}
				}
			}
			
			head=head.next;
			
		}
		
		return nbegin;
	}
	
	
}
