package ExemplosObserverPattern;

import InterfacesObserverPattern.Canal;

public class CanalNoticias implements Canal {
    private String noticias;
    @Override
    public void update(Object noticias) {
        this.setNoticias((String) noticias);
    }

    public String getNoticias() {
        return noticias;
    }

    public void setNoticias(String noticias) {
        this.noticias = noticias;
    }
}
