//بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيْمِ
package com.salikoon.emulator8086.syntax_check;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Optional;
import com.salikoon.emulator8086.parser.Tokeniser;

    /** This class is the facade for the Validation Module
    @author Watheeq
    */
    

public class ValidationHandler
{
    /** This function checks the ASL-8086 code for syntax errors.
        @author Watheeq
        @param code A single user written ASL-8086 line of code
        @return a List of SyntaxSlip records

        */
       
    public static List<SyntaxSlip> checkCode()
    {
        
        return 
        IntStream.range(1,CodeHandler.getLastLineNumberOfCode())
        .maptoObj(ValidationHandler::checkLine)
        .flatMap(Optional::stream) //remove empty Optionals
        .collect(Collectors.toList());
              
    }
        
        /** This function checks a single line of ASL-8086 code for syntax errors
        @author Watheeq
        @param code The user written ASL-8086 code
        @return an Optional SyntaxSlip record, only a single SyntaxSlip is reported even though there might be multiple mistakes in a single line.
        */
    
        public static Optional<SyntaxSlip> checkLine(int lineNumber)
    {
        String[] tokens=Tokeniser.tokeniseCode(lineOfCode);
        var opcode=token[0];
        var mistake=ValidationLibrary.class.getMethod(opcode).invoke(null,tokens);
        
    }
    
}// end of class