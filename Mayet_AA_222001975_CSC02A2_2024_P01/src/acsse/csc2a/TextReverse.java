package acsse.csc2a;

/**
*This class stores information about the Reversed Text.{ @link TextReverse#TextReverse}
*@author 222001975 - Abdullah A Mayet
*@version P01
*/

public class TextReverse 
{
	/**
	Basic constructor for TextReverse
	No parameters
	*/

	/**
	Changes string to reversed string
	Parameters:
		@param aryContents - Array of Char
		@param intLength - Length of Array
	*/
    public void transform(char[] aryContents, int intLength)
    {
        char[] aryReversed = new char[intLength];
        int r = 0;
        
        for (int i = (intLength - 1); i >= 0; i--)
        {
            aryReversed[r++] = aryContents[i];
        }
        
        for (int i = 0; i < intLength; i++)
        {
        	aryContents[i] = aryReversed[i];
        }
    }
}