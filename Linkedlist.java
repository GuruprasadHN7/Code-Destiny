public class Linkedlist {

     NODE head;           //creating an head node
    static class NODE{
        int data;
        NODE next;
        NODE(int d){
            data=d;
            next=null;
        }
    }


    public void Print(){
        NODE n = head;
        while(n!=null){
            System.out.println(n.data+" "); // print the data in the NODE
            n=n.next;
        }
    }
     public static void main(String args[]){
         Linkedlist ld= new Linkedlist();
          ld.head=new NODE(1);         // define the head node
         NODE second=new NODE(2);       //created the second node
         NODE third=new NODE(3);       //created the third node

         ld.head.next=second;      //head.next=second refer second node
         second.next=third;
         third.next=null;
         ld.Print();
     }


}
