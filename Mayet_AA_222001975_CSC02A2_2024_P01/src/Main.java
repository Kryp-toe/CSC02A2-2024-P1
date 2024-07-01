import java.util.Scanner;
import acsse.csc2a.*;

/**
*This class is the Main class.{ @link Main#Main}
*@author 222001975 - Abdullah A Mayet
*@version P01
*/

public class Main
{
    public static void main(String[] args)
    {
    	//Scanner object (used for input)
    	Scanner scanner = new Scanner(System.in);
    	
        int maximum = 15;
        System.out.println("Please enter text to be reversed [" + maximum + " chars]:");
		
        String strIn = scanner.nextLine();
        
		int length = strIn.length();
		
        TextStore txtInput = new TextStore(strIn.toCharArray(), length);
        
        txtInput.transform();
        
		System.out.print("Reversed word: ");
        for (int i = 0; i < txtInput.getLength(); i++)
        {
        	System.out.print(txtInput.getCharAt(i));
        }
		System.out.println(' ');
    }
}