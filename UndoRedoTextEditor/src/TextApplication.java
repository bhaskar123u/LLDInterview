// This used command design pattern
public class TextApplication {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to text editor app");
        System.out.println();

        TextEditor textEditor = new TextEditor();
        textEditor.insertText("Hello", 0);
        textEditor.insertText("World", 5);
        textEditor.deleteText(3, 6);
        textEditor.undo();

        textEditor.insertText("India", 3);
        textEditor.undo();
    }
}
