import java.util.Scanner;

public class Main
{   

    public static int exercise1A(int num)
    {
        int evenDigits = 0;
        num = Math.abs(num);
        while(num > 0)
        {
            if(num % 2 == 0)
            {
                evenDigits++;
            }
            num /= 10;
        }
        return evenDigits;
    }
    public static int exercise1B(int[] numArr)
    {
        int mostEvenDigitsNumIdx = 0;
        int mostEvenDigitsCount = 0;
        for(int i = 0; i < numArr.length; i++)
        {
            int currCount = exercise1A(numArr[i]);
            if( currCount > mostEvenDigitsCount)
            {
                mostEvenDigitsNumIdx = i;
                mostEvenDigitsCount = currCount;
            }
        }

        return numArr[mostEvenDigitsNumIdx];
    }
    
    public static int exercise2(int num1, int num2)
    {
        int smallestCommonDivisor = 0;
        // euclidean algortithem
        int GreatestCommonDivisor = 0;
        int reminder = -1;
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        while( reminder != 0)
        {
            GreatestCommonDivisor = min;
            reminder = max % min;
            max = min;
            min = reminder;
        }

        if(GreatestCommonDivisor == 1)
        {
            return -1;
        }

        int GDCsqrt = (int)Math.sqrt(GreatestCommonDivisor);
        smallestCommonDivisor = GreatestCommonDivisor;
        for(int i = 2; i <= GDCsqrt; i++)
        {
            if(GreatestCommonDivisor % i == 0)
            {
                smallestCommonDivisor = i;
                break;
            }
        }

        return smallestCommonDivisor;
    }
    

    public static void main(String[] args)
    {

    }
}
