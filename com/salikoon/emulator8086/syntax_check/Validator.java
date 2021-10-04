//بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيْمِ
package com.salikoon.emulator8086.syntax_check;

public class Validator
{
    public enum OperandEnums{SegmentRegister,NonSegmentRegister,Memory,ImmediateValue}
    
    public static Optional<String> findMistakeInTokens(int expectedNumberOfTokens, String [] tokens)
    {
       var opcode=token[0];
        if(tokens.length!=expectedNumberOfTokens) 
            return Optional.of(String.format("%s requires exactly %d operands", opcode, expectedNumberOfTokens);
        /* if expectedNumberOfTokens=1,
         then this loop will not be executed,
           if expectedNumberOfTokens=2, 
         then it will be executed only upon token[1]
           if expectedNumberOfTokens=3
         then this loop will be executed upon token[1] and turn[2]
        */
        for(int index=1;index<expectedNumberOfTokens;index++) 
            if(! Parser.Analyser.isValidOperand(token[index]) 
                return Optional.of(token[index]+" is an unrecognised operand");
       
        else return Optional.empty();
    }
    
}//end of class