import java.util.Scanner;

public class week {
    public static void main(String[]args){
        System.out.println("enter a number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:System.out.println("Day-Monday");
            break;
            case 2:System.out.println("Day-tuesday");
            break;
            case 3:System.out.println("Day-wednesday");
            break;
            case 4:System.out.println("Day-thrusday");
            break;
            case 5:System.out.println("Day-friday");
            break;
            case 6:System.out.println("Day-satrday");
            break;
            case 7:System.out.println("Day-sunday");
            break;
            default:System.out.println("invalid day"); 
        }
    }
    
}
