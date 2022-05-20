package ArrayInJava;

public class VariableLength {
    public static void main(String[] args){
        printMax(12.5,17.8,20.6,14.8,19.0);//passing variable of arguments
        printMax(new double[]{12.5,17.8,20.6,14.8,19.0});//passing anonymous array
    }
    public static void printMax(double ... nums){
        double highest=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>highest){
                highest=nums[i];
            }
        }
        System.out.println("Max num: " + highest);
    }
}
