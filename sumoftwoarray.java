public class sumoftwoarray {

   public static void printarray(int []t){
        for(int i:t) System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[]mat1  = new int[]{3,5,7,4};
         int[]mat2  = new int[]{5,4,8,5};
         int []mat3=new int[mat1.length];
        
         for(int i=0;i<mat1.length;i++){
            mat3[i]=mat1[i]+mat2[i]; 
         }
        
         printarray(mat1);
         printarray(mat2);
         printarray(mat3);
         

    }
}