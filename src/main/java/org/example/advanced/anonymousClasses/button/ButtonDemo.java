package org.example.advanced.anonymousClasses.button;

public class ButtonDemo {

    public static void main(String[] args) {
//        Button startGameButton =new MyButton("Start",100,50);
//        startGameButton.checkIfButtonWasClicked();

      /*  Button startGameButton = new Button("Start",100,50){
            @Override
            public void reactionOnClick() {
                System.out.println("start the game");
            }
        };
        startGameButton.checkIfButtonWasClicked();*/

        Reaction reaction = new Reaction(){
            @Override
            public void react() {
                System.out.println("Start game");
            }
        };

        ButtonDemo startGameButton = new ButtonDemo();
        startGameButton.reactionOnClick();
    }

    private void reactionOnClick() {
    }

}

/*
class MyButton extends Button{
    public MyButton(String text, int width, int height) {
        super(text, width, height);
    }
    @Override
    public void reactionOnClick() {
        System.out.println("Start our game");
    }
}
*/

class Button{

    private String text;
    private int width;
    private int height;
    private Reaction reaction;

    public Button(String text, int width, int height, Reaction reaction) {
        this.text = text;
        this.width = width;
        this.height = height;
        this.reaction = reaction;
    }

    public void checkIfButtonWasClicked(){
        // check if mouse clicked on button
        reactionOnClick();
    }

    public void reactionOnClick() {
        reaction.react();
    }
}

interface Reaction{
    void react();

}
