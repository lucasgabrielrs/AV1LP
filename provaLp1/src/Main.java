import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<jogador> jogadoresParedao = new ArrayList<jogador>();

        String nome = "";
        int votos = 0;

        jogador alaneDias = new jogador("alane dias", 0);
        jogadoresParedao.add(alaneDias);
        jogador beatrizReis = new jogador("beatriz reis", 0);
        jogadoresParedao.add(beatrizReis);
        jogador daviBrito = new jogador("DAVI BRITO", 0);
        jogadoresParedao.add(daviBrito);
        jogador denizianeFerreira = new jogador("Deniziane Ferreira", 0);
        jogadoresParedao.add(denizianeFerreira);
        jogador fernandaBande = new jogador("Fernanda Bande", 0);
        jogadoresParedao.add(fernandaBande);


        Scanner scn = new Scanner(System.in);
        String opcaoVoto = "";
        String votoMaiusculo = "";


        do{
            System.out.println("-----------Voto para eliminação-----------");
            System.out.println("Em quem você vota para eliminação: ");

            opcaoVoto = scn.nextLine();
            votoMaiusculo = opcaoVoto.toUpperCase();
            System.out.println(votoMaiusculo);


            for (int i = 0; i < jogadoresParedao.size(); i++) {
                String linhaJogador = jogadoresParedao.get(i).toString();
                if (linhaJogador.contains(votoMaiusculo))
                    //faltou incrementar 1 ao voto do jogador escolhido
                    System.out.println("Seu voto foi para: "+linhaJogador); //não consegui mostrar apenas o indice nome da linha jogador
            }


        }while(!votoMaiusculo.equals("SAIR"));

        apuracao();
    }

    private static void apuracao() {
        //Fazer mais um foreach para percorrer o array já com os votos contados
        //Encontrar o mais votado
        //Printar o mais votado
    }
}


//Criar um arraylist<jogador>
//Cadastrar cada jogador nesse arraylist

//Pedir em um while que se finaliza quando digita sair qual será o voto
//Transformar o que ele digitar para upercase
//Percorrer o array verificando com contains se acho esse jogador
//Caso encontre eu pego o atributo voto desse jogador e incremento 1

//Percorro o array verificando os votos e vejo qm teve mais votos