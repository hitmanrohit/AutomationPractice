package arraydemo;

public class Arraydemo1 {
public static void main(String[] args) {
	int[]nums=new int[] {1,3,4,5,6};
	double sum=0,avg;
	for(int number:nums) {
		sum+=number;
	}
	int arraylength=nums.length;
	avg=sum/arraylength;
	System.out.println("THe average of given numbers= "+avg);
	System.out.println(nums[0]);
}
}
