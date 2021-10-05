//بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيْمِ
package com.salikoon.emulator8086.syntax_check;
import java.util.Optional;
import com.salikoon.emulator8086.parser.Parser;
public class Validator
{
    public enum OperandEnums{SegmentRegister,NonSegmentRegister,MemoryAddress,ImmediateValue}
    
    public static Optional<String> findMistakeInTokens(String [] tokens)
    {
       var opcode=tokens[0];
       try{
           var expectedNumberOfTokens=1+ValidationLibrary.getNumberOfOperands(opcode);
        
       if(tokens.length!=expectedNumberOfTokens)
            return Optional.of(String.format("%s requires exactly %d operands", opcode, expectedNumberOfTokens-1));
        /* if expectedNumberOfTokens=1,
         then this loop will not be executed,
           if expectedNumberOfTokens=2, 
         then it will be executed only upon token[1]
           if expectedNumberOfTokens=3
         then this loop will be executed upon token[1] and turn[2]
        */
        for(int index=1;index<expectedNumberOfTokens;index++) 
            if(! Parser.Analyser.isValidOperand(tokens[index]) )
                return Optional.of(tokens[index]+" is an unrecognised operand");
       
        else return Optional.empty();
        }
        
        catch(IllegalArgumentException exception)
        {

        }
      return Optional.of(opcode+" is either invalid or not yet implemented");
    }//end of function
    
    
}//end of class