package br.com.diodesafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
   private Set<Conteudo> startingConteudos = new LinkedHashSet<>();
   private Set<Conteudo> endingConteudos = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getStartingConteudos() {
        return startingConteudos;
    }

    public void setStartingConteudos(Set<Conteudo> startingConteudos) {
        this.startingConteudos = startingConteudos;
    }

    public Set<Conteudo> getEndingConteudos() {
        return endingConteudos;
    }

    public void setEndingConteudos(Set<Conteudo> endingConteudos) {
        this.endingConteudos = endingConteudos;
    }

    public void  starterBootCamp (BootCamp bootcamp) {}
   public void  nexting () {}
   public void  xpTotalCalc () {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(startingConteudos, dev.startingConteudos) && Objects.equals(endingConteudos, dev.endingConteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startingConteudos, endingConteudos);
    }
}
