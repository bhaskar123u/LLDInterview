class TextEditor {
  private Invoker invoker = new Invoker();

  public void insertText(String text, int position) {
    TextEditorCommand command = new InsertAtIndexCommand(text, position);
    invoker.executeCommand(command);
  }

  public void deleteText(int startPosition, int endPosition) {
    TextEditorCommand command = new DeleteSubstringCommand(startPosition, endPosition);
    invoker.executeCommand(command);
  }

  public void undo() {
    invoker.undo();
  }
}