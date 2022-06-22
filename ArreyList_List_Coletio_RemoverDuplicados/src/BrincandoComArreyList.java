public class BrincandoComArreyList {

        String nome;
        int conta;
        String CPF;
        int agencia;

        public BrincandoComArreyList(String nome, int conta, String CPF, int agencia) {
            this.nome = nome;
            this.conta = conta;
            this.CPF = CPF;
            this.agencia = agencia;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getConta() {
            return conta;
        }

        public void setConta(int conta) {
            this.conta = conta;
        }

        public String getCPF() {
            return CPF;
        }

        public void setCPF(String CPF) {
            this.CPF = CPF;
        }

        public int getAgencia() {
            return agencia;
        }

        public void setAgencia(int agencia) {
            this.agencia = agencia;
        }
    }


