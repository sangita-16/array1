package ArrayCode;

public class Find_Uniq_Array {
	public static void main(String[]arg)
	{
		int []a= {1,2,3,1,2};
		int uniq=a[0];
		for(int i=1;i<a.length;i++)
			
		{
			uniq=uniq^a[i];
		}
		System.out.println(uniq);
		
	}
	}
	