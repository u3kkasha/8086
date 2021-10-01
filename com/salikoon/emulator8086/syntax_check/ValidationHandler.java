//بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيْمِ
package com.salikoon.emulator8086.syntax_check;

public class ValidationHandler
{
    /** This class is the facade for the Validation Module
    @author Watheeq
    */
    
    public static List<SyntaxSlip> checkCode(String[] code)
    {
        /** This function checks the ASL-8086 code for syntax errors
        @author Watheeq
        @param code The user written ASL-8086 code
        @return a List of SyntaxSlip records
        */
       return java.util.Arrays
        .stream(code)
        .map(ValidationHandler::checkLine)
        .flatMap(Optional::stream) //remove empty Optionals
        .collect(Collectors.toList());
              
    }
    
    
    
    
}// end of class