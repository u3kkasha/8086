//بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيْمِ
package com.salikoon.emulator8086.syntax_check;
import com.salikoon.emulator8086.parser.Parser;
import java.util.Optional;

    /**This class stores syntax validation/checking information for various opcodes
    @author Watheeq
    */

public class ValidationLibrary
{
    public static int getNumberOfOperands(String opcode)
    {
        return switch(opcode)
        {
            case "MOV",
            "ADD","SUB",
            "AND","OR","XOR","TEST"      -> 2;
            case "INC","DEC","NEG","NOT","MUL","DIV"-> 1;
            default -> throw new IllegalArgumentException("Opcode is unknown");
        };
    }
    
    
    
}//end of class