package ArrayInJava;
//short reverse method in java
public class ArrayReference {
    public static void main(String[] args){
        int[] arr={15,18,21,24,30};
        for(int i:reverse(arr))System.out.println(i);
    }
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for(int i=0, j=list.length-1;i<list.length;i++,j--)result[j] = list[i];
        return result;
    }
}
