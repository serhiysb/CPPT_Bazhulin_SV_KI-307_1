/****************************************************************************
* Copyright (c) 2013-2023 Lviv Polytechnic National University. All Rights Reserved.
*
* This program and the accompanying materials are made available under the terms
* of the Academic Free License v. 3.0 which accompanies this distribution, and is
* available at https://opensource.org/license/afl-3-0-php/
*
* SPDX-License-Identifier: AFL-3.0
****************************************************************************/
package KI307.Bazhulin.Lab6;
import java.util.*;
import java.io.*;

/**
 * Class Main are testing a class MyList
 * @author Bazhulin Serhiy KI-307
 * @version 1.0
 * @since version 1.0
 */
public class MainBazhulin {
	public static void main(String[] args) throws IOException
	{
		MyList<String> list = new MyList();
		list.add("abc");
		list.add("qwert");
		list.add("a");
		list.add("edv");
		list.add("edv");
		list.display();
//		System.out.println(list.findMin());
		System.out.println(list.findElementsWith3Length());
//		list.remove("qwert");
//		list.display();
	}
}
