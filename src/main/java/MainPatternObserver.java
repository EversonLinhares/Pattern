import ExemplosObserverPattern.AgenciaNoticias;
import ExemplosObserverPattern.CanalNoticias;

public class MainPatternObserver {
    public static void main(String[] args) {
        AgenciaNoticias observavel = new AgenciaNoticias();
        CanalNoticias observador = new CanalNoticias();

        observavel.addObserver(observador);
        observavel.setNoticias("Nova notícia");

    }
}
