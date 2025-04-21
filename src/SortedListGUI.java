package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SortedListGUI extends JFrame {
    private SortedList sortedList;
    private JTextField addTextField;
    private JButton addButton;
    private JTextField searchTextField;
    private JButton searchButton;
    private JTextArea displayTextArea;
    private JScrollPane scrollPane;

    public SortedListGUI() {
        this.sortedList = new SortedList();
        setTitle("Sorted List");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input panel
        JPanel inputPanel = new JPanel(new FlowLayout());
        addTextField = new JTextField(15);
        addButton = new JButton("Add");
        inputPanel.add(new JLabel("Add String:"));
        inputPanel.add(addTextField);
        inputPanel.add(addButton);
        add(inputPanel, BorderLayout.NORTH);

        // Search panel
        JPanel searchPanel = new JPanel(new FlowLayout());
        searchTextField = new JTextField(15);
        searchButton = new JButton("Search");
        searchPanel.add(new JLabel("Search String:"));
        searchPanel.add(searchTextField);
        searchPanel.add(searchButton);
        add(searchPanel, BorderLayout.CENTER);

        // Display area
        displayTextArea = new JTextArea(10, 30);
        scrollPane = new JScrollPane(displayTextArea);
        displayTextArea.setEditable(false);
        add(scrollPane, BorderLayout.SOUTH);

        // Add button action listener
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textToAdd = addTextField.getText().trim();
                if (!textToAdd.isEmpty()) {
                    sortedList.add(textToAdd);
                    displayList();
                    addTextField.setText("");
                }
            }
        });

        // Search button action listener
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textToSearch = searchTextField.getText().trim();
                if (!textToSearch.isEmpty()) {
                    String result = sortedList.search(textToSearch);
                    displayTextArea.append("Search for '" + textToSearch + "': " + result + "\n");
                    searchTextField.setText("");
                }
            }
        });

        setVisible(true);
    }

    private void displayList() {
        displayTextArea.setText("Current Sorted List:\n");
        ArrayList<String> currentList = sortedList.getList();
        for (String element : currentList) {
            displayTextArea.append("- " + element + "\n");
        }
        displayTextArea.append("--------------------\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SortedListGUI();
            }
        });
    }
}
