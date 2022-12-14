import java.util.HashMap;

public class PizzaDoOlavo implements Pizza{
    HashMap<String, Integer> ingrendientes;

    PizzaDoOlavo(){}

    PizzaDoOlavo (HashMap<String, Integer> ingredientes){
        this.ingrendientes = ingredientes;
    }

    public int preco () {
        int valor = 0;
        for(Integer i : ingrendientes.values())
            valor += i;
        return valor;
    }
}
