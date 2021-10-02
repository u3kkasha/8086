//بِسْمِ اللَّهِ الرَّحْمٰنِ الرَّحِيْمِ

package com.salikoon.emulator8086.ui_helper;

import com.salikoon.emulator8086.execution.ExecutionHandler;
import com.salikoon.emulator8086.user_code.CodeHandler;
import com.salikoon.emulator8086.syntax_check.ValidationHandler;
public interface UIHandler
{

    static void setCode(String[] code)
    {
        CodeHandler.setCode(code);
        ValidationHandler.checkCode();
    }

    static UIPacket execute()
    {
        return ExecutionHandler.execute();
    }

}//end of file