package br.com.diodesafio.dominio;

public abstract class Conteudo {
    protected static final double QUANT_XP = 10d;

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  abstract  double xpCalc();
}
