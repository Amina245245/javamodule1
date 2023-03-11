package Ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileToConsole {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D:\\ustcore\\Ioserialization\\src\\Ioserialization\\KeyboardToFile.java");
	BufferedReader buffer = new BufferedReader(reader);
	String data = buffer.readLine();
	while(data!=null)
	{
		System.out.print(data);
		data=buffer.readLine();
	}
buffer.close();
reader.close();
	}

}
