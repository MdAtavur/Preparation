import java.io.*;

public class UniqChars{
 public static void main(String args[])throws IOException{

  System.out.println("Enter the string");
  DataInputStream dis = new DataInputStream(System.in);
  String input = dis.readLine();
  System.out.println("Input String is Unique? :"+isUniq(input));  
 }

  private static boolean isUniq(String input){
    
      boolean[] isUniq = new boolean[128];

     for(char ch : input.toCharArray()){
        if(isUniq[ch] == Boolean.TRUE)
           return false;
        isUniq[ch] = Boolean.TRUE;
     }
     return true;
    
  }

}