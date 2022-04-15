//بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيْمِ

package com.salikoon.emulator8086.ui_helper;

import com.salikoon.emulator8086.execution.ExecutionHandler;
import com.salikoon.emulator8086.user_code.CodeHandler;
import com.salikoon.emulator8086.syntax_check.ValidationHandler;
import java.util.List;
import com.salikoon.emulator8086.syntax_check.SyntaxSlip;

public class UIHandler
{
    public static boolean finishedExecution=false;
    
    public static List<SyntaxSlip> setCode(String[] code)
    {
        CodeHandler.setCode(code);     
        return ValidationHandler.checkCode();
    }

    public static UIPacket execute()
    {
        return ExecutionHandler.execute();
    }

    public static boolean executionIncomplete()
    {
        return !finishedExecution;
    }
}//end of file