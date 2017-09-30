import static java.lang.System.out;
import java.util.Scanner;

/**
 * This class extends the Package class and has methods for the type "crate"
 * included getters and setters.
 *
 * @author James Castleberry and Justin Couture
 * @version v1.0  9/21/2017
 */



 public class Crate extends Package
 {
   private
     float loadWeight;
     String content;
     String type;



     /**
      * This constructor initializes the package order: crate object. The constructor provides no
      * user input validation. That should be handled by the class that creates a
      * package order: crate object.
      *
      * @param lw a <b><CODE>float</CODE></b> that represents the load weight of the crate
      *
      * @param c a <b><CODE>String</CODE></b> that represents the content of the crate.
      *
      * @param type a <b><CODE>String</CODE></b> that represents the type of the package.
      *
      */
     public Crate(String tN, String mC, String s, float lw, String c) {
         // initialize instance variables
         this.loadWeight = lw;
         this.content = c;
         this.type = "Crate";
         this.setTrack(tN);
         this.setMail(mC);
         this.setSpec(s);
     }




             //***THIS IS THE GETTERS***



    /**
     * This method returns the package order: crate's load weight.
     *
     * @return a <b><CODE>float</CODE></b> that is the load weight of the package order: crate.
     */
    public float getLoadWeight(){
      return loadWeight;
    }

    /**
     * This method returns the package order: crate's content.
     *
     * @return a <b><CODE>String</CODE></b> that is the content of the package order: crate.
     */
    public String getContent(){
      return content;
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
        return getTrack() + " " + getSpec() + " " + getMail() + " " + type + " " + loadWeight + " " + content;
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
