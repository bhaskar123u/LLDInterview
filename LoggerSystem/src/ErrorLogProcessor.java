public class ErrorLogProcessor extends LogProcessor {

  ErrorLogProcessor(LogProcessor logProcessor) {
    super(logProcessor);
  }

  public void log(int logLevel, String msg) {
    if (logLevel == ERROR) {
      System.out.println("ERROR " + msg);
    } else {
      super.log(logLevel, msg);
    }
  }
}
