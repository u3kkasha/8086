import static java.lang.System.out;
import static com.salikoon.emulator8086.hardware.StringParameter.*;


import java.util.stream.*;
import java.util.Arrays;
import com.salikoon.emulator8086.user_code.*;
import com.salikoon.emulator8086.execution.*;
import com.salikoon.emulator8086.hardware.*;
import com.salikoon.emulator8086.ui_helper.*;
import com.salikoon.emulator8086.parser.*;
import com.salikoon.emulator8086.syntax_check.*;

public class Main {
		 static String code2[]=
		{
			".org 100h",
			".stack 100h",
			".compact",
			"; program to add two numbers from user input and then show",
			"mov ah,1d; code for input bios",
			"int 21h; call interrupt routine",
			"mov cl,al; store first input in cl as ascii character",
			"int 21h; take input the second number",
			"mov al,ch; store the second input into ch as ascii character",
			"mov bl,'0'; move the ascii value of zero inside bl",
			"sub cl,bl; convert first input ascii to number",
			"sub ch,bl; convert second input from ascii to number",
			"add cl,ch; add the two numbers",
			"mov dh,cl; place in dh for output",
			"mov ah,2; 2 is code for output bios",
			"int 21h; call interrupt",
			"hlt; end of program"
		};
		public static String[] code1=
		{
		    "Empty",
		    "ADD AX,0",
		    "XOR AX,100B",
		    "NEG AL",
		    "INC AL",
		    "DEC AL",
		    "AND AX,BX"
		};
		public static String code3=
		"""
		Empty
 not ax
 label1:mov dx,6
 cmp 5,3
 jcxz labelk
 ja label2
 mov al,[0100H] ; length of rectangle
 labelk:mov ax,5 ; width of rectangle
 mul [0100H]; calculate area=ax*bx
 label2:mov cx,6; now we will calculate the perimeter
 mov cx,5; 
 G:add dx,dx; dx=dx+dx
 add bx,cx; cx=cx+cx
 add ax,dx; perimeter=cx+dx
 loopz G
 STC""";
		
			public static void main(String[] args) {
	    
	    var testCode = new CodeSample(code3);
	       testCode.run();
	   
	}//end of main
	
}//end of class


class CodeSample
{
    public String[] code;
    
    public CodeSample(String code)
    {
        this.code=code.split("\n");
    }
    
    public void run()
    {
           IntStream.range(1,code.length-1)           
           .forEach((index)->System.out.println("Line: "+index+" "+code[index]));
           ;
        System.out.println(UIHandler.setCode(code));
        while(UIHandler.executionIncomplete())
       {
           System.out.println(UIHandler.execute());
       }
   
    }
}


