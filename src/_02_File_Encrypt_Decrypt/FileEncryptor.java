package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a message");
		for (int i = 0; i > input.length(); i++) {
			
		}
		try {
			FileWriter fw = new FileWriter("src/_01_File_Recorder/InputText.txt");
			fw.write(input);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}