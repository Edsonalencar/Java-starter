package br.com.diodesafio.dominio;

import java.time.LocalDate;

public class Mentoria extends  Conteudo {
    private Integer workload;
    private LocalDate dateMentory;
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

    public LocalDate getDateMentory() {
        return dateMentory;
    }

    public void setDateMentory(LocalDate dateMentory) {
        this.dateMentory = dateMentory;
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
