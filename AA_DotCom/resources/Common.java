package resources;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class Common {
	
	public static String generateString() {
		Random rng = new Random();
		char[] text = new char[2];
		String characters = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < 2; i++) {
			text[i] = characters.charAt(rng.nextInt(characters.length()));
		}
		return new String(text);
	}
	
	public static class DateUtil
	{
	    public static Date addDays(Date dateString, int days)
	    {
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(dateString);
	        cal.add(Calendar.DATE, days); //minus number would decrement the days
	        return cal.getTime();
	    }
	}
	
	public static String startRow(int endRow) {

		String startRow = JOptionPane.showInputDialog(null,
				"Enter datapool row you wish to start test from \n"
						+ "Number must be equal to or less than " + endRow,
						"Enter datapool start row",
				JOptionPane.QUESTION_MESSAGE);
				Common_Variables.startRow = Integer.parseInt(startRow);    // Dave
		return new String(startRow);

	}

	public static String selectedUAT() {

		String selectedUAT = JOptionPane.showInputDialog(null,
				"Enter chosen Test Environment \n"
						+ "Format must be live or i.e. prelive1",
						"Enter chosen Environment",
				JOptionPane.QUESTION_MESSAGE);

		return new String(selectedUAT);

	}

}
