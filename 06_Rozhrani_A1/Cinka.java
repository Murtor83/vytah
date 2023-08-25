/**
 * Poèítání instancí
 */

public class Cinka implements IKresleny{
    // private static int pocetInstanci = 1;
    // private final int poradoveCislo = pocetInstanci++;
    // 1. pocetInstanci se pøiøadí do poradoveCislo 
    // 2.zvýší se pocetInstanci o 1
    // 3.zvýšený poèet instancí o jedno se pøiøadí do pocetInstanci
     
    // private static int pocetInstanci = 0;
    // private final int poradoveCislo = ++pocetInstanci; 
    // 1.zvýší se pocetInstanci o 1
    // 2.zvýšený poèet instancí o jedno se pøiøadí do pocetInstanci
    // 3. pocetInstanci se pøiøadí do poradoveCislo
    
    private static int pocetInstanci = 0;
    private final int poradoveCislo = ++pocetInstanci;
    private Obdelnik cinka;
    private Elipsa kruh1;
    private Elipsa kruh2;
    private AktivniPlatno platno;
    private int xPos;
    private int yPos;
    private int sirka;
    private int vyska;
    private Barva barva;
    
  
    
    public Cinka(){
        kruh1 = new Elipsa(0,0,30,30,Barva.CERNA);
        cinka = new Obdelnik(30,10,26,10,Barva.CERNA);
        kruh2 = new Elipsa(55,0,30,30,Barva.CERNA);
        
        platno = AktivniPlatno.getPlatno();
        platno.setMrizka(false);
        platno.pridej(this);
        
        setBarva(Barva.CERNA);
        
    }
    
    public void nakresli(Kreslitko kreslitko){
        kruh1.nakresli(kreslitko);
        kruh2.nakresli(kreslitko);
        cinka.nakresli(kreslitko);
    }
    
    public Barva getBarva(){
        return barva;
    }
    
    public void setBarva(Barva nova){
        barva = nova;
        kruh1.setBarva(nova);
        cinka.setBarva(nova);
        kruh2.setBarva(nova);
     
    }
    
    public String getNazev(){
        return "Èinka_" + poradoveCislo;
    }
    
    public Oblast getOblast(Oblast o){
        return null;
    }
    
    public void setOblast(Oblast o){
            
    }
    
    public Pozice getPozice(){ 
        return kruh1.getPozice();
    }
    
    public void setPozice(Pozice pozice){
        kruh1.setPozice(pozice);
        kruh2.setPozice(pozice);
        cinka.setPozice(pozice);
    }
    
    public void setPozice(int x, int y){
       kruh1.setPozice(x, y);
       kruh2.setPozice(x + cinka.getSirka()+kruh2.getSirka(), y);
       cinka.setPozice(x + 30, y + 10);
    }
    
    public Rozmer getRozmer(){
        return null;
    }
    
    public void setRozmer(int rozmer){
        kruh1.setRozmer(rozmer);
        kruh2.setRozmer(rozmer);
        cinka.setRozmer(rozmer -cinka.getSirka());
    }
    
    public int getSirka(){
        return kruh1.getSirka()+kruh2.getSirka()+cinka.getSirka();
               
    }
       
    public int getVyska(){
        return kruh1.getVyska();
    }
    
    public int getX(){
        return kruh1.getX();
    }
    
    public int getY(){
        return kruh1.getY();
    }
    
    public void posunDolu(int vzdalenost){
        kruh1.posunDolu(vzdalenost);
        kruh2.posunDolu(vzdalenost);
        cinka.posunDolu(vzdalenost);
        
    }
    
    public void posunDolu(){
        kruh1.posunDolu(platno.getKrok());
        kruh2.posunDolu(platno.getKrok());
        cinka.posunDolu(platno.getKrok());
    }
    
    public void posunVlevo(){
        posunVpravo( -platno.getKrok());
        
    }
    
    public void posunVpravo(int vzdalenost){
        kruh1.posunVpravo(vzdalenost);
        kruh2.posunVpravo(vzdalenost);
        cinka.posunVpravo(vzdalenost);
    }
    
    public void posunVpravo(){
        posunVpravo( platno.getKrok());
    }
    
    public void posunVzhuru(){
        posunDolu( -platno.getKrok() );
    }
    
    public void setRozmer(int sirka, int vyska){
        kruh1.setRozmer(sirka, vyska);
        kruh2.setRozmer(sirka, vyska);
        cinka.setRozmer(sirka, vyska - 20); 
    }
}
