package br.com.alura.musicas_leticia.principal;

import br.com.alura.musicas_leticia.modelos.MinhasPreferidas;
import br.com.alura.musicas_leticia.modelos.Musica;
import br.com.alura.musicas_leticia.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Poesia Acustica 12");
        minhaMusica.setCantor("Poesia Acustica");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        PodCast meuPodcast = new PodCast();
        meuPodcast.setTitulo("PodDelas");
        meuPodcast.setApresentador("Marcia Sensitiva");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }

}
