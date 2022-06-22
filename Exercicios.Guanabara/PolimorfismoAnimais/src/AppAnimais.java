public class AppAnimais {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Aves aves = new Aves();
//
//                mamifero.setPeso(83.5);
//                mamifero.setIdade(2);
//                mamifero.setMembros(4);
//
//                mamifero.locomover();
//                mamifero.emitorSom();
//                mamifero.alimentar();
//
//                peixe.setPeso(0.35);
//                peixe.setIdade(1);
//                peixe.setMembros(0);
//
//                peixe.locomover();
//                peixe.alimentar();
//                peixe.emitorSom();
//                peixe.soltarBolha();
//
//                aves.setPeso(0.89);
//                aves.setIdade(2);
//                aves.setMembros(2);
//                aves.locomover();
//                aves.alimentar();
//                aves.emitorSom();
//                aves.fazerNinho();

                Cachoro cachoro = new Cachoro();
                Canguru canguru = new Canguru();

/*                canguru.setIdade(3);
                canguru.setMembros(4);
                canguru.setPeso(3.94);
                canguru.alimentar();
                canguru.locomover();
                canguru.emitorSom();

                cachoro.setPeso(3.94);
                cachoro.setMembros(4);
                cachoro.setIdade(1);
                cachoro.alimentar();
                cachoro.locomover();
                cachoro.emitorSom();*/
                cachoro.abanarRabo(4);
                cachoro.abanarRabo("Olá");
                cachoro.abanarRabo(false);

//                cachoro.emitorSom();


    }
}
