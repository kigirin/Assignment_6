package Factory;

public abstract class Dialog {
    abstract class createButton{
        public abstract void Button();
    };
    abstract class Button{
        public abstract void Button();
        public abstract void onClick();
    }
    public void render(){
        Button okButton=createButton();
        okButton.onClick();
        okButton.render;
    }
}
