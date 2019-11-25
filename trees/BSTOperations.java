import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class BSTOperations{
   private TreeNode node;
   Map<Integer, List<Integer>> map = new TreeMap();
   
   public void insert(int data){
	   
	   if(node == null){
		   node = new TreeNode(data);
	   }else{
		   recursiveInsert(node, data);
	   }
	   
   }
   private void recursiveInsert(TreeNode node, int data){
	   if(data > node.data){
		   
		   if(node.right == null){
			   node.right = new TreeNode(data);
		   }else{
			   recursiveInsert(node.right, data);
		   }
		   
	   }else{
		   
		   if(node.left == null){
			   node.left = new TreeNode(data);
		   }else{
			   recursiveInsert(node.left, data);
		   }
	   }
		   
   }
   
   public void display(){
	   if(node == null)
		   System.out.println("Tree is empty!");
	   else{
		   System.out.println("Here is what you inserted:");
		   displayLevelOrderHelper(node);
		   
	   }
	   
   }
   
   private void recursiveDisplay(TreeNode node){
	   
	   if(node.left !=null)
		   recursiveDisplay(node.left);
	   if(node.right != null)
		   recursiveDisplay(node.right);
	   
   }
   private void displayLevelOrderHelper(TreeNode node){
	   Queue<TreeNode> queue = new LinkedList();
	   queue.add(node);
	   
	   //recursiveDisplayLevelORder(queue);
	   
	   //queue.add(null);
	   //recursiveDisplayLevelByLevel(queue);
	   
	   verticalTraversalHelper(node);
   }
   
   private void verticalTraversalHelper(TreeNode node){
	   	   
	   recursiveVerticalTraversal(node, 0);
	   for(Map.Entry<Integer, List<Integer>> entryList : map.entrySet()){
		   System.out.print(entryList.getValue());
	   }
   }
   
   private void recursiveVerticalTraversal(TreeNode node, int position){
	   
	   if(map.get(position) == null){
		   List list = new ArrayList();
		   list.add(node.data);
		   map.put(position, list);
		   System.out.println("Added:"+map.get(position)+" :- At "+position);
	   }else{
		   List<Integer> data = map.get(position);
		   System.out.println("adding:"+node.data+" To:-"+data);
		   data.add(node.data);
		   map.put(position, data);
	   }
	   if(node.left != null)
		   recursiveVerticalTraversal(node.left, position-1);
	   if(node.right != null)
		   recursiveVerticalTraversal(node.right, position+1);
   }
   
   
   private void recursiveDisplayLevelByLevel(Queue<TreeNode> queue){
	   
	   if(queue.size() > 0){
		   TreeNode node = queue.remove();
		   if(node != null){
			   System.out.print(node.data+"\t");
			   if(node.left != null)
	             queue.add(node.left);
	           if(node.right != null)
	             queue.add(node.right);
	           recursiveDisplayLevelByLevel(queue);
		   }else{
			   System.out.println("\n ----------------");
			   if(queue.size() > 0)
				   queue.add(null);
			   recursiveDisplayLevelByLevel(queue);
		   }		   
	   }   
   }
   
   private void recursiveDisplayLevelORder(Queue<TreeNode> queue){
	   if(queue.size() > 0){
	     TreeNode node = queue.remove();
	     System.out.print(node.data);
		 if(node.left != null)
	       queue.add(node.left);
	     if(node.right != null)
	       queue.add(node.right);
	     recursiveDisplayLevelORder(queue);
	   }
	   
   }
   
   private void recursiveDisplayPreORder(TreeNode node){
	   System.out.print(node.data);
	   if(node.left !=null)
		   recursiveDisplay(node.left);
	   if(node.right != null)
		   recursiveDisplay(node.right);
	   
   }
  


}