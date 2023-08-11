
//generic Array list
class Myarraylist <box> {

    int defaul_cap = 10;
    private box[] arr;
    int size=0;
    int last=0;

    Myarraylist(){
        arr = (box[]) new Object[defaul_cap];
    }

    Myarraylist(int cap){
        this.defaul_cap = cap;
        arr = (box[]) new Object[defaul_cap];
    }

    public void print(){
        for(box i: arr) {
         if(i!=null)
              System.out.print(i + " ");
        }
        System.out.println();
    }
     public box[] add_element(){
      
            System.out.println("Size Exceeded... So we are doubling your array - ");
            box[] newArr = (box[]) new Object[arr.length*2];
            for(int i=0;i<arr.length;i++)
                newArr[i]=arr[i];

            return newArr;

     }

    public void add(box element){
        if(last==arr.length)
          arr = add_element();

          arr[last]=element;

        last++;
        size++;
    }
 
   public void add_at_index(int ind,box element){
      if(last==arr.length){
         add_element();
      }
   }

   public box remove(){
      if(last==0){
         System.out.println("array is empty");
          return null;
      }
      box ret= arr[last-1];
      arr[last-1]=null;
         size--;
        last++;
        return ret;
   }
public box removeAtindex(int ind){
    if(last==0 ||ind >= last){ 
   if(last == 0)
   System.out.println("array is empty");
   else
   System.out.println("array is outofbound");
   return null;
}
box res = arr[ind];
for(int i=ind;i<last;i++)
    arr[i] = arr[i+1];
last --;
size --;
return res;
}


}

public class arraylistDS{
    public static void main(String[] args) {
        Myarraylist<Integer> ar_list = new Myarraylist<>();
       ar_list.add(10);
       ar_list.add(20);
       ar_list.add(30);
       ar_list.add(40);
       ar_list.add(50);
       ar_list.add(60);
       ar_list.add(70);
       ar_list.add(80);
       ar_list.add(90);
       ar_list.add(100);
       ar_list.add(110);
       ar_list.add(120);
        ar_list.print();

        // ar_list.remove();
        // ar_list.print();
        
        ar_list.removeAtindex(4);
        ar_list.print();
        System.out.println("size - "+ar_list.size);
    }
}