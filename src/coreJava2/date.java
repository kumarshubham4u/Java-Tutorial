package coreJava2;

import java.text.SimpleDateFormat;
import java.util.*;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println("Current date is : " + d);

		SimpleDateFormat s1 = new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat s2 = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		System.out.println(s1.format(d));
		System.out.println(s2.format(d));

	}

}
