/*
 ** created by: jorge.lessa
 */

public class JogoBuilder {

    private Jogo jogo;

    public JogoBuilder() {
        jogo = new Jogo();
    }

    public Jogo build()
    {
        if (jogo.getNome() == null || jogo.getNome().isEmpty())
        {
            throw new IllegalArgumentException("Nome invalido");
        }
        //Criado para mostrar o entendimento da funcionalidade.
        if(jogo.getPlataforma() != null && (!jogo.getPlataforma().equals("Ps4") || !jogo.getPlataforma().equals("Pc")))
        {
            throw new IllegalArgumentException("Atualmente so é possivel criar jogos para Ps4 e Pc");
        }
        return jogo;
    }

    public JogoBuilder setNome(String nome) {
        jogo.setNome(nome);
        return this;
    }

    public JogoBuilder setCategoria(String categoria) {
        jogo.setCategoria(categoria);
        return this;
    }

    public JogoBuilder setHorasDeJogo(String horasDeJogo) {
        jogo.setHorasDeJogo(horasDeJogo);
        return this;
    }

    public JogoBuilder setQuantidadePersonagens(int quantidadePersonagens) {
        jogo.setQuantidadePersonagens(quantidadePersonagens);
        return this;
    }

    public JogoBuilder setMidia(String midia) {
        jogo.setMidia(midia);
        return this;
    }

    public JogoBuilder setTamanho(String tamanho) {
        jogo.setTamanho(tamanho);
        return this;
    }

    public JogoBuilder setDataLancamento(String dataLancamento) {
        jogo.setDataLancamento(dataLancamento);
        return this;
    }

    public JogoBuilder setDataAtualizacao(String dataAtualizacao) {
        jogo.setDataAtualizacao(dataAtualizacao);
        return this;
    }

    public JogoBuilder setPlataforma(String plataforma) {
        jogo.setPlataforma(plataforma);
        return this;
    }
}
