public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private boolean temMontariaVoadora;
    private boolean companheiroGabi;
    private boolean companheiroGigi;
    private boolean companheiroHarry;
    private boolean companheiroJoao;

    private Personagem(Builder builder) {
        this.nome = builder.nome;
        this.classe = builder.classe;
        this.nivel = builder.nivel;
        this.temMontariaVoadora = builder.temMontariaVoadora;
        this.companheiroGabi = builder.companheiroGabi;
        this.companheiroGigi = builder.companheiroGigi;
        this.companheiroHarry = builder.companheiroHarry;
        this.companheiroJoao = builder.companheiroJoao;
    }

    public static class Builder {
        private String nome;
        private String classe;
        private int nivel;
        private boolean temMontariaVoadora;
        private boolean companheiroGabi;
        private boolean companheiroGigi;
        private boolean companheiroHarry;
        private boolean companheiroJoao;

        public Builder(String nome, String classe, int nivel) {
            this.nome = nome;
            this.classe = classe;
            this.nivel = nivel;
        }

        public Builder comMontaria() {
            this.temMontariaVoadora = true;
            return this;
        }

        public Builder comGabi() {
            this.companheiroGabi = true;
            return this;
        }

        public Builder comGigi() {
            this.companheiroGigi = true;
            return this;
        }

        public Builder comHarry() {
            this.companheiroHarry = true;
            return this;
        }

        public Builder comJoao() {
            this.companheiroJoao = true;
            return this;
        }

        public Personagem build() {
            return new Personagem(this);
        }
    }
}
