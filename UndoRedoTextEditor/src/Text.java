public class Text {
  
  static StringBuilder s;
  public static volatile Text obj = null;

  private Text() {
  }

  StringBuilder insertTextAtIndex(int position, String newText) {
    s.insert(position, newText);
    return s;
  }

  String deleteTextBetweenIndex(int start, int end) {
    String deletedSubString = s.substring(start, end);
    s.delete(start, end);
    return deletedSubString;
  }

  StringBuilder getString() {
    return s;
  }

  public static Text getTextInstance() {
    if (obj == null) {
      synchronized (Text.class) {
        if (obj == null) {
          obj = new Text();
          s = new StringBuilder();
        }
      }
    }
      return obj;
  }
}
