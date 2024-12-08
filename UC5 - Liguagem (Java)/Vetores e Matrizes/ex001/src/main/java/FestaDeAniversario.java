public abstract class FestaDeAniversario {
    private String tema;
    private String data;
    private int numeroDeConvidados;
    private double custo;
    private String local;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumeroDeConvidados() {
        return numeroDeConvidados;
    }

    public void setNumeroDeConvidados(int numeroDeConvidados) {
        this.numeroDeConvidados = numeroDeConvidados;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}

public class FestaAniversarioConcreta extends FestaDeAniversario {
    public static void main(String[] args) {
        FestaAniversarioConcreta festa = new FestaAniversarioConcreta();

        festa.setTema("Anos 80");
        festa.setData("25/12/2024");
        festa.setNumeroDeConvidados(50);
        festa.setCusto(1500.00);
        festa.setLocal("Salão de Festas XYZ");

        System.out.println("Tema: " + festa.getTema());
        System.out.println("Data: " + festa.getData());
        System.out.println("Número de Convidados: " + festa.getNumeroDeConvidados());
        System.out.println("Custo: " + festa.getCusto());
        System.out.println("Local: " + festa.getLocal());
    }
}

