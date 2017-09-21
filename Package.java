/**
 * The Package contains all of the variables relevant for a package as
 * well as methods for getting the values and constructing new packages.
 *
 * @author James Castleberry and Justin Couture
 * @version v1.0  9/21/2017
 */

import static java.lang.System.out;
import java.util.Scanner;

public class Package
{

  private
    String trackNumber;
    String spec;
    String mailClass;



  public String getTrack()           // Get'ers
  {
    String temp;
    temp = this.trackNumber;

    return temp;
  }

  public String getSpec()
  {
    String temp;
    temp = this.spec;

    return temp;
  }

  public String getMail()
  {
    String temp;
    temp = this.mailClass;

    return temp;
  }


  /**
   * Constructor for objects of class Package.  Accepts 3 variables and
   * assignes them to the private values of the particular package.
   */
  public Package(String tn, String s, String m)
  {
      // initialize instance variables
      this.trackNumber = tn;
      this.spec = s;
      this.mailClass = m;
  }


}
