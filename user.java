
import java.util.ArrayList;
import java.security.MessageDigest;

public class User {
  private String firstName;
  private String lastName;
  private String uuid;
  /* The MD5 hash of the user's pin number.*/
  private byte pinHash[];
  /* The list of accounts for this user.*/
  private ArrayList<Account> accounts;
  /* Constructor */
  public User(String firstName, String lastName, String pin, Bank the bank ){
   // set user's name
    this.firstName=firstName;
    this.lastName=lastName;
     try{
          MessageDigest md=MessageDigest.getInstance("MD5")
          this.pinhash=md.digest(pin.getBytes());
     }
      catch (NoSuchAlgorithmExeption e) {
      Sytem.err.println("error, caught NoSuchAlgorithmExeption");
      e.printStackTrace();
      System.exit(1);
      }
    this.uuid=theBank.getNewUserUUID();
  }
  
}

