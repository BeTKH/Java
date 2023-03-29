package OOP.Inheritance;

public class TextBox extends UIControl {

    private String text = "";

    public void setText(String text_){
        this.text = text_;
    }

    public String getText(){
        return text;
    }

    //.
    public void clearText(){
        text = "";
    }
}
