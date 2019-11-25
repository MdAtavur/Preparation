public class CircularBufferRunner{

  public static void main(String args[]){
    CircularBuffer<Integer> circularBuffer = new CircularBuffer(3);
    circularBuffer.offer(1);
    circularBuffer.offer(2);
    circularBuffer.offer(3);
    
    System.out.println(circularBuffer.poll());
    circularBuffer.offer(4);
    System.out.println(circularBuffer.poll());
    System.out.println(circularBuffer.poll());
   
  }
  

}