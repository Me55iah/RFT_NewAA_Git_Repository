package Utilities;

import java.io.Console;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import resources.Common_Variables;
import resources.Utilities.TokeniserHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author horned
 */
public class Tokeniser extends TokeniserHelper
{
	/**
	 * Script Name   : <b>Tokeniser</b>
	 * Generated     : <b>16 Feb 2015 13:24:27</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/02/16
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{

		// Reference From Data Pool (column) For Each Insurance Element
		// 1)  Payment
		// Extra Cover
		// a) Legal Assistance
		// b) Personal Accident Cover
		// c) Courtesy Car Upgrade
		// d) Claim Back Policy Excess
		
		// LEGAL ASSISTANT
		if (Common_Variables.upgrades_MLA == true){
			
		}
		
		// PERSONAL ACCIDENT COVER
		if (Common_Variables.upgrades_MAP == true){
			
		}		
		
		// COURTESY CAR UPGRADE
		if (Common_Variables.upgrades_HireCar == true){
			
		}
		
		// EXCESS RECLAIM
		if (Common_Variables.upgrades_MOXIN == true){
			
		}

		
		int i = 0;
		String rhSummary = "Insurance Policy £36.33 Excess £4.32 Protection Plus £2.21 Care Hire £7.77";
        // String phrase = "the music made   it   hard      to        concentrate";
        String delims = "[^.0-9]+";
        String[] tokens = rhSummary.split(delims);
        
        double dIP = 0; double dEx = 0; double dPP = 0; double dCH = 0; double dTotal = 0;
        String sIP = "";String sEx = "";String sPP = "";String sCH = "";    
        
        String sDUMMY = ""; @SuppressWarnings("unused")
		double dDUMMY = 0;
        
        for (i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]+" Count = "+i);
        	//sIP = (tokens[i]);	sIP.trim(); dIP = Double.parseDouble(sIP);
        	//dTotal = dTotal+dIP;

	        try{
		       sIP = (tokens[1]);	sIP.trim(); dIP = Double.parseDouble(sIP);
		       sEx = (tokens[2]);	sEx.trim(); dEx = Double.parseDouble(sEx);	        
		       sPP = (tokens[3]);	sPP.trim(); dPP = Double.parseDouble(sPP);	        
		       sCH = (tokens[4]);	sCH.trim(); dCH = Double.parseDouble(sCH);	  	
		       sDUMMY = (tokens[5]);	sDUMMY.trim(); dDUMMY = Double.parseDouble(sDUMMY);	  	
	        }
	         catch (ArrayIndexOutOfBoundsException e){
	        	System.out.println("Intentional Break");
	    	{
	        
	    } 
	    dTotal = dCH+dPP+dEx+dIP;
            
//      System.out.println("Total = "+(dCH+dPP+dEx+dIP));
          
        dTotal = Math.round(dTotal*100)/100.00;
          
        System.out.println("Total = "+(dTotal));

    	}
		
	}
}

