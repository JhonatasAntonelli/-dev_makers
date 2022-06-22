import Pessoas.AdicionarPrimeiroLogin;
import Telas.Login;

public class mian{
    public static void main(String[] args) {

        AdicionarPrimeiroLogin.AdicionarPimeiraDirecao();
        Login.fazerLogin();

    }
}
/*
Quando o main se inicia, já são adicionados 3 usuários (Professo, Aluno e Direção),
para adicionar um novo usuário é necessário entra como direção, utilizando RG = 123456 e senha = Admin.
Para entrar como professor, RG = 02468 e senha = professo. Para entrar como aluno RG = 13579 e senha = aluno.

Eu criei 3 tipos de usuários:

*Alunos, podem acessar as notas por disciplina, imprimir o boletim, enviar o boletim para o e-mail cadastrado,
enviar o e-mail ou mensagem por celular para o professor da matéria que deseja.
Também pode alterar alguns atributos do próprio cadastro (nome, telefone, e-mail).

* Professor, pode adicionar nota dos aluno apenas para a sua matéria e ver nota dos alunos apenas de sua matéria.
Também pode alterar alguns atributos do próprio cadastro (nome, RG, telefone, e-mail).

*Direção, tem acesso a todos os atributos dos usuários
(nome, RG, E-mail, tipo de pessoa, responsável pelo aluno, salário dos professores e do próprio salário)
pode imprimir o boletim ou enviar por e-mail, pode modificar e adicionar usuários, inclusive da própria direção.
 */