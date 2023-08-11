
import java.util.*;
class node{
    int data;
     node next;
    
 node(int d){
    this.data=d;
    this.next =null;
        }
    }

public class linked_list {
    node first=null,last=null;
    int size=0;
    public void printlinkedlist(){
        node temp =first;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }

    }
    public void add(int element){
        node newnode = new node(element);
        if(first==newnode){
            first=last=newnode;
            size++;
        }
       else {
        last.next=null;
        last=null;

        }
    }

public static void main(String[] args) {
    linked_list ll = new linked_list();
       ll.add(10);
       ll.add(20);
       ll.add(30);
       ll.add(40);
       ll.add(50);
       ll.add(60);
       ll.add(70);
       ll.printlinkedlist();     
