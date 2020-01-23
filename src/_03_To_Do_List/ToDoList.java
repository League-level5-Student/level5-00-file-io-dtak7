package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
	
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	 JButton addT = new JButton();
	 JButton viewT = new JButton();
	 JButton removeT= new JButton();
	 JButton saveL = new JButton();
	 JButton loadL = new JButton();
	 public static void main(String[] args) {
		 ToDoList tdl = new ToDoList();
		tdl.frameSetUp();
	}
	 
	 void frameSetUp () {
		frame.add(panel);
		panel.add(loadL);
		panel.add(saveL);
		panel.add(removeT);
		panel.add(viewT);
		panel.add(addT);
		frame.setVisible(true);
		frame.setSize(600,100);
		frame.setTitle("ToDoList");
		addT.setText("Add Task");
		removeT.setText("Remove Task");
		saveL.setText("Save List");
		viewT.setText("View Task");
		loadL.setText("Load List");
		loadL.addActionListener(this);
		saveL.addActionListener(this);
		removeT.addActionListener(this);
		viewT.addActionListener(this);
		addT.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		ArrayList<String> toDoList=new ArrayList<String>();
		String task;
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed.getText().equals("Add Task")) {
			task =JOptionPane.showInputDialog("Enter in a task"); 
			toDoList.add(task);
		}
		if(buttonPressed.getText().equals("View Task")) {
			System.out.println(toDoList);
		}
		if(buttonPressed.getText().equals("Remove Task")) {
			String remove= JOptionPane.showInputDialog("Which task would you like to remove");
			for(int i =0;i<toDoList.size();i++) {
				if(toDoList.get(i).equals(remove)) {
					toDoList.remove(i);
				}
			}
		}
		if(buttonPressed.getText().equals("Save List")) {
			System.out.println("saving");
			
			try {
				FileWriter fw = new FileWriter("src/_03_To_Do_List/List.txt");
				for(int i =0;i<toDoList.size();i++) {
				fw.write(toDoList.get(i));
				}
				fw.close(); 
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			}
			if(buttonPressed.getText().equals("Load List")) {
				try {
					BufferedReader br = new BufferedReader(new FileReader("src/_03_To_Do_List/List.txt"));
					
					String line = br.readLine();
					while(line != null){
						JOptionPane.showMessageDialog(null, line);
						line = br.readLine();
					}
					br.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		
	}

