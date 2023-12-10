package ExemplosObserverPattern;

import InterfacesObserverPattern.Canal;

import java.util.ArrayList;
import java.util.List;

public class AgenciaNoticias {
    private String noticias;
    private List<Canal> canais = new ArrayList<>();

    public void addObserver(Canal canal) {
        this.canais.add(canal);
    }

    public void removeObserver(Canal canal) {
        this.canais.remove(canal);
    }

    public void setNoticias(String noticias) {
        this.noticias = noticias;
        for(Canal canal : this.canais) {
            canal.update(this.noticias);
            System.out.println("Notícia: " +this.noticias);
        }
    }
}
