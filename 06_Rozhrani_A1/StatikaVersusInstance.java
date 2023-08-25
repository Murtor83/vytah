// Instanèní metody volám na instanci. Instanèní metody NEMAJÍ static.
//Tøídní metody neboli statické, obsahují klíèové slovo static.
// 1. používají se pøed tím,než se vytvoøí instance.
// 2. volají se na tøídu.
// 3. statika se používá ve velmi zoufalé situaci.
// 4. reálné použití statiky : a) když chceš poèítat instance. b) když chceš nìco nastavit ještì pøed tím
// než se vytvoøí instance. c) u globálních promìnných.
// --v metodì "výpis" v cviceni --máme stejný zapis provolávání metody z kolekce
// pro každý prvek v kolekci.Pak na to koukní!!!



public class StatikaVersusInstance {
    private int cislo;
    private static int statickeCislo;
    
    public void setCislo(int cislo){
        this.cislo = cislo;
    }
    
    public int getCislo(){
        return cislo;
    }
    
    public static int getStatickeCislo(){
        return statickeCislo;
    }
    public static void setStatickeCislo(int statickeCislo) {
        StatikaVersusInstance.statickeCislo = statickeCislo;
    }
}
