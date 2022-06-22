public class Arrey {

    public static void main(String[] args) {


        BrincandoComArrey minhaConta = new BrincandoComArrey("Jhonatas", 120774, "05486028911", 37443);
        BrincandoComArrey minhaConta2 = new BrincandoComArrey("Jhonatas", 120774, "05486028911", 37443);
        BrincandoComArrey minhaConta3 = new BrincandoComArrey("Jhonatas", 120774, "05486028911", 37443);
        BrincandoComArrey minhaConta4 = new BrincandoComArrey("Jhonatas", 120774, "05486028911", 37443);
        BrincandoComArrey minhaConta5 = new BrincandoComArrey("Jhonatas", 120774, "05486028911", 37443);
        BrincandoComArrey minhaConta6 = new BrincandoComArrey("Jhonatas", 120774, "05486028911", 37443);
        BrincandoComArrey minhaConta7 = new BrincandoComArrey("Jhonatas", 120774, "05486028911", 37443);

        BrincandoComArrey [] [] arreyDeContas = new BrincandoComArrey[7][2];

        arreyDeContas [0] [0] = minhaConta;
        arreyDeContas [0] [1] = minhaConta;
        arreyDeContas [1] [0] = minhaConta2;
        arreyDeContas [1] [1] = minhaConta2;
        arreyDeContas [2] [0] = minhaConta3;
        arreyDeContas [2] [1] = minhaConta3;
        arreyDeContas [3] [0] = minhaConta4;
        arreyDeContas [3] [1] = minhaConta4;
        arreyDeContas [4] [0] = minhaConta5;
        arreyDeContas [4] [1] = minhaConta5;
        arreyDeContas [5] [0] = minhaConta6;
        arreyDeContas [5] [1] = minhaConta6;
        arreyDeContas [6] [0] = minhaConta7;
        arreyDeContas [6] [1] = minhaConta7;

        System.out.println(arreyDeContas[0][0].nome);

        for (BrincandoComArrey[] x: arreyDeContas)

            for (BrincandoComArrey y : x)

                System.out.println(y.nome);
            }
        }
