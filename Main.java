package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(tc1CheckSingleChar());
        System.out.println(tc2checkNullString());
        System.out.println(tc3checkEmptyString());
        System.out.println(tc4checkAlphaNumericAndSymbolsConversion());
        System.out.println(tc5checkAllLowerCase());
        System.out.println(tc6checkAllUpperCase());
        System.out.println(tc7checkAllNumbers());
        System.out.println(tc8checkSpecialChars());
        System.out.println(tc9checkSpaces());
    }
    public static String convertToUpperCase(String str){
        if(str==null){
            return "null";
        }
        else{
            String res="";
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch>=97&&ch<=122) {
                    ch -= 32;
                }
                res+=ch;
            }
            return res;
        }
    }

    //checking for single character conversion
    public static boolean tc1CheckSingleChar(){
        String expected="A";
        String input="a";
        String result=convertToUpperCase(input);
        return expected.equals(result);
    }

    //checking for null string conversion
    public static boolean tc2checkNullString(){
        String expected="null";
        String input=null;
        String result=convertToUpperCase(input);
        return expected.equals(result);
    }

    //checking for empty string
    public static boolean tc3checkEmptyString(){
        String expected="";
        String input="";
        String result=convertToUpperCase(input);
        return expected.equals(result);
    }

    //checking for combination of alphanumeric and symbols
    public static boolean tc4checkAlphaNumericAndSymbolsConversion(){
        String expected="ABC@123";
        String input="abC@123";
        String result=convertToUpperCase(input);
        return expected.equals(result);
    }

    //checking all lowercase letters
    public static boolean tc5checkAllLowerCase(){
        String expected="ABCDE";
        String input="abcde";
        String result=convertToUpperCase(input);
        return expected.equals(result);
    }

    //checking all uppercase letters
    public static boolean tc6checkAllUpperCase(){
        String expected="ABCDE";
        String input="ABCDE";
        String result=convertToUpperCase(input);
        return expected.equals(result);
    }

    //checking all numbers
    public static boolean tc7checkAllNumbers(){
        String expected="12345";
        String input="12345";
        String result=convertToUpperCase(input);
        return expected.equals(result);
    }

    //checking all special characters
    public static boolean tc8checkSpecialChars(){
        String expected="@#$";
        String input="@#$";
        String result=convertToUpperCase(input);
        return expected.equals(result);
    }

    //checking all spaces
    public static boolean tc9checkSpaces(){
        String expected="   ";
        String input="   ";
        String result=convertToUpperCase(input);
        return expected.equals(result);
    }

}
