package br.com.diodesafio.dominio;

import java.time.LocalDate;

public class Curso extends  Conteudo {
    private LocalDate dateMentory;

    public Curso() {
    }

    public Curso(String title, String description) {
        setTitle(title);
        setDescription(description);
    }

    public Curso(String title, String description, LocalDate dateMentory) {
        setTitle(title);
        setDescription(description);
        this.dateMentory = dateMentory;
    }

    public LocalDate getDateMentory() {
        return dateMentory;
    }
    public void setDateMentory(LocalDate dateMentory) {
        this.dateMentory = dateMentory;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", dateMentory=" + dateMentory +
                '}';
    }

    @Override
    public double xpCalc() {
        return QUANT_XP + 15d;
    }
}
