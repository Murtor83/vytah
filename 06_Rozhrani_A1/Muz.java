

public class Muz implements IKresleny{
    private Elipsa hlavaMuz;
    private Obdelnik muz;
    private Obdelnik muzLevaNoha;
    private Obdelnik muzPravaNoha;
    private AktivniPlatno platno;
    private int xPos;
    private int yPos;
    private int vyska;
    private int sirka;
    private Barva barva;
    
    public Muz(){
        hlavaMuz = new Elipsa(4,0,25,25,Barva.KHAKI);
        muz = new Obdelnik(0,25,35,40,Barva.KHAKI);
        muzPravaNoha = new Obdelnik(3,65,10,20,Barva.KHAKI);
        muzLevaNoha = new Obdelnik(20,65,10,20,Barva.KHAKI);
        
        platno = AktivniPlatno.getPlatno();
        platno.setMrizka(false);
        platno.pridej(this);
    }
    
    public void nakresli(Kreslitko kreslitko){
        hlavaMuz.nakresli(kreslitko);
        muz.nakresli(kreslitko);
        muzPravaNoha.nakresli(kreslitko);
        muzLevaNoha.nakresli(kreslitko);
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
