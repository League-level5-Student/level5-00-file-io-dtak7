package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/SuperSecretInfo.txt"));

			String line = br.readLine();
			String newS = br.readLine();
			String newerS =br.readLine();
			String ncrpt =br.readLine();
			String ncrptn=br.readLine();
			String ncrptd=br.readLine();
			String last =br.readLine();
			String laster =br.readLine();
				if(line.contains("_")) {
					newS = line.replace('_', 'e');
				}
				if(newS.contains("^")) {
					newerS =newS.replace('^', 't');
				}
				if(newerS.contains("@")) {
					ncrpt = newerS.replace('@', 's');
				}
				if(ncrpt.contains("*")) {
					ncrptn = ncrpt.replace('*', 'a');
				}
				if(ncrptn.contains("%")) {
					ncrptd =ncrptn.replace('%', 'o');
				}
				if(ncrptd.contains("#")) {
					last = ncrptd.replace('#', 'i');
				}
				if(last.contains("$")) {
					laster =last.replace('$', 'n');
				}
			
			while (laster != null) {
				JOptionPane.showMessageDialog(null, laster);
				laster = br.readLine();
			}

			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}