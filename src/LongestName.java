import javax.swing.*;

public class LongestName {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog(null, "Enter the first full name");
        String secondtName = JOptionPane.showInputDialog(null, "Enter the second full name");
        String thirdName = JOptionPane.showInputDialog(null, "Enter the third full name");

        String result = "";

        if(firstName.split(" ")[0].length() > secondtName.split(" ")[0].length()){
            result = firstName;
        } else if (secondtName.split(" ")[0].length() > thirdName.split(" ")[0].length()) {
            result = secondtName;
        }
        if(thirdName.split(" ")[0].length() > result.split(" ")[0].length()){
            result = thirdName;
        }

        String outMessage = result + " has the longest name";

        JOptionPane.showMessageDialog(null, outMessage);
    }
}
