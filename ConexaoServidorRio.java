public class ConexaoServidorRio {

    private static ConexaoServidorRio instancia;

    // Construtor privado impede novas instâncias
    private ConexaoServidorRio() {
        System.out.println("[REDE] Conexão única estabelecida com o servidor do Rio de Janeiro...");
    }

    public static ConexaoServidorRio getInstancia() {
        if (instancia == null) {
            instancia = new ConexaoServidorRio();
        }
        return instancia;
    }

    public void sincronizarDados() {
        System.out.println("Dados sincronizados com o banco de dados do servidor.");
    }
}
