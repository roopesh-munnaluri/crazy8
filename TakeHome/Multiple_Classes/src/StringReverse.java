
public class StringReverse 
{
	public String reverseString(String str) 
	{
		if(str == null || str.length()==0) 
		{
			return null;
		}
		else 
		{
			char temp;
	        char[] arr = str.toCharArray();
	     	int len = arr.length;
		    for(int i=0; i<(str.length())/2; i++,len--)
		    {
		    	temp = arr[i];
		        arr[i] = arr[len-1];
		        arr[len-1] = temp;
		     }
		     str = String.valueOf(arr);
		}
	    return str;
	}
}

