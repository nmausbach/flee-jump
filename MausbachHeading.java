/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mausbachfinal;

/**
 *
 * @author njmau
 */
import java.text.*;
import java.util.*;

/**
 *
 * @author njmau
 */

public class MausbachHeading {

	public MausbachHeading()	{}

	public static void main(String [] args)	{
		getHeader("\t    Testing 123");
	}	// end main

	public static void getHeader(String x)	{
		String date;
		String assignNumber = x;
		String name = "Nathan Mausbach";
		Date now = new Date();
		DateFormat longDate = DateFormat.getDateInstance(DateFormat.LONG);
		date = longDate.format(now);
		System.out.println("\n\n" + name);
		System.out.println(assignNumber);
		System.out.println(date);
		System.out.println();
	}	// end getHeader()

}	// end
