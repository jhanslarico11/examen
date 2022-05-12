package implementacion;
import conexion.ConectaDBSqlite;
import entidades.carro;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Implcarro {
    ConectaDBSqlite cc=new ConectaDBSqlite();
    carro cli=new carro();
    
    ArrayList<carro>listacarro = new ArrayList<>();
    
    public void agregarCarro(carro cel){
        try {
            String query="insert into carros values('"+cel.getProd_id()+"','"+cel.getProd_nombre()+"','"+cel.getProd_precio()+"','"+cel.getProd_marca()+"')";
            Statement st = cc.getConnect().createStatement();
            st.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void reporteCarro(){
        try {
            String query="select * from carros";
            Statement st = cc.getConnect().createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                carro celu = new carro();
                celu.setProd_id(rs.getString(1));
                celu.setProd_nombre(rs.getString(2));
                celu.setProd_precio(rs.getString(3));
                celu.setProd_marca(rs.getString(4));
                listacarro.add(celu);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}