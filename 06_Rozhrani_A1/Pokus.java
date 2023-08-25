

public class Pokus{
    
    public Pokus(){
        Barva.getNazvy().keySet().forEach(System.out::println);
        System.out.println("=========");
        Barva.getNazvy().values().forEach(System.out::println);
    }
}
