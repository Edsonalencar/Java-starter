package br.com.diodesafio.dominio;

import java.time.LocalDate;

public class Curso extends  Conteudo {
    private Integer workload;
    public Curso() {
    }

    public Curso(String title, String description) {
        setTitle(title);
        setDescription(description);
    }

    public Curso(String title, String description, LocalDate dateMentory) {
        setTitle(title);
        setDescription(description);
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }

    @Override
    public double xpCalc() {
        return QUANT_XP + 15d;
    }
}
