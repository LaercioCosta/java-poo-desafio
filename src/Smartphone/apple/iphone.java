package Smartphone.apple;

import Navegador__package.navegador_de_Internet;
import aparelhoTelefonico__package.aparelho__Telefonico;
import repodutor_Musicial__Package.reprodutor__Musical;

public  class iphone implements aparelho__Telefonico, navegador_de_Internet, reprodutor__Musical {

    public void ligar() {
        System.out.println("Ligando pelo Iphone");
    }
    public void atender() {
        System.out.println("Atendendo pelo Iphone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio pelo Iphone");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina pelo Iphone");
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba pelo Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo Iphone");
    }

    public void tocar() {
        System.out.println("Tocando musica pelo Iphone");
    }

    public void pausar() {
        System.out.println("Pausando musica pelo Iphone");
    }

    public void selecionarMusica() {
        System.out.println("Escolhendo musica pelo Iphone");
    }
}
