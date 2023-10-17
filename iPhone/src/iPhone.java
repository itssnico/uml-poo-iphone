
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}

// Classe que representa o iPhone
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        // Implementação para tocar música
    }

    @Override
    public void pausar() {
        // Implementação para pausar música
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação para selecionar uma música
    }

    @Override
    public void ligar(String numero) {
        // Implementação para fazer uma ligação
    }

    @Override
    public void atender() {
        // Implementação para atender uma chamada
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação para iniciar o correio de voz
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação para exibir uma página da internet
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Implementação para adicionar uma nova aba de navegação
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página da internet
    }

    // Outros métodos e atributos específicos do iPhone podem ser adicionados aqui.
}
