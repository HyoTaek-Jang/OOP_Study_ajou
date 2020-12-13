package ╟╢га╫г╫ю15аж;

import java.io.*;

public class DataIO {
	public static String readFixedString(int size, DataInput in) throws IOException {
		StringBuilder b = new StringBuilder(size);
		int i = 0;
		boolean more = true;
		while (more && i < size) {
			char ch = in.readChar();
			i++;
			if (ch == 0)
				more = false;
			else
				b.append(ch);
		}
		in.skipBytes(2 * (size - i)); // skip the remaining bytes for the name field
		return b.toString();
	} // end of readFixedString ()

	public static void writeFixedString(String s, int size, DataOutput out) throws IOException {
		char ch;
		for (int i = 0; i < size; i++) {
			ch = 0; // fill the area that exceeds the lenghth of the string with zero
			if (i < s.length())
				ch = s.charAt(i);
			out.writeChar(ch);
		}
	}
} // end of DataIO class