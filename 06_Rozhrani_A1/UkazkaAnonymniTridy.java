//.. objek, který se vytvoøí z anonymní tøídy se provede jen jednou na konkrétním místì a nikde se neuloží do lokalní promìnné nebo atributu.
//.. jednoduše øeèeno: objekt z anonymní tøídy se provede a pak se zahodí.
//.. anonymní tøídu použiješ jako parametr.

public class UkazkaAnonymniTridy{
    public UkazkaAnonymniTridy(){
        new Playable(){
            public void playGame(){
            }
            public void callScore(){
            }
        }.playGame();
        
        // v pøípadì, že metoda nebo konstruktor má jen jeden parametr ROZHRANÍ, mùžeme použít LAMBDU (->) jako anonymní tøídu.
        // lambdu MÙŽEME POUŽÍT jenom v pøípadì, když má ROZHRANNÍ jednu metodu!!
        usingClosable((x)->{
        });
       
    }
    
    public void usingClosable(Closable closable){
        
    }
}
