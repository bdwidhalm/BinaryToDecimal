import java.util.Scanner;
/**
 * 
 * @author brianwidhalm
 *
 */
public class BinaryToDecimal 
{
	
	public static void main(String[] args)
	{
		int binaryNumber;
		String binaryString;
		int binaryLength;
		int bitCheck;
		int counter = 1;
		int decimalNumber = 0;
		int multiplier = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter binary number to convert: ");
		binaryNumber = input.nextInt();

		binaryString = Integer.toString(binaryNumber);

		binaryLength = binaryString.length();

		
		while (counter <= binaryLength)
		{
			if (counter == 1)
			{
				bitCheck = Integer.parseInt(binaryString.substring(binaryLength - counter));
			}
			else
			{
				bitCheck = Integer.parseInt(binaryString.substring(binaryLength - counter, binaryLength - counter + 1));
			}
			
			counter = counter + 1;
			
			decimalNumber = decimalNumber + bitCheck * multiplier;
			multiplier = multiplier * 2;
			
		}
		
		System.out.printf("        Binary Number: %s \nDecimal equivalant is: %d", binaryString, decimalNumber);
		
	}

}
