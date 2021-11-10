package.com.vogella.junit5;
import static

org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.util.Scanner;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static.org.junit.Assert.assertEquals;

class Dec2Hex
{

    public static int Arg1 = 0;

    public static void main(String args[])
    {
//task 5, check for no input

if(args.length ==0) {

System.out.println("nothing was input, try again with an input");

return;

//this will return the above message, to the user

}

//task 5 part two, check for integer

try
{
        Arg1 = Integer.parseInt(args[0]);
}

catch(NumberFormatException ex)

{System.out.println("This is not a valid input. Enter an Integer");
//this will return the above message to the user
return;
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

        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }
}

