import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        JOptionPane.showMessageDialog(null,"Got username, and age!");

        System.out.println("User name: "+ name);
        System.out.println("User born in : "+ (2022-age));

    }
}