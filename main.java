/**
 * Main Class for Package Inventory Program
 *
 * @author Justin Couture and James Castleberry
 * @version v1.0 9/21/2017
 */
import static java.lang.System.out;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;


/**
* Main Program for Package Inventory Program
*  ADD MORE THINGS HERE
*/
public class main
{
    public static void main(String[] args)
    {
      out.println("\n\n\nThe beginning of something great!");
      String trackNum = "51349";
      String mailC = "First-Class";
      String spec = "Fragile";

      Package test = new Package(trackNum, mailC, spec);

      out.println("This is a test Package\n\n" + test.getTrack());
      out.println(test.getSpec());
      out.println(test.getMail() + "\n\n");


    }
}
