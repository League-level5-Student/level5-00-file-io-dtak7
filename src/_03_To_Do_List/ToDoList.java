package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		addT.setText("add task");
		viewT.setText("view task");
		removeT.setText("remove task");
		saveL.setText("save list");
		loadL.setText("load list");
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
		if(buttonPressed.getText().equals("add task")) {
			task =JOptionPane.showInputDialog("Enter in a task"); 
			toDoList.add(task);
		}
		if(buttonPressed.getText().equals("view task")) {
			System.out.println(toDoList);
		}
		if(buttonPressed.getText().equals("remove task")) {
			String remove= JOptionPane.showInputDialog("Which task would you like to remove");
			for(int i =0;i<toDoList.size();i++) {
				if(toDoList.get(i).contains(remove)) {
					toDoList.remove(i);
				}
			}
		}
		
	}
}
