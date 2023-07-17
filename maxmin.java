

public class maxmin{
    public static void main(String[] args) {
int[] arr = new int[]{3,54,87,5,9,76,46,345,43,57,68,345};
    int min =3;
    int max =-600;
    for (int i=0;i<arr.length;i++){ 
        if (arr[i]<min )
        min=arr[i];
        if(arr[i]>max )
        max=arr[i];
        }      
                System.out.println("min no is-"+min);
                System.out.println("max no is-"+max);
    }
}