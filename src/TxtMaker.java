import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * TxtMaker - J2ME Text Editor MIDlet
 * A simple text editor application for J2ME devices
 */
public class TxtMaker extends MIDlet {
    private Display display;
    private MainScreen mainScreen;

    public TxtMaker() {
        super();
    }

    protected void startApp() throws MIDletStateChangeException {
        display = Display.getDisplay(this);
        mainScreen = new MainScreen(this);
        display.setCurrent(mainScreen);
    }

    protected void pauseApp() {
    }

    protected void destroyApp(boolean unconditional) throws MIDletStateChangeException {
    }

    public void exit() {
        try {
            destroyApp(true);
        } catch (MIDletStateChangeException e) {
            e.printStackTrace();
        }
        notifyDestroyed();
    }
}
