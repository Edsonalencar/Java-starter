package br.com.diodesafio.dominio;

public class Mentoria extends  Conteudo {
    private Integer workload;

    public Mentoria() {}

    public Mentoria(String title, String description) {
        setTitle(title);
        setDescription(description);
    }

    public Mentoria(String title, String description, Integer workload) {
        setTitle(title);
        setDescription(description);
        this.workload = workload;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Override
    public double xpCalc() {
        return QUANT_XP + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}
