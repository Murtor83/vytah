import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Cviceni implements IKresleny {
    private Obdelnik obdelnik1;
    private Obdelnik obdelnik2;
    private Obdelnik obdelnik3;
    private Obdelnik cinka;
    private Elipsa kruh1;
    private Elipsa kruh2;
    private Trojuhelnik prvni;
    private Trojuhelnik druhy;
    private Elipsa hlavaZena;
    private Trojuhelnik zena;
    private Obdelnik zenaLevaNoha;
    private Obdelnik zenaPravaNoha;
    private Elipsa hlavaMuz;
    private Obdelnik muz;
    private Obdelnik muzLevaNoha;
    private Obdelnik muzPravaNoha; 
    private AktivniPlatno platno;
    private List<IKresleny> seznamObdelniku = new ArrayList<>();
    
    
    public Cviceni(int x) {
        obdelnik1 = new Obdelnik(10,10,20,40,Barva.CERVENA);
        obdelnik2 = new Obdelnik(30,25,40,10,Barva.CERVENA);
        obdelnik3 = new Obdelnik(70,10,20,40,Barva.CERVENA);
        
        kruh1 = new Elipsa(10,65,30,30,Barva.CERNA);
        cinka = new Obdelnik(40,75,25,10,Barva.CERNA);
        kruh2 = new Elipsa(60,65,30,30,Barva.CERNA);
        
        prvni = new Trojuhelnik(100,35,70,70,Barva.ZELENA,Smer8.JIH);
        druhy = new Trojuhelnik(100,10,70,70,Barva.ZELENA,Smer8.SEVER);
        
        hlavaZena = new Elipsa(185,10,30,30,Barva.RUZOVA);
        zena = new Trojuhelnik(175,30,50,50,Barva.RUZOVA);
        zenaPravaNoha = new Obdelnik(185,80,10,15,Barva.RUZOVA);
        zenaLevaNoha = new Obdelnik(205,80,10,15,Barva.RUZOVA);
        
        hlavaMuz = new Elipsa(250,10,25,25,Barva.KHAKI);
        muz = new Obdelnik(245,35,35,40,Barva.KHAKI);
        muzPravaNoha = new Obdelnik(250,75,10,20,Barva.KHAKI);
        muzLevaNoha = new Obdelnik(265,75,10,20,Barva.KHAKI);
        
        platno = AktivniPlatno.getPlatno();
        platno.setMrizka(false);
        platno.pridej(this);
        
    }
    
    public Cviceni(){
    
    }
    
    public void toMihoVyndej(IKresleny obdelnik){
        seznamObdelniku.add(obdelnik);
    }
    
    public void vypis(){
        List<String> vsechnyNadavky = new ArrayList<>();
        vsechnyNadavky.add("Vole");
        vsechnyNadavky.add("Kokote");
        vsechnyNadavky.add("Demente");
        vsechnyNadavky.add("Šmejde");
        vsechnyNadavky.add("Zmrdeèku");
        
        vsechnyNadavky.forEach(nadavky ->nadavej(nadavky));
        
//             seznamObdelniku.forEach(System.out::println);
//             seznamObdelniku.forEach(this::sukej);
//             seznamObdelniku.forEach(martin ->sukej(martin));
        
//         for(int i=0;i<seznamObdelniku.size();i++){
//             sukej(seznamObdelniku.get(i));
//         }
//         
//         for(IKresleny objekt:seznamObdelniku){
//             sukej(objekt);
//         }
        
    }
    
    public void nadavej(String kresleni){
        JOptionPane.showMessageDialog(null,kresleni);
    }
    
    public void nakresli(){
        
        platno = AktivniPlatno.getPlatno();
        seznamObdelniku.forEach(objekt ->{
            platno.pridej(objekt);
        });
        
    }
    
    public void nakresli(Kreslitko kreslitko) {
        obdelnik1.nakresli(kreslitko);
        obdelnik2.nakresli(kreslitko);
        obdelnik3.nakresli(kreslitko);
        
        kruh1.nakresli(kreslitko);
        kruh2.nakresli(kreslitko);
        cinka.nakresli(kreslitko);
        
        prvni.nakresli(kreslitko);
        druhy.nakresli(kreslitko);
        
        hlavaZena.nakresli(kreslitko);
        zena.nakresli(kreslitko);
        zenaPravaNoha.nakresli(kreslitko);
        zenaLevaNoha.nakresli(kreslitko);
        
        hlavaMuz.nakresli(kreslitko);
        muz.nakresli(kreslitko);
        muzPravaNoha.nakresli(kreslitko);
        muzLevaNoha.nakresli(kreslitko);
    }
}
