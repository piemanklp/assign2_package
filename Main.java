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
    public static void main(String[] args) throws Exception
    {
      ArrayList<Package> packageList = new ArrayList<Package>();
      ArrayList<Package> userList = new ArrayList<Package>();
      ArrayList<Package> transList = new ArrayList<Package>();



      // ***************Checking for File Existance************
      File x = new File("Package.ser");
      if (!x.exists()) {
        final Formatter nf;
        try {
          nf = new Formatter("Package.ser");
          out.println("Created new ser File!\n");
        }
        catch(Exception e) {
          out.println("Error when Creating ser File!");
        }
      }
      else { // ***********If File Exists Open It***************
        FileInputStream fis = new FileInputStream("Package.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //*****************Read Contents and Store**************
        try{
          while (true) {
            packageList.add((Package) ois.readObject());
          }
        }
        catch (Exception e) {
          out.println("Unknown Exception Thrown");
        }
        finally {
          ois.close();
        }
      }




// ************************ TESTING *********************************


      out.println("Attempting to Print File Contents: \n\n");
      for (Package p : packageList){
        p.printPackage();
      }
      out.println("\n\nAttempt Over..... \n");



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


    //  test.printPackage();
    //  out.println("\n");
      //test2.printPackage();
      //out.println("\n");
    //  test3.printPackage();
      //out.println("\n");
      //test4.printPackage();



      packageList.add(test);
      packageList.add(test2);
      packageList.add(test3);
      packageList.add(test4);







      out.println("\n\nThis is the packageList at the end of the Program: \n");
      for (Package p : packageList){
        p.printPackage();
      }
      out.println("This is all..... \n\n");



// **********************END TESTING********************************




      // ******************THIS IS FOR SORTING***********************
      Collections.sort(packageList);


      // *************Output to File and Close******************
      FileOutputStream fos = new FileOutputStream("Package.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      for (int i = 0; i < packageList.size(); i ++) {
        oos.writeObject(packageList.get(i));
      }
      fos.close();

    }
}
