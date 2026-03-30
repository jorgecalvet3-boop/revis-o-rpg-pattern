import java.util.ArrayList;
import java.util.List;

public class MotorDeCombate {

    private List<ObservadorMorte> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorMorte obs) {
        observadores.add(obs);
    }

    public double calcularDanoBase(String classe, double poderDeAtaque) {
        EstrategiaDano estrategia = FabricaEstrategiaDano.obter(classe);
        return estrategia.calcular(poderDeAtaque);
    }

    public void processarMorte(Personagem personagem) {
        System.out.println("O personagem morreu em combate!");

        for (ObservadorMorte obs : observadores) {
            obs.aoMorrer(personagem);
        }
    }

    public class TelaGameOver implements ObservadorMorte {
        public void aoMorrer(Personagem p) {
            System.out.println("Game Over exibido.");
        }
    }

    public class LogServidor implements ObservadorMorte {
        public void aoMorrer(Personagem p) {
            System.out.println("Morte registrada no banco de dados.");
        }
    }

    public class SistemaConquistas implements ObservadorMorte {
        public void aoMorrer(Personagem p) {
            System.out.println("Penalidade aplicada.");
        }
    }
}
