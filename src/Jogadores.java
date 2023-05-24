public class Jogadores implements Comparable<Jogadores>{
    private String nome;
    private int dado;

    public Jogadores(String nome, int dado) {
        this.nome = nome;
        this.dado = dado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }


    @Override
    public String toString() {
        return nome + " seu dado é: " + dado;
    }

    @Override
    public int compareTo(Jogadores outroJogador) {
        if (this.dado < outroJogador.getDado()){
            return -1;
        }else if (this.dado > outroJogador.getDado()){
            return 1;
        }
        return 0;
    }
}
