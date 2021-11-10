/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Dec2HexTest2;

 import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {
        String fin = hexi(args);
        System.out.println("Hexidecimal representation of entered character is:" + fin);
//task 5, check for no input
    }
    
    public static String hexi(String args[]){
if(args.length ==0) {
String empty = "nothing was input, try again with an input";
return empty;



//this will return the above message, to the user

}

//task 5 part two, check for integer

try
{
        Arg1 = Integer.parseInt(args[0]);
}

catch(NumberFormatException ex)

{
String exception ="This is not a valid input. Enter an Integer";
return exception;
//this will return the above message to the user

}

        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + "to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        String converted = ("Hexadecimal representation is: " + hexadecimal);
	return converted;
    }
}
