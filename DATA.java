// include add-on module libraries
import java.util.Random;
import javax.swing.JOptionPane;    

public class DATA {
    // randomGenerator can "make" random numbers
    private Random randomGenerator = new Random();
    // random number will store an actual random number made by the randomGenerator
    private int randomNumber;

    public DATA() {
        // two alternative ways to set up a value, random number or keyboard entry
        // makeData();
        // enterData();
    }

    public void makeData()    {
        // make a new random number and store it
        randomNumber = randomGenerator.nextInt(100);
    }

    public void enterData() {
        // use inpupt validation to enter a value 0-100
        randomNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number ;"));
        while ((randomNumber < 0) || (randomNumber > 100)) {
            randomNumber = Integer.parseInt(JOptionPane.showInputDialog("Error, enter a number ;"));
        }
    }

    // allow another object to ask for the current value
    public int getData()    {
        return randomNumber;
    }

    // display current value on screen
    public void displayData()    {
        System.out.print(randomNumber);
    }

}
