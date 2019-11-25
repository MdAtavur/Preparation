import java.util.*;

public class JavaQueue{

  public static void main(String args[]){

  //Queue<String, Integer> queue = new HashMap<String,Integer>();
Queue<Map<String,Integer>> queue = new LinkedList<Map<String,Integer>>();
Map tempMap = new HashMap<String, Integer>("hi", 2);
//tempMap.put("hi", 2);
queue.add(tempMap);
System.out.println("Queue entry is :"+queue.remove());

}

}