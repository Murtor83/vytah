/**
 * ..vl�kno = thread
 * ..v jave opravdu existuje Thread a ta �e�� vl�kna.
 * ..tato t��da pracuje s rozhrann�, kter� je pot�ebn� pro B�H toho vl�kna.
 * ..kdy� je pot�ebn� pro b�h(rozhrann� se bude jmenovat - Runnable).
 * ..toto rozhrann� deklaruje jednu metodu a to metodu run.
 * ..v metod� run b�� vl�kno.
 * ..pokud bychom cht�li vl�kno pozastavit, tak t��da Thread ma k tomu metodu -- Thread.sleep() kter� m� v parametrech po�et milisekund,
 * tzn. dobu, jak dlouho m� �ekat(jak dlouho m� sp�t).
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
