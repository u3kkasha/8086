// بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيْمِ

package com.salikoon.emulator8086.user_code;
import java.util.ArrayList;

public class AssemblyCode 
{
    private static ArrayList<String> userCode;
    
    public static void setCode(String[] input)
    {
         userCode=
         java.util.Arrays.
          stream(input).parallel()
          .map(String::strip)
          .map(String::toUpperCase)
          .collect
          (java.util.stream.Collectors
          .toCollection(ArrayList::new)
          );
    }
    public static String getCode(int lineNumber)
    {
        return userCode.get(lineNumber);
    }
    
    
} //end of class

