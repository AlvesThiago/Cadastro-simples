package persistencia;

import java.util.ArrayList;
import negocio.Veiculo;

public class ControlaVeiculo {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    
    public boolean salvar(Veiculo v){
        if(v != null){
            veiculos.add(v);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Veiculo> retornarTodos (){
        return veiculos;
    }

}
