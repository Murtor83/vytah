// Instan�n� metody vol�m na instanci. Instan�n� metody NEMAJ� static.
//T��dn� metody neboli statick�, obsahuj� kl��ov� slovo static.
// 1. pou��vaj� se p�ed t�m,ne� se vytvo�� instance.
// 2. volaj� se na t��du.
// 3. statika se pou��v� ve velmi zoufal� situaci.
// 4. re�ln� pou�it� statiky : a) kdy� chce� po��tat instance. b) kdy� chce� n�co nastavit je�t� p�ed t�m
// ne� se vytvo�� instance. c) u glob�ln�ch prom�nn�ch.
// --v metod� "v�pis" v cviceni --m�me stejn� zapis provol�v�n� metody z kolekce
// pro ka�d� prvek v kolekci.Pak na to koukn�!!!



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
