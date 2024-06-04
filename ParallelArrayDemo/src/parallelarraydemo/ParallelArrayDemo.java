
package parallelarraydemo;


import javax.swing.JOptionPane;

public class ParallelArrayDemo {
    public static void main(String[] args) {
        // Initialize the arrays
        String[] names = {"Denzyl", "Cathy", "EB", "Yusra"};
        int[] ages = {35, 50, 34, 25};

        // Main loop to keep the program running
        while (true) {
            // Show options to the user( Menu)
            String[] options = {"Search Age by Name", "Delete a Record", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            // Perform action based on user choice
            switch (choice) {
                case 0:
                    // Search age by name
                    String searchName = JOptionPane.showInputDialog("Enter the name to search:");
                    boolean found = false;
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].equalsIgnoreCase(searchName)) {//Checks for a match
                            JOptionPane.showMessageDialog(null, searchName + " is " + ages[i] + " years old.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(null, "Name not found.");
                    }
                    break;

                case 1:
                    // Delete a record by Name entered
                    String deleteName = JOptionPane.showInputDialog("Enter the name to delete:");
                    int indexToDelete = -1;
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].equalsIgnoreCase(deleteName)) {
                            indexToDelete = i;
                            break;
                        }
                    }
                    if (indexToDelete != -1) {
                        names = removeElement(names, indexToDelete);
                        ages = removeElement(ages, indexToDelete);
                        JOptionPane.showMessageDialog(null, deleteName + " has been deleted.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Name not found.");
                    }
                    break;

                case 2:
                    // Exit the program
                    System.exit(0);
                    break;
            }
        }
    }

    // Method to remove an element from a String array
    public static String[] removeElement(String[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            return array;
        }
        String[] newArray = new String[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[k++] = array[i];
        }
        return newArray;
    }

    // Method to remove an element from an int array
    public static int[] removeElement(int[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            return array;
        }
        int[] newArray = new int[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[k++] = array[i];
        }
        return newArray;
    }
}

