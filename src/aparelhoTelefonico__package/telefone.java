package aparelhoTelefonico__package;
public class telefone implements aparelho__Telefonico {
    public void ligar(){
        System.out.println("Fazendo Ligação");
    }

    public void atender (){
        System.out.println("Atendendo a Ligação");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Ouvindo correio de voz");
    }
}
