import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class BSTRunner{

 public static void main(String args[]) throws IOException{
 
    System.out.println("Lets Insert some data in BST !");
	
	Scanner sc = new Scanner(System.in);
	BSTOperations bst = new BSTOperations();
    Pattern delimiters = Pattern.compile(System.getProperty("line.separator")+"|\\s");
    sc.useDelimiter(delimiters); 
	
    while (sc.hasNextInt()){
        bst.insert(sc.nextInt());
    }
	
	
	bst.display();
 }

}


