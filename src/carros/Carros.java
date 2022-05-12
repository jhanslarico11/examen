package Carros;
import entidades.carro;
import implementacion.Implcarro;

public class Carros {
    public static void main(String[] args) {
        carro c=new carro();
        c.setProd_id("1");
        c.setProd_nombre("BMW");
        c.setProd_precio("200000");
        c.setProd_marca("Rolls-Royce");
        
        carro c2=new carro();
        c2.setProd_id("2");
        c2.setProd_nombre("Mercedes-Benz");
        c2.setProd_precio("100000");
        c2.setProd_marca("Maybach");
        
        Implcarro ic=new Implcarro();
        ic.agregarCarro(c);
        ic.agregarCarro(c2);
        ic.reporteCarro();
        
        
            }
}