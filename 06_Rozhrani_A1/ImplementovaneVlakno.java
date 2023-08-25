

public class ImplementovaneVlakno implements Runnable{
    private Thread vlakno;
    
    public void spustVlakno(){
        if(vlakno == null || !vlakno.isAlive()){
            vlakno = new Thread(this);
            vlakno.start();
        }
    }
    
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException exp){}
        }
    }
}
