import static java.lang.System.out;
import java.io.*;
import java.util.*;
import java.util.Scanner;

/**
 * This class extends the Package class and has methods for the type "Envelope"
 * including getters and setters.
 *
 * @author James Castleberry and Justin Couture
 * @version v1.0  9/21/2017
 */


public class Envelope extends Package
{
  private
    int height;
    int width;
    String type;



    /**
     * This constructor initializes the package order: envelope object. The constructor provides no
     * user input validation. That should be handled by the class that creates a
     * package order: envelope object.
     *
     * @param height a <b><CODE>int</CODE></b> that represents the height of the envelope
     *
     * @param width a <b><CODE>int</CODE></b> that represents the width of the envelope.
     *
     * @param type a <b><CODE>String</CODE></b> that represents the type of the envelope.
     *
     */
    public Envelope(String tN, String mC, String s, int h, int w) {
        // initialize instance variables
        this.height = h;
        this.width = w;
        this.type = "Envelope";
        this.setTrack(tN);
        this.setMail(mC);
        this.setSpec(s);
    }




            //***THIS IS THE GETTERS***



   /**
    * This method returns the package order: box's Height.
    *
    * @return a <b><CODE>int</CODE></b> that is the height of the package order: box.
    */
   public int getHeight(){
     return height;
   }

   /**
    * This method returns the package order: box's width.
    *
    * @return a <b><CODE>int</CODE></b> that is the width of the package order: box.
    */
   public int getWidth(){
     return width;
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
       return getTrack() + " " + getSpec() + " " + getMail() + " " + type + " " + height + " " + width;
     }


   /**
    * This method prints the package
    *
    * object delineated by a space and in the same order as toString()
    */
    public void printPackage(){
      String printme = this.toString();
      out.println(printme);
    }
}
