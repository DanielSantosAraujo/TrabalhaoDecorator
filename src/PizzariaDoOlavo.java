import java.util.HashMap;

public class PizzariaDoOlavo {
    
    public static void main(String[] args) {

        HashMap<String, Integer> ingredientes = new HashMap<>();
        ingredientes.put("Massa", 10);
        ingredientes.put("Muzzarela", 20);
        ingredientes.put("Tomate", 5);
        ingredientes.put("Manjericão", 5);

        Pizza margerita = new PizzaDoOlavo(ingredientes);

        Pizza minhaSuperMargerita = new ExtraGrande (new BordaRecheada (new MassaIntegral(margerita)));
        
        System.out.println("Minha pizza custará R$" + minhaSuperMargerita.preco());
    }
}
