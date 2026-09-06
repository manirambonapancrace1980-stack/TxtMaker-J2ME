import javax.microedition.lcdui.*;

/**
 * MainScreen - Main UI Screen for TxtMaker
 * Provides text editing capabilities
 */
public class MainScreen extends Form implements CommandListener {
    private TxtMaker midlet;
    private TextField textField;
    private Command exitCommand;
    private Command saveCommand;
    private Command clearCommand;

    public MainScreen(TxtMaker midlet) {
        super("TxtMaker");
        this.midlet = midlet;

        // Create text field
        textField = new TextField("Enter text:", "", 1000, TextField.ANY);
        append(textField);

        // Create commands
        exitCommand = new Command("Exit", Command.EXIT, 1);
        saveCommand = new Command("Save", Command.OK, 2);
        clearCommand = new Command("Clear", Command.SCREEN, 3);

        addCommand(exitCommand);
        addCommand(saveCommand);
        addCommand(clearCommand);

        setCommandListener(this);
    }

    public void commandAction(Command c, Displayable d) {
        if (c == exitCommand) {
            midlet.exit();
        } else if (c == saveCommand) {
            String text = textField.getString();
            Alert alert = new Alert("Saved", "Text saved: " + text.length() + " characters", null, AlertType.INFO);
            alert.setTimeout(2000);
            Display.getDisplay(midlet).setCurrent(alert, this);
        } else if (c == clearCommand) {
            textField.setString("");
        }
    }
}
