public class DebugLogProcessor extends LogProcessor {

  DebugLogProcessor(LogProcessor logProcessor) {
    super(logProcessor);
  }

  public void log(int logLevel, String msg) {
    if (logLevel == DEBUG) {
      System.out.println("DEBUG " + msg);
    } else {
      super.log(logLevel, msg);
    }
  }
}
