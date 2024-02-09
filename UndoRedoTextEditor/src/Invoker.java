import java.util.Stack;

class Invoker {
  private Stack<TextEditorCommand> undoStack = new Stack<>();

  public void executeCommand(TextEditorCommand command) {
    command.execute();
    undoStack.push(command);
  }

  public void undo() {
    if (!undoStack.isEmpty()) {
      TextEditorCommand command = undoStack.pop();
      command.undo();
    }
  }
}
