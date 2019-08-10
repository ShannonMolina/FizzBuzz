/****************************************************************************
*FizzBuzz.cpp
*Write a program that prints the integers from   1   to   100   (inclusive).
*
*
*But:
*
*  for multiples of three,   print   Fizz     (instead of the number)
*  for multiples of five,   print   Buzz     (instead of the number)
*  for multiples of both three and five,   print   FizzBuzz     (instead of the number)
****************************************************************************/

#include <iostream>
using namespace std;

int main()
{
    //for #s 1-100
    for (int i = 1; i < 101; ++i)
    {
        //multiples of 3 --> Fizz
        if (i % 3 == 0)
            cout << "Fizz";

        //multiples of 5 --> Buzz
        else if (i % 5 == 0)
            cout << "Buzz";

        //multiples of 3 AND 5 --> FizzBuzz
        else if (i % 15 == 0)
            cout << "FizzBuzz";

        //not a multiple --> #
        else
            cout << i;

        cout << endl;
    }
}
