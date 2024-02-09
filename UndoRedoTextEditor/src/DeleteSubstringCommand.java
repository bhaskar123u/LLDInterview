public class DeleteSubstringCommand implements TextEditorCommand {
  
  Text text;
  String deletedString;
  private int startPosition;
  private int endPosition;

  // Constructor
  public DeleteSubstringCommand(int startPosition, int endPosition) {
    text = Text.getTextInstance();
    this.startPosition = startPosition;
    this.endPosition = endPosition;
  }

  public void execute() {
    deletedString = text.deleteTextBetweenIndex(startPosition, endPosition);
    System.out.println("String after delete substring between " + startPosition + " and " + endPosition + " : " + text.getString());
  }

  public void undo() {
    text.insertTextAtIndex(startPosition, deletedString.toString());
    System.out.println("String after Undo : " + text.getString());
  }
}
