/**
 * ..vlákno = thread
 * ..v jave opravdu existuje Thread a ta øeší vlákna.
 * ..tato tøída pracuje s rozhranní, které je potøebné pro BÌH toho vlákna.
 * ..když je potøebný pro bìh(rozhranní se bude jmenovat - Runnable).
 * ..toto rozhranní deklaruje jednu metodu a to metodu run.
 * ..v metodì run bìží vlákno.
 * ..pokud bychom chtìli vlákno pozastavit, tak tøída Thread ma k tomu metodu -- Thread.sleep() která má v parametrech poèet milisekund,
 * tzn. dobu, jak dlouho má èekat(jak dlouho má spát).
 */


public class ZdedeneVlakno extends Thread{
    
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException exp){}
        }
    }
}
