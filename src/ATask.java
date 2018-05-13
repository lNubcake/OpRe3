import java.util.LinkedList;

public class ATask 
{
	String Name;
	LinkedList<String> Operations;
	
	ATask(String NameToSet)
	{
		Name = NameToSet;
		Operations = new LinkedList<String>();
	}
}
