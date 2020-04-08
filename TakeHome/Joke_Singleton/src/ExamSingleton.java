
public class ExamSingleton 
{
	private static ExamSingleton single_instance = null;
    public String s; 
    public static ExamSingleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new ExamSingleton(); 
  
        return single_instance; 
    }
    public String tellJoke()
    {
    	String str = null;
    	str = "Two Sardars were fixing a bomb in a car.\r\n" + 
    			"Sardar 1: What would you do if the bomb explodes while fixing?\r\n" + 
    			"Sardar 2: Don't worry, I have one more.";
    	return str;
    }

}
