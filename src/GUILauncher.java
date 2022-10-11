import javax.swing.JFrame;

public class GUILauncher {
    public static void main(String[] args){
        GUItester theTest = new GUItester();
        theTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theTest.pack();
        theTest.setLocationRelativeTo(null);
        theTest.setSize(550,150);
        theTest.setVisible(true);
    }
}
