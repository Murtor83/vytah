

public class Holka implements IKresleny{
    private Elipsa hlavaZena;
    private Trojuhelnik zena;
    private Obdelnik zenaLevaNoha;
    private Obdelnik zenaPravaNoha;
    private AktivniPlatno platno;
    private int xPos;
    private int yPos;
    private int sirka;
    private int vyska;
    private Barva barva;
    
    public Holka(){
        hlavaZena = new Elipsa(10,0,30,30,Barva.RUZOVA);
        zena = new Trojuhelnik(0,20,50,50,Barva.RUZOVA);
        zenaPravaNoha = new Obdelnik(10,70,10,15,Barva.RUZOVA);
        zenaLevaNoha = new Obdelnik(30,70,10,15,Barva.RUZOVA); 
        platno = AktivniPlatno.getPlatno();
        platno.setMrizka(false);
        platno.pridej(this);
    }
    
    public void nakresli(Kreslitko kreslitko){
        hlavaZena.nakresli(kreslitko);
        zena.nakresli(kreslitko);
        zenaPravaNoha.nakresli(kreslitko);
        zenaLevaNoha.nakresli(kreslitko);
    }
    
    public Barva getBarva(){
        return barva;
    }
    
    public void setBarva(Barva nova){
        barva = nova;
        platno.prekresli();
    }
    
    public String getNazev(){
        return null;
    }
    
    public Oblast getOblast(Oblast o){
        return new Oblast( xPos, yPos, sirka, vyska );
    }
    
    public void setOblast(Oblast o){
        platno.nekresli();
            setPozice(o.x, o.y);
            setPozice(o.sirka, o.vyska);
        platno.prekresli();    
    }
    
    public Pozice getPozice(){ 
        return new Pozice( xPos, yPos );
    }
    
    public void setPozice(Pozice pozice){
        setPozice( pozice.x, pozice.y );
    }
    
    public void setPozice(int x, int y){
       xPos = x;
        yPos = y;
        platno.prekresli(); 
    }
    
    public Rozmer getRozmer(){
        return new Rozmer( sirka, vyska );
    }
    
    public void setRozmer(int rozmer){
        setRozmer(rozmer,rozmer);
        platno.prekresli();
    }
    
    public int getSirka(){
        return sirka;
    }
       
    public int getVyska(){
        return vyska;
    }
    
    public int getX(){
        return xPos;
    }
    
    public int getY(){
        return yPos;
    }
    
    public void posunDolu(int vzdalenost){
        setPozice (xPos, yPos + vzdalenost);
    }
    
    public void posunDolu(){
        posunDolu( platno.getKrok());
    }
    
    public void posunVlevo(){
        posunVpravo(platno.getKrok());
    }
    
    public void posunVpravo(int vzdalenost){
        posunVpravo(platno.getKrok());
    }
    
    public void posunVpravo(){
        posunVpravo( -platno.getKrok());
    }
    
    public void posunVzhuru(){
        posunDolu( -platno.getKrok() );
    }
    
    public void setRozmer(int sirka, int vyska){
        this.sirka = sirka;
        this.vyska = vyska;
        platno.prekresli();
    }
    
}
