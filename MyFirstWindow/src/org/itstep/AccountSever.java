package org.itstep;

import java.io.FileWriter;
import java.io.IOException;




public class AccountSever {
	private static final String  FILE_PATH  = "F:\\test2\\accountList.csv";
	public static void writeTextToFile(String text, String toPath) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(FILE_PATH, true);
			writer.write(text);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
