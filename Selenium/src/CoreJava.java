
public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum=5;
		System.out.println(myNum+" is the number 5");
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		/*String[] name= {"fasiha","neha","shaeesta"};
		for(String s:name)
		{
			System.out.println(s);
		}*/
	}

}
