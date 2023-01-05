package Multithread;

class MyData
{
    int value;
    boolean flag=true;
    
    
 
    synchronized public void set(int v)
    {
    	
    	//start with producer, flag != true means producer needs to wait since its not its turn
    	//inside while loop to avoid race condition
    	
        while(flag!=true)
            try {wait();}catch(Exception e){}
        
        //once its producer's turn then assign the value & flag = false so its consumer's turn & using notify
        value=v;
        flag=false;
        //wake up all threads 
        notify();
    }
    
    synchronized public int get()
    {
        int x= 0;
        while(flag!=false)
            try {wait();}catch(Exception e){}
        
        //once its consumer's turn and then assign the value & notify other threads 
        x=value;
        flag=true;
        notify();
        
        return x;            
    }
}




class Producer extends Thread
{
    MyData data;
    
    public Producer(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread
{
    MyData data;
    
    public Consumer(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int value;
        
        while(true)
        {
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class ExerciseTwo 
{
    public static void main(String[] args) 
    {
        MyData data=new MyData();
        
        Producer p=new Producer(data);
        Consumer c=new Consumer(data);
        
        p.start();
        c.start();
        
    }
}