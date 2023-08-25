

public class FunnyVlakno{
    public FunnyVlakno(){
        new Thread(()->{
            for(int i =0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException exp){}
        }
        }).start();
    }
}
