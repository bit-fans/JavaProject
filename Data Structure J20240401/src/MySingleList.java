import java.util.List;

public class MySingleList implements IList{

    static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

     public ListNode head;

    public void createList(){

        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);


        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;
        head=node1;

    }


    @Override
    public void addFirst(int data) {
        ListNode p=new ListNode(data);
        p.next=head;
        head=p;

    }

    @Override
    public void addLast(int data) {
        ListNode p=new ListNode(data);
        if(head==null){
         head=p;
        }else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = p;
        }
    }

    @Override
    public void addIndex(int index, int data) {
        ListNode p=new ListNode(data);

        int count=0;

        if(index==0){
            addFirst(data);
        }else if(index==size()){
            addLast(data);
        }else {
            ListNode cur=SearchPrev(index);
            p.next=cur.next;
            cur=p;
        }
    }

    private ListNode SearchPrev(int index){
        ListNode cur=head;
        int count=0;
        while(count!=index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }

    @Override
    public boolean contains(int key) {
        ListNode p=head;
        while(p!=null){
            if(p.val==key){
                return true;
            }
            p=p.next;
        }
        return false;
    }

    @Override
    public void remove(int key) {
        if (head==null){
            return;
        }
        if(head.val==key){
            head=head.next;
        }
        if(!contains(key)){
            System.out.println("无所指结点");
        }else {
            ListNode cur=findPrevKey(key);
            cur.next=cur.next.next;

        }
    }

    private ListNode findPrevKey(int key){
        ListNode cur=head;
        while(cur.next!=null){
            if(cur.next.val==key){
                return cur;
            }else {
                cur=cur.next;
            }
        }
        return null;
    }

    @Override
    public void removeAllKey(int key) {
        ListNode cur=head.next;
        ListNode prev=head;

        while(cur!=null){
            if(cur.val==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }

        if(head.val==key){
            head=head.next;
        }



    }

    @Override
    public int size() {
        ListNode p=head;
        int count=0;
        while(p!=null){
            count++;
            p=p.next;
        }
        return count;
    }

    @Override
    public void clear() {
        head=null;
    }

    @Override
    public void display() {
        ListNode cur=head;
        while(cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }
}
