//بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيم
package com.salikoon.emulator8086.instructions;
public class InstructionLibrary implements DataTransferInstructions, ArithmeticAndBitManipulationInstructions, FlagInstructions , ControlTransferInstructions
{    
    public void HLT()
    {
       com.salikoon.emulator8086.ui_helper.UIHandler.finishedExecution=true;
    }
    
    public void NOP()
    {
        // do nothing
    }
}//end of class