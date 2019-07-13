import java.io.*;
/**
  Continue : Keyword can be used in any of the loop control structures, It causes loop to immediatly jump to the next iteration.
*/
public class SingleLinkedListDemo{
public static Node head;



//TODO: Display reverse
public static void display(){
  if(head == null){
   System.out.println("\nList is Empty! \n \n");
  }else{
    System.out.println("Data in the linked list is :\n");
    Node tempNode = head;
    int i =1;
    while(tempNode.next !=null){
      System.out.println(i+".  "+tempNode.data+"-->"+tempNode.next);
      tempNode=tempNode.next;
      i++;
    }
    System.out.println(i+".  "+tempNode.data+"-->"+tempNode.next+" \n \n");//To print last node
  }
}

//TODO: insert at particular position ??
public static void insert(){
	int data;
  System.out.println("Enter value to be inserted:");
  try{
    data = Integer.parseInt(dis.readLine());
  }catch(NumberFormatException e){
    System.out.println("Invalid Entry!");
	return;
  }
//Construct node to be inserted  
  Node newNode = new Node();
  newNode.data = data;
  newNode.next = null;
   
// If list is empty, new node will be the head
  if(head == null){
    head = newNode;
  }else{
    Node node = head;
    //traverse till the end of list
    while(node.next != null){
      node= node.next;
    }
    node.next = newNode;
  }
  System.out.println("\n Successfully Insertion done! \n \n");
  display();
}	

//TODO: Need to implement 
public static int modify(){
System.out.println("we are in modify function \n");

return 0;
}

public static void delete(){
  if(head == null){
    System.out.println("\n List is Empty! \n \n");
  }else if(head.next == null){
    head = null;
    display();
  }else{
    Node node = head;
    Node previous = head;
    while(node.next != null){
      previous = node;
      node = node.next; 
    }
    node = null;
    previous.next = null;
    System.out.println(" \n Successfully deleted new list is: \n \n ");
    display();
  }
}

public static void delete(int position){
 if(head == null){
    System.out.println("\n List is Empty! \n \n");
  }else if(head.next == null){
    if(position != 1){
      System.out.println("Invalid position");
    }else{
      head = null;
     display();
    }
   }else {
    Node node = head;
    Node previousNode = null;
    for(int i =1; i<position; i++){
      if(node.next != null){
         previousNode = node;
         node = node.next;
      }
    }
    if(previousNode == null){
      head = node.next;
      node = null;
    }else{
      previousNode.next = node.next;
      node = null;
    }
    display();
   }
}

}