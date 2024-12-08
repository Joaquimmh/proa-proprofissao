// Definindo a classe TelefoneCelular
public class TelefoneCelular {

    // Atributos
    private String modelo;
    private String cor;
    private double preco;
    private int capacidadeBateria;
    private boolean tem5G;

    // Métodos Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public boolean isTem5G() {
        return tem5G;
    }

    public void setTem5G(boolean tem5G) {
        this.tem5G = tem5G;
    }

    // Método Principal
    public static void main(String[] args) {

        // Instanciando um objeto TelefoneCelular
        TelefoneCelular celular = new TelefoneCelular();

        // Atribuindo valores aos atributos utilizando os setters
        celular.setModelo("Samsung Galaxy S21");
        celular.setCor("Preto");
        celular.setPreco(5000.00);
        celular.setCapacidadeBateria(4000);
        celular.setTem5G(true);

        // Exibindo os valores dos atributos utilizando os getters
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Preço: R$" + celular.getPreco());
        System.out.println("Capacidade da Bateria: " + celular.getCapacidadeBateria() + "mAh");
        System.out.println("Tem 5G: " + celular.isTem5G());
    }
}
