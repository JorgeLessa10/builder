/*
 ** created by: jorge.lessa
 */

public class Jogo {
    private String nome;
    private String categoria;
    private String horasDeJogo;
    private int quantidadePersonagens;
    private String midia;
    private String tamanho;
    private String dataLancamento;
    private String dataAtualizacao;
    private String plataforma;


    public Jogo() {
    }

    public String getNome() {
        return nome;
    }

    public Jogo setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCategoria() {
        return categoria;
    }

    public Jogo setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public String getHorasDeJogo() {
        return horasDeJogo;
    }

    public Jogo setHorasDeJogo(String horasDeJogo) {
        this.horasDeJogo = horasDeJogo;
        return this;
    }

    public int getQuantidadePersonagens() {
        return quantidadePersonagens;
    }

    public Jogo setQuantidadePersonagens(int quantidadePersonagens) {
        this.quantidadePersonagens = quantidadePersonagens;
        return this;
    }

    public String getMidia() {
        return midia;
    }

    public Jogo setMidia(String midia) {
        this.midia = midia;
        return this;
    }

    public String getTamanho() {
        return tamanho;
    }

    public Jogo setTamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public Jogo setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
        return this;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public Jogo setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
        return this;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public Jogo setPlataforma(String plataforma) {
        this.plataforma = plataforma;
        return this;
    }
}
