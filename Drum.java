import static java.lang.System.out;
import java.util.Scanner;

/**
 * This class extends the Package class and has methods for the type "Drum"
 * included getters and setters.
 *
 * @author James Castleberry and Justin Couture
 * @version v1.0  9/21/2017
 */


 public class Drum extends Package
 {
   private
     String material;
     float diameter;
     String type;



     /**
      * This constructor initializes the package order: drum object. The constructor provides no
      * user input validation. That should be handled by the class that creates a
      * package order: drum object.
      *
      * @param mat a <b><CODE>String</CODE></b> that represents the material of the drum
      * this value should be either "Plastic" or "Fiber".  This should be validated by the
      * class which is creating the object.
      *
      * @param di a <b><CODE>float</CODE></b> that represents the diameter of the drum.
      *
      * @param type a <b><CODE>String</CODE></b> that represents the type of the package.
      *
      */
     public Drum(String tN, String mC, String s, String mat, float di) {
         // initialize instance variables
         this.material = mat;
         this.diameter = di;
         this.type = "Drum";
         this.setTrack(tN);
         this.setMail(mC);
         this.setSpec(s);
     }




             //***THIS IS THE GETTERS***



    /**
     * This method returns the package order: drum's material.
     *
     * @return a <b><CODE>String</CODE></b> that is the material of the package order: Drum.
     *
     */
    public String getMaterial(){
      return material;
    }

    /**
     * This method returns the package order: Drum's diameter.
     *
     * @return a <b><CODE>float</CODE></b> that is the diameter of the package order: Drum.
     */
    public float getDiameter(){
      return diameter;
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
        return getTrack() + " " + getSpec() + " " + getMail() + " " + type + " " + material + " " + diameter;
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
