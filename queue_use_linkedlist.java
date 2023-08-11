class quelinkedlist{
    node  front,rear;
    int Size=0;


 quelinkedlist(){
    front=rear=null;
    Size=0;
  }


public void print(){
        node temp =front;
        while(temp !=null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

 
 
 public void enqueue(int element){
    node Newnode = new node(element);
     if(rear== null && front==null){
     rear=front=Newnode;
     }
     else{
     rear.next = Newnode;
     rear=Newnode;
     }
     Size++;
 }
  

 public int dequeue(){
     int result=-1;
 if(rear==null&&front==null){
 System.out.println(" queue is null");
 return result;
 }
 else{
    result = front.data;  

     front = front.next;
 

 
    Size--;
    return result;
 }
}
}
  

 
public class queue_use_linkedlist {
    public static void main(String[] args) {
       quelinkedlist que =new  quelinkedlist(); 
       que.enqueue(10);
        que.enqueue(20);
         que.enqueue(30);
          que.enqueue(40);
           que.enqueue(50); 
            que.enqueue(60); 
           que.print();
    }

}
