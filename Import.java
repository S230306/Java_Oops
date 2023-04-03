/*The import keyword is used to import a package, class or interface.
 * there is two type of import
 * 1 - Exlicit Import.
 *  ex- import java.util.name of the class
 * 2 - Implicit Import.
 * ex - import java.util.*;
 */
import java.util.*; //implicit import
import java.util.ArrayList; //Explicit Import
public class Import {
    public static void main(String[]args){
        java.util.ArrayList l1 = new java.util.ArrayList();// explicit import
        ArrayList l = new ArrayList(); //this give the error  
    } 
}
/* thats all about the import 
 * if we are not import the packages if give the errror can't not find the simble
 * for java.long and string not required any package.
*/
