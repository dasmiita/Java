import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ToDoListApp {
    private DefaultListModel<String> listModel; // Stores tasks
    private JList<String> taskList; // UI component to display tasks
    private JTextField taskInput; // Input field

    public ToDoListApp() {
        // Create the main frame (window)
        JFrame frame = new JFrame("To-Do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Create panel to hold input field and button
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Input field for adding tasks
        taskInput = new JTextField(20);
        panel.add(taskInput);

        // Button to add task
        JButton addButton = new JButton("Add Task");
        panel.add(addButton);

        // Task List (JList)
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList); // Scroll support

        // Add components to frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Button Click Event - Adds Task
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskInput.getText().trim();
                if (!task.isEmpty()) {
                    listModel.addElement(task); // Add to list
                    taskInput.setText(""); // Clear input field
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ToDoListApp(); // Run the app
    }
}
