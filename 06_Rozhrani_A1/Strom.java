



public class Strom implements IKresleny, IPosuvny{
    private Elipsa koruna;
    private Obdelnik kmen;
    private AktivniPlatno ap;
    
    
    public Strom() {
        koruna = new Elipsa(0,0,100,100,Barva.KHAKI);
        kmen = new Obdelnik(35,100,30,75,Barva.HNEDA);
        ap = AktivniPlatno.getPlatno();
        ap.setMrizka(false);
        ap.pridej(this);
    }
    
    public void posunDoPrava() {
        koruna.posunVpravo();
        kmen.posunVpravo();
    }
    
    public void setPozice(int x, int y){
        koruna.setPozice(x, y);
        kmen.setPozice(x + 35, y + 100);
    }
    
    
    public void nakresli(Kreslitko kreslitko) {
        koruna.nakresli(kreslitko);
        kmen.nakresli(kreslitko);
    }
    
    public int getX() {
        return koruna.getX();
    }
    
    public int getY() {
        return koruna.getY();
    }
    
}
