/*
Author: Brandae Grein
Date: 2/25/2019

Purpose of class:

This is a class made for a number convertor project. Every single one of the methods below
is meant to convert decimal values, color values, hex values, binary value, octal values,
back and forth. These methods are called by the GUI of the application, named "NumberConvertorApp"

 */
package cs351_assignment1;


public class NumberConverter {
    
    /*
    *
    *
    *
    *
    First up are all of the Decimal to other conversions. 
    *
    *
    *
    *
    */
    
    //This method converts from decimal to binary
    public static String decimalToBinary(String decimalText){
        int decimalValue = 0; // this will store the decimal number from the decimal text value
        if(!"".equals(decimalText) && decimalText != null){//so long as the decimal text not empty
            decimalValue = Integer.parseInt(decimalText);//it will parse the string into an int
        }
        
        String binaryValue="";//initializes the binary value as a null string
        //This while loop will run so long as decimal value isn't 0
        while(decimalValue!=0){
            int remainder = decimalValue%2;//will take the modulous value and store it temporarily
            binaryValue = remainder+binaryValue;//adds the remainder onto the front of the string
            decimalValue = decimalValue/2;//divides the decimal value by two for the next iteration
        }
        boolean correctLength = false;
        //this loop will add 0s to the front of the string until the binary value has the
        //a length size of 8, or a multiple of 8
        while(!correctLength){
            if(binaryValue.length()%8 == 0){
                correctLength = true;
            }
            else{
                binaryValue = "0"+binaryValue;
            }
        }
        return binaryValue;
    }
    
    //This method converts decimal values into hex
    public static String decimalToHex(String decimalText){
        int decimalValue = 0;//initates a decimal value int to later store the text
        if(!"".equals(decimalText) && decimalText != null){
            decimalValue = Integer.parseInt(decimalText);//so long as the text is not null, it will convert the value into an in
        }
        String hex = Integer.toHexString(decimalValue);//converts to a hex string
        hex = hex.toUpperCase();//puts hex string to uppercase
        return hex;
    }
    
    //This converts the values from decimal to octal. It functions exactly the same
    //as the method for hex values
    public static String decimalToOctal(String decimalText){
        int decimalValue = 0;
        if(!"".equals(decimalText) && decimalText != null){
            decimalValue = Integer.parseInt(decimalText);
        }
        String octal = Integer.toOctalString(decimalValue);
        return octal;
    }
    //This converts all the decimal values to ascii values
    public static String decimalToASCII(String decimalText){
        int decimalValue = 0;
        if(!"".equals(decimalText) && decimalText != null){
            decimalValue = Integer.parseInt(decimalText);//parses the string
            int length = 4;//initiates the length as 4
            StringBuilder builder = new StringBuilder(length);//makes a new string builder of length 4
            for (int i = length - 1; i >= 0; i--) {
                builder.append((char) ((decimalValue >> (8 * i)) & 0xFF));//adds each char value, and converts it using bit conversion
            }
            //Builds the string builder into a string
            String myStr = builder.toString();
            //returns the string builder
            return builder.toString();
        }
        //if the value was null, returns a null string
        String str = "";
        return str;
    }
    
    //The following method are for binary to decimal. 
    
    public static String binaryToDecimal(String binaryText){
        int decimalValue = 0; 
        //converts a binary value to decimal
        if(!"".equals(binaryText) && binaryText != null){
            //decimalValue = Integer.parseInt(binaryText, 2);
            for(int i = 1; i<=binaryText.length(); i++){//so long as the string still has length
                if(binaryText.charAt(binaryText.length()-i)=='1'){//if the value is a one at that spot in the stirng
                    decimalValue+=Math.pow(2, i-1);//will multiply it by a power of 2, and add that to the decimal 
                }
        }
        }
        return Integer.toString(decimalValue);
    
    }
    
   
    
    //This will convert from octal to decmail values
    public static String octalToDecimal(String octalText){
        int octalValue = 0;
        //checks to see if the passed string was empty
        if(!"".equals(octalText)&&octalText != null){
            octalValue = Integer.parseInt(octalText, 8);//converts to an octal value in int
        }
        int decimalNumber = 0, i = 0;
        //converts from octal to decimal
        while(octalValue != 0){//so long as the octal value is not 0
            decimalNumber += (octalValue%10)*Math.pow(8, i);//it will take each value of octal, and multiply it by 8 to the power of i
            ++i;//increases value of i
            octalValue/=10;//divides octal value
        }
        //converts the integer value to a string
        String decimalValue = Integer.toString(decimalNumber);
        return decimalValue;//returns string value
    }
    
    //converts hex to a decimal value
    public static String hexToDecimal(String hexText){
        int decimalValue = Integer.parseInt(hexText, 16);//converts from a hex value to a decimal value
        String decimalText = Integer.toString(decimalValue);//decimal value to string
        return decimalText;
    }
    
    //converts from ascii values to decimal 
    public static String ASCIIToDecimal(String asciiText){
        int asciiValue = 0, decimalInt = 0;//initiates int values
        String decimalValue = "";
        if(!"".equals(asciiText) && asciiText != null){//so long as the passed value is not null
            for(int i = 0; i < asciiText.length(); i++){//for the length of the passed string
                asciiValue = (int) asciiText.charAt(i);//casts the ascii char to an int
                decimalInt += asciiValue*Math.pow(2, 8*(asciiText.length()-i-1));//takes the int, multiples it by the right power values and adds to the 
                //decimal int
            }
        
        }
        //converts the decimal int to a decimal string
        decimalValue = Integer.toString(decimalInt);
        //returns string
        return decimalValue;
    }
    
}
