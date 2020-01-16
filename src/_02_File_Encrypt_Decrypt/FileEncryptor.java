package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a message");
		String newS = "";
		String newerS ="";
		String ncrpt ="";
		String ncrptn="";
		String ncrptd="";
		String last ="";
		String laster="";
		if(input.contains("e")) {
			newS = input.replace('e', '_');
		}
		if(newS.contains("t")) {
			newerS =newS.replace('t', '^');
		}
		if(newerS.contains("s")) {
			ncrpt = newerS.replace('s', '@');
		}
		if(ncrpt.contains("a")) {
			ncrptn = ncrpt.replace('a', '*');
		}
		if(ncrptn.contains("o")) {
			ncrptd = ncrptn.replace('o', '%');
		}
		if(ncrptd.contains("i")) {
			last =ncrptd.replace('i', '#');
		}
		if(last.contains("n")) {
			laster =last.replace('n', '$');
		}
			
		
		try {
			FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/SuperSecretInfo.txt");
			fw.write(laster);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


