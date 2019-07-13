import java.io.*;
import java.lang.NumberFormatException;

public class LinkedListRunner{

public static void main(String args[])throws IOException{

  SingleLinkedListDemo linkedList = new SingleLinkedListDemo();
  DataInputStream dis = new DataInputStream(System.in);
  int option = 0; // Initializing to avoid null pointer in case of NumberFormatException

  while(true){
    System.out.print("Choose an operation: \n 1 - Display \n 2 -Insert  \n 3- Modify \n 4 - Delete \n 5- Exit \n \t :-");
    try{
      option = Integer.parseInt(dis.readLine());
    }catch(NumberFormatException e){
        System.out.println("Invalid entry !");
    }
    if(option == 5){
      System.out.println("bye...."); 
      break;
    }
    switch(option) {
     case 1:
         linkedList.display();
         break;
     case 2:
         linkedList.insert();
         break;
     case 3:
         int newValue = linkedList.modify();
         System.out.println("newValue is :" + newValue);
         break;
     case 4:       
        if(linkedList.head == null){
           linkedList.display();
           continue;
        }
		System.out.print("\n Deleting last node (Y/N) ? \t" );
        String ch = dis.readLine();
        if(ch.equalsIgnoreCase("y")){
          linkedList.delete();
        }else {
		   linkedList.display();
           System.out.print("Enter the position you want to delete:- \t");
           try{
            int position = Integer.parseInt(dis.readLine());
            linkedList.delete(position);
           }catch(NumberFormatException e){
             System.out.println("Invalid Entry!");
           }
         }
        break;
     }
    
  }

}
}