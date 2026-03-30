public class Main {
    public static void main(String[] args) {

        MotorDeCombate motor = new MotorDeCombate();

        motor.adicionarObservador(new TelaGameOver());
        motor.adicionarObservador(new LogServidor());
        motor.adicionarObservador(new SistemaConquistas());

        Personagem personagem = null; // mock só pra exemplo
        motor.processarMorte(personagem);
    }
}
