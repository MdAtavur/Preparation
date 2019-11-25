
public class CircularBuffer<T>{
   private T[] buffer;
   private int readHead= -1;
   private int writeHead = 0;
   private int size;
   
   public CircularBuffer(int size){
     this.size = size;
     buffer =(T[]) new Object[size];
   }

   public T poll(){
    readHead ++; 
    return buffer[readHead];
   }
   
   public boolean offer(T value){  
     if(writeHead == readHead)
        return false;
     buffer[writeHead] = value;
     writeHead = (writeHead + 1)%size; 
     return true;
   }

}