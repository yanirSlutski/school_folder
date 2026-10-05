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
    
    public static boolean isLetter(char c)
    {
        return (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'));
    }

    public static boolean serialArr(int[] arr)
    {
        int seriesLen = 0;
        boolean finsihed = false;
        for(int i = 0; i<arr.length && !finsihed; i++)
        {
            for(int j = 0; j<i && !finsihed; i++)
            {
                if(arr[i] == arr[j])
                {
                    seriesLen = i;
                    finsihed = true;
                }
            }
        }

        int[] series = new int[seriesLen];
        for(int i = 0; i<seriesLen; i++)
        {
            System.out.println(arr[i]);
            series[i] = arr[i];
        }

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] != series[i%seriesLen])
            {
                return false;
            }
        }
        return true;
    }
   
    public static boolean isFromABC(char c)
    {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }
    public static int shortestABCseries(char[][] arr)
    {
        int shortestSeries = 0;
        for(int i = 0; i<arr.length; i++)
        {
            int seriesLength = 0;
            for(int j = 0; i<arr[i].length && isFromABC(arr[i][j]); i++)
            {
                seriesLength++;

            }
            System.out.println(seriesLength);
            if( seriesLength < shortestSeries)
            {
                shortestSeries = seriesLength;
            }

        }

        return shortestSeries;
    }

    public static int amount(Committee[] arr, Member m)
    {
        int acceptableCommitteesAmount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            boolean isCoalGrater = false;
            boolean isCountEnough = false;
            if(arr[i].getCount()<16)
            {
                isCountEnough = true;
            }
            else
            {
                continue;
            }
            
            int coalMembers = arr[i].total(true);
            int oppMembers = arr[i].total(false);
            if(m.isCoal())
            {
                coalMembers++;
            }
            else
            {
                oppMembers++;
            }
            if(coalMembers > oppMembers)
            {
                isCoalGrater = true;
            }
            if(isCoalGrater && isCountEnough)
            {
                acceptableCommitteesAmount++;
            }
        }
        return acceptableCommitteesAmount;
    }
   
    public static void main(String[] args)
    {

    }
}
