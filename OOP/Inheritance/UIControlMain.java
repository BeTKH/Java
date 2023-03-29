package OOP.Inheritance;

public class UIControlMain {

    public static void main(String[] args) {

        UIControl controlObj = new UIControl();

        controlObj.disable();
        System.out.println(controlObj.isEnabled());


        TextBox txbObj = new TextBox();

        // text before setting
        System.out.println("\noutput text before setText: "+txbObj.getText());

        txbObj.setText("written new text!");
        System.out.println("output text after setText: "+txbObj.getText()+"\n");


        // we can access UIControl methods because TextBox inherits from it.

        TextBox txbO = new TextBox();
        txbO.enable();
        System.out.println(txbO.isEnabled());
    }
}
