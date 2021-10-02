//بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيْمِ
package com.salikoon.emulator8086.syntax_check;

    /**
    This is a record class to hold the line number and the syntax mistake which was detected therein
    @author Watheeq
    */
public record SyntaxSlip(int lineNumber, String mistake)
{
    
    public SyntaxSlip{
    if(lineNumber<=0) throw new IllegalArgumentException("lineNumber has a value="+lineNumber+"which is not accepted as line number has to be a non-zero positive number");
    if(mistake.isBlank()) throw new IllegalArgumentException("A blank String is not accepted, please write something to identify the mistake");
    }

}
