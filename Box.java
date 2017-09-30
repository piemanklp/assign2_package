import static java.lang.System.out;
import java.util.Scanner;

/**
 * This class extends the Package class and has methods for the type "Box"
 * included getters and setters.
 *
 * @author James Castleberry and Justin Couture
 * @version v1.0  9/21/2017
 */



 public class Box extends Package
 {
   private
     int largestDimension;
     int volume;
     String type;



     /**
      * This constructor initializes the package order: Box object. The constructor provides no
      * user input validation. That should be handled by the class that creates a
      * package order: Box object.
      *
      * @param largestDimension a <b><CODE>int</CODE></b> that represents the largestDimension of the Box
      *
      * @param volume a <b><CODE>int</CODE></b> that represents the volume of the Box.
      *
      * @param type a <b><CODE>String</CODE></b> that represents the type of the Box.
      *
      */
     public Box(String tN, String mC, String s, int lD, int v) {
         // initialize instance variables
         this.largestDimension = lD;
         this.volume = v;
         this.type = "Box";
         this.setTrack(tN);
         this.setMail(mC);
         this.setSpec(s);
     }




             //***THIS IS THE GETTERS***



    /**
     * This method returns the package order: box's largestDimension.
     *
     * @return a <b><CODE>int</CODE></b> that is the largestDimension of the package order: box.
     */
    public int getlargestDimension(){
      return largestDimension;
    }

    /**
     * This method returns the package order: box's volume.
     *
     * @return a <b><CODE>int</CODE></b> that is the volume of the package order: box.
     */
    public int getVolume(){
      return volume;
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
        return getTrack() + " " + getSpec() + " " + getMail() + " " + type + " " + largestDimension + " " + volume;
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
