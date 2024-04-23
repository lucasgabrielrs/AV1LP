public class jogador {
    String nome;
    int votos = 0;


    public jogador(String nome, int votos) {
        this.nome = nome;
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "jogador{" +
                "nome='" + nome + '\'' +
                ", votos=" + votos +
                '}';
    }
}
