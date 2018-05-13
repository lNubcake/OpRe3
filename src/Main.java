import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);
		ArrayList<ATask> Tasks = new ArrayList<ATask>();
		ArrayList<String> TextToProcess = new ArrayList<String>();
		
		// Scanning in text till EOF
		while(myScanner.hasNextLine())
		{
			TextToProcess.add(myScanner.nextLine());
		}
		myScanner.close();
		// Converts the text to tasks
		try{
		Tasks = TextProcessor(TextToProcess);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
	}

	public static ArrayList<ATask> TextProcessor(ArrayList<String> TextToProcess)
	{
			ArrayList<ATask> Result = new ArrayList<ATask>();
			
			for(String currentLine : TextToProcess)
			{
					String[] split = currentLine.split(",");
					if(split.length != 0)
						Result.add(new ATask(split[0]));
					for(int i = 1; i < split.length; i++)
					{
						Result.get(Result.size()-1).Operations.addLast(split[i]);
					}
			}
			
			return Result;
	}
}
