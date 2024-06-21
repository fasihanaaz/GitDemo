import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = {2,4,6,8,10,12,14,15,17};
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("fasiha");
		arr.add("naaz");
		arr.add("imnaaya");
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		for(String val:arr)
		{
			System.out.println(val);
		}
		System.out.println(arr.contains("fasiha"));
		String[] names=	{"fas","naaz","nde"};
		
		List<String> newList=Arrays.asList(names);
		System.out.println(newList.contains("naaz"));
		
		String s="fasiha naaz";
		for(int i=s.length()-1;i>=0;i--)
		{
			
			System.out.println(s.charAt(i));
		}
	}
}
