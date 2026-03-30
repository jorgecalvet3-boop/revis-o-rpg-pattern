public class GuildaAdapter implements GuildaService {

    private SistemaGuildaAPI api;
    private String servidor;

    public GuildaAdapter(String servidor) {
        this.api = new SistemaGuildaAPI();
        this.servidor = servidor;
    }

    public void adicionarMembro(String nome) {
        api.addPlayerToGuildLegacy(servidor, nome);
    }
}

GuildaService guilda = new GuildaAdapter("Servidor-Rio");
guilda.adicionarMembro("Ryu");
