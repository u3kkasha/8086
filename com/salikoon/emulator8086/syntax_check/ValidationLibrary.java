//بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيْمِ
package com.salikoon.emulator8086.syntax_check;
import com.salikoon.emulator8086.parser.Parser;
import java.util.Optional;

public class ValidationLibrary
{
    
    public static Optional<String> MOV(String[] tokens)
    {
        var tokenMistake=Validator.findMistakeInTokens(3,tokens);
        if (tokenMistake.isPresent()) return tokenMistake;
        
        switch(
    }
    
    
    
}//end of class