//.. objek, kter� se vytvo�� z anonymn� t��dy se provede jen jednou na konkr�tn�m m�st� a nikde se neulo�� do lokaln� prom�nn� nebo atributu.
//.. jednodu�e �e�eno: objekt z anonymn� t��dy se provede a pak se zahod�.
//.. anonymn� t��du pou�ije� jako parametr.

public class UkazkaAnonymniTridy{
    public UkazkaAnonymniTridy(){
        new Playable(){
            public void playGame(){
            }
            public void callScore(){
            }
        }.playGame();
        
        // v p��pad�, �e metoda nebo konstruktor m� jen jeden parametr ROZHRAN�, m��eme pou��t LAMBDU (->) jako anonymn� t��du.
        // lambdu MَEME POU��T jenom v p��pad�, kdy� m� ROZHRANN� jednu metodu!!
        usingClosable((x)->{
        });
       
    }
    
    public void usingClosable(Closable closable){
        
    }
}
