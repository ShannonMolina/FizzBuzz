/****************************************************************************
*FizzBuzz.java
*Write a program that prints the integers from   1   to   100   (inclusive).
*
*
*But:
*
*  for multiples of three,   print   Fizz     (instead of the number)
*  for multiples of five,   print   Buzz     (instead of the number)
*  for multiples of both three and five,   print   FizzBuzz     (instead of the number)
****************************************************************************/

public class FizzBuzz
{
	public static void main(String[] args)
	{
		for (int i=0; i<101; ++i)
		{
			//multiples of 3 AND 5 --> FizzBuzz
        	if (i % 15 == 0)
            System.out.println("FizzBuzz");

		    //multiples of 3 --> Fizz
        	else if (i % 3 == 0)
            	System.out.println("Fizz");

       		//multiples of 5 --> Buzz
       		else if (i % 5 == 0)
            System.out.println("Buzz");

        	//not a multiple --> #
        	else
            System.out.println(i);
   		}

	}
}
