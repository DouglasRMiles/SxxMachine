package SxxMachine.exceptions;

public class HaltException extends SystemException {
  private final int status;

  public HaltException(int status) {
    super("halt(" + status + ")");
    this.status = status;
  }

  public int getStatus() {
    return status;
  }
}
