package acsse.csc2a;

/**
*This class stores information about the Text.{ @link TextStore#TextStore}
*@author 222001975 - Abdullah A Mayet
*@version P01
*@see TextReverse A related class
*/

public class TextStore
{
    private int length;
    private char[] contents;
    private TextReverse rTransform;
    
	/**
	Basic constructor for TextStore
	No parameters
	*/
    public TextStore()
    {
        length = 1;
        contents = new char[1];
        contents[0] = ' ';
        rTransform = new TextReverse();
    }
    
	/**
	Basic constructor for TextStore
	Parameters:
		@param strContents - Array of Char
		@param intLength - Length of Array
	*/
    public TextStore(char[] strContents, int intLength)
    {
        length = intLength;
        contents = new char[intLength];
        for(int i=0; i < length; i++)
        {
            contents[i] = strContents[i];
        }
        rTransform = new TextReverse();
    }
    
	/**
	Accessor for Length of Array
	@return length
	*/
    public int getLength()
    {
        return length;
    }
    
	/**
	Creates instance of TextReverse
	*/
    public void transform()
    {
        rTransform.transform(contents, length);
    }
	
	/**
	Gets a char from reversed word
	Parameters:
		@param index - position of char
	@return char
	*/
	public char getCharAt(int index)
	{
		return contents[index];
	}
}