
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumInArray {

	public static void main(String[] args) {
	
		
		Integer a[] ={1,2,3,4};
		Integer b[]={1,1,1,1};
		
		List<Integer> list= new ArrayList<Integer>(Arrays.asList(a));
		List<Integer> list1= new ArrayList<Integer>(Arrays.asList(b));
		
		for(int i=0;i<a.length-1;i++)
		{
			int sum=0;
			sum=a[i]+a[i+1];
			if(list.contains(sum)){
				System.out.println("Yes");
				break;
			}
			
		}
		for(int i=0;i<b.length-1;i++)
		{
			int sum=0;
			sum=a[i]+a[i+1];
			if(list1.contains(sum)){
				System.out.println("Yes");
				break;
			}
			if(i==(b.length-2)){
				System.out.println("No");
			}
			
		}
		

	}

}
