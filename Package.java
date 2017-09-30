
import static java.lang.System.out;
import java.util.Scanner;

/**
 * Package class the variables relevant for a package as
 * well as methods for getting the values and constructing new packages.
 *
 * @author James Castleberry and Justin Couture
 * @version v1.0  9/21/2017
 */


public abstract class Package
{

  private
    String trackNumber;
    String spec;
    String mailClass;




            // ***THIS IS THE GETTERS***



  /**
   * This method returns the package order's tracking number.
   *
   * @return a <b><CODE>String</CODE></b> that is the tracking number of the package order.
   */
  public String getTrack(){
    return trackNumber;
  }

  /**
   * This method returns the package order's specification.
   *
   * @return a <b><CODE>String</CODE></b> that is the package order's specification.
   */
  public String getSpec() {
    return spec;
  }

  /**
   * This method returns the package order's mailing class.
   *
   * @return a <b><CODE>string</CODE></b> that is the package order's mailing class
   */
  public String getMail() {
    return  mailClass;
  }





          //***THIS IS THE SETTERS***




  /**
   * This method sets the package order's tracking number.
   * @param t a <b><CODE>String</CODE></b> that represents the tracking Number
   */
  public void setTrack(String t) {
    this.trackNumber = t;
  }

  /**
   * This method sets the package order's specification.
   * @param s a <b><CODE>String</CODE></b> that represents the specification
   */
  public void setSpec(String s) {
    this.spec = s;
  }

  /**
   * This method sets the package order's mailing class.
   * @param sm a <b><CODE>String</CODE></b> that represents the mail C
   */
  public void setMail(String sm) {
    this.mailClass = sm;
  }






          // ***MISC FUNCTIONS***


          

  /**
   * This method returns the package order's fields as a string representation.
   *
   * @return a <b><CODE>String</CODE></b> that lists the fields of the package order
   * object delineated by a space and in the same order as the constructor
   */
  @Override
  public String toString() {
      return trackNumber + " " + spec + " " + mailClass + " ";
    }


  /**
   * This method prints the formated contents of a package
   *
   */
   abstract void printPackage();

  /**
   * This method provides a way to compare two package order objects.
   *
   * @param c a <b><CODE>PackageOrder</CODE></b> object that is used to compare to
   * <b><CODE>this</CODE></b> package order. Two orders are equal if their TrackingNumber is the
   * same.
   * @return the <CODE>boolean</CODE> value of the comparison.
   */
  public boolean equals(Package c) {
      return c.getTrack().equals(this.trackNumber);
  }
}
