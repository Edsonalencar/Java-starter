package br.com.diodesafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
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

    public void  starterBootCamp (BootCamp bootcamp) {
        this.startingConteudos.addAll(bootcamp.getConteudos());
        bootcamp.getMembers().add(this);
    }
   public void  nexting () {
       Optional<Conteudo> conteudos = this.startingConteudos.stream().findFirst();
        if (conteudos.isPresent()) {
            this.endingConteudos.add(conteudos.get());
            this.startingConteudos.remove(conteudos.get());
        } else
            System.out.println("Você não esta matriculado em nenhum conteúdo");
    }
   public double  xpTotalCalc () {
        return  this.endingConteudos.stream().mapToDouble(conteudo -> conteudo.xpCalc()).sum();
   }

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
