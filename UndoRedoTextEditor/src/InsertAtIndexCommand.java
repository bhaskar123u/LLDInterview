public class InsertAtIndexCommand implements TextEditorCommand {
  Text text;
  private int position;
  String newString;

  // Constructor
  public InsertAtIndexCommand(String newString, int position) {
    text = Text.getTextInstance();
    this.position = position;
    this.newString = newString;
  }

  public void execute() {
    text.insertTextAtIndex(position, newString);
    System.out.println("String after insert at position " + position + " : " + text.getString());
  }

  public void undo() {
    text.deleteTextBetweenIndex(position, position+newString.length());
    System.out.println("String after insertUndo : " + text.getString());
  }
}
