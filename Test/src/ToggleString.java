import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder newString = new StringBuilder();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(Character.isLowerCase(c[i]))
			{
				
				newString.append(Character.toUpperCase(c[i]));
			}
			else{
				
				newString.append(Character.toLowerCase(c[i]));
		}
		}
		System.out.println(newString);
		
		}
	}


