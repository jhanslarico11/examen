package mesesdelaño;
import java.util.ArrayList;

public class Mesesdelaño {
    
    ArrayList<String> listMeses = new ArrayList<>();

    public void listMeses(){
        listMeses.add("Enero");
        listMeses.add("Febrero");
        listMeses.add("Marzo");
        listMeses.add("Abril");
        listMeses.add("Mayo");
        listMeses.add("Junio");
        listMeses.add("Julio");
        listMeses.add("Agosto");
        listMeses.add("Septiembre");
        listMeses.add("Octubre");
        listMeses.add("Noviembre");
        listMeses.add("Diciembre");
        
        listMeses.forEach((d) -> {
            System.out.println(""+d);
        });
    }
    
    public static void main(String[] args) {
        Mesesdelaño lm = new Mesesdelaño();
        lm.listMeses();
    }
}