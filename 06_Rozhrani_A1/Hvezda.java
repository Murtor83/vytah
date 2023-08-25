

public class Hvezda implements IKresleny{
    
    private Trojuhelnik prvni;
    private Trojuhelnik druhy;
    private AktivniPlatno platno;
    private int xPos;
    private int yPos;
    private int sirka;
    private int vyska;
    private Barva barva;
    
    public Hvezda(){
        prvni = new Trojuhelnik(0,25,70,70,Barva.ZELENA,Smer8.JIH);
        druhy = new Trojuhelnik(0,0,70,70,Barva.ZELENA,Smer8.SEVER);
        platno = AktivniPlatno.getPlatno();
        platno.setMrizka(false);
        platno.pridej(this);
    }
    
    public void nakresli(Kreslitko kreslitko){
        prvni.nakresli(kreslitko);
        druhy.nakresli(kreslitko);
    }
    
    public Barva getBarva(){
        return prvni.getBarva();
    }
    
    public void setBarva(Barva nova){
        barva = nova;
        prvni.setBarva(nova);
        druhy.setBarva(nova);
     
    }
    
    public String getNazev(){
        return null;
    }
    
    public Oblast getOblast(Oblast o){
        return null;
    }
    
    public void setOblast(Oblast o){
            
    }
    
    public Pozice getPozice(){ 
        return new Pozice( xPos, yPos );
    }
    
    public void setPozice(Pozice pozice){
        prvni.setPozice(pozice);
        druhy.setPozice(pozice);
    }
    
    public void setPozice(int x, int y){
       prvni.setPozice(x, y + 25);
       druhy.setPozice(x, y );
    }
    
    public Rozmer getRozmer(){
        return new Rozmer( sirka, vyska );
    }
    
    public void setRozmer(int rozmer){
        prvni.setRozmer(rozmer);
        druhy.setRozmer(rozmer);
    }
    
    public int getSirka(){
        return prvni.getSirka();
               
    }
       
    public int getVyska(){
        return prvni.getVyska();
    }
    
    public int getX(){
        return prvni.getX();
    }
    
    public int getY(){
        return prvni.getY();
    }
    
    public void posunDolu(int vzdalenost){
        prvni.posunDolu(vzdalenost);
        druhy.posunDolu(vzdalenost);
        
    }
    
    public void posunDolu(){
        prvni.posunDolu(platno.getKrok());
        druhy.posunDolu(platno.getKrok());
        
    }
    
    public void posunVlevo(){
        posunVpravo( -platno.getKrok());
        
    }
    
    public void posunVpravo(int vzdalenost){
        prvni.posunVpravo(vzdalenost);
        druhy.posunVpravo(vzdalenost);
    
    }
    
    public void posunVpravo(){
        posunVpravo( platno.getKrok());
    }
    
    public void posunVzhuru(){
        posunDolu( -platno.getKrok() );
    }
    
    public void setRozmer(int sirka, int vyska){
        prvni.setRozmer(sirka, vyska);
        druhy.setRozmer(sirka, vyska);
        
    }
}
