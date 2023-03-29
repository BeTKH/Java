package OOP.Inheritance;

public class UIControl {

    private boolean isEnabled = true;

    // constructor code -> generate
    public UIControl() {
        this.isEnabled = isEnabled;
    }

    //setters.
    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }


    // getter
    public boolean isEnabled(){
        return isEnabled;
    }
}
