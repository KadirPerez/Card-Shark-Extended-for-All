package cardsharkextendedforall;

import java.util.ArrayList;

public class Jugador {
    private ArrayList<Carta> mano;
    private int puntaje;
    
    public Jugador(){
        mano = new ArrayList();
        puntaje = 0;
    }
    
    public void recibirCartas(ArrayList<Carta> cartas){
        for(int i = 0; i < cartas.size(); i++){
            Carta aux = cartas.get(i);
            mano.add(aux);
        }
    }
    
    public int getSize(){
        return mano.size();
    }
    
    public Carta getCarta(int posicion){
        return mano.get(posicion);
    }
    
    public void aumentarPuntaje(int puntaje){
        this.puntaje = this.puntaje + puntaje;
    }
    
    public void removerCarta(int posicion){
        mano.remove(posicion);
    }
    
    public int getPuntaje(){
        return puntaje;
    }
}
