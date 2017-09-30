import static java.lang.System.out;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

/**
 * Main Class for Package Inventory Program
 *
 * @author Justin Couture and James Castleberry
 * @version v1.0 9/21/2017
 */



/**
* Main Program for Package Inventory Program
*  ADD MORE THINGS HERE
*/
public class Main
{
    public static void main(String[] args)
    {
      out.println("\n\n\nThe beginning of something great!\n\n");



      String trackNum = "51349";
      String mailC = "First-Class";
      String spec = "light";
      int largeDim = 22;
      int volume = 33;

      Box test = new Box(trackNum, mailC, spec, largeDim, volume);

       trackNum = "11111";
       mailC = "Second-Class";
       spec = "Bulky";
       float lw= 24.345f;
       String contents = "The Sum of all Evil";

      Crate test2 = new Crate(trackNum, mailC, spec, lw, contents);

       trackNum = "22222";
       mailC = "First-Class";
       spec = "Awkward";
       String material = "Plastic";
       float diameter = 88.30f;

      Drum test3 = new Drum(trackNum, mailC, spec, material, diameter);

       trackNum = "33333";
       mailC = "Fourth-Class";
       spec = "Perfect!";
       int height = 10;
       int width = 90;

       Envelope test4 = new Envelope(trackNum, mailC, spec, height, width);


      test.printPackage();
      out.println("\n");
      test2.printPackage();
      out.println("\n");
      test3.printPackage();
      out.println("\n");
      test4.printPackage();

    }
}
