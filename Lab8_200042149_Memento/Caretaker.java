package Lab8_200042149_Memento;

public class Caretaker {
    public static void main(String[] args){
        TextEditorV2 textEditorV2 = new TextEditorV2();

        textEditorV2.setLines("Hello there!!");
        textEditorV2.setLines("How you doing?!");

        System.out.println(textEditorV2.getLines());
        System.out.println("\n");

        MementoV2 mementoV2 = textEditorV2.saveState();

        textEditorV2.restore(mementoV2);
        System.out.println(textEditorV2.getLines());
        System.out.println("\n");

        textEditorV2.setLines("I don't like you.");

        System.out.println(textEditorV2.getLines());
        System.out.println("\n");

        textEditorV2.restore(mementoV2);
        System.out.println(textEditorV2.getLines());
        System.out.println("\n");
    }
}
