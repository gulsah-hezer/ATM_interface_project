import java.util.Date;

public class Transaction{
  private double amount;
  private Date timestamp;
  private String memo;
  /* the account in which the transaction was performed */
  private Account inAccount;
}
