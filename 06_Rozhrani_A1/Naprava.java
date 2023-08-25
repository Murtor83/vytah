

public class Naprava implements IKresleny,IPosuvny{
    
    private Obdelnik obdelnik1;
    private Obdelnik obdelnik2;
    private Obdelnik obdelnik3;
    private AktivniPlatno platno;
    private Barva barva;
    
    
    public Naprava(){
        this(0,0,80,40,Barva.CERVENA);
    }
    
    public Naprava(int x, int y, int sirka, int vyska, Barva barva) {
        obdelnik1 = new Obdelnik(x, y, sirka / 4, vyska, barva);
        obdelnik2 = new Obdelnik(x + obdelnik1.getSirka(),y + 3 * vyska / 8, sirka / 2,vyska / 4, barva);
        obdelnik3 = new Obdelnik(x + obdelnik1.getSirka() + obdelnik2.getSirka(), y, sirka / 4, vyska, barva);

        platno = AktivniPlatno.getPlatno();
        platno.setMrizka(false);
        platno.pridej(this);
    }
    
    public void nakresli(Kreslitko kreslitko){
        obdelnik1.nakresli(kreslitko);
        obdelnik2.nakresli(kreslitko);
        obdelnik3.nakresli(kreslitko);
    }
    
    public Barva getBarva(){
        return obdelnik1.getBarva();
    }
    
    public void setBarva(Barva nova){
        barva = nova;
        obdelnik1.setBarva(nova);
        obdelnik2.setBarva(nova);
        obdelnik3.setBarva(nova);
     
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
        return obdelnik1.getPozice();
    }
    
    public void setPozice(Pozice pozice){
        obdelnik1.setPozice(pozice);
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
