package negocio;

public class Veiculo {

    private String nome;
    private String marca;

    public Veiculo(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public Veiculo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   

}
