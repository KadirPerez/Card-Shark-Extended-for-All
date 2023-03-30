package cardsharkextendedforall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Crupier {
    
    private int cantidadBarajas;
    private ArrayList<Baraja> b;
    
    public Crupier(){
        cantidadBarajas = 1;
        b = new ArrayList();
    }
    
    public void generarBarajas(){
        for(int i = 0; i < cantidadBarajas; i++){
            b.add(new Baraja());
            Baraja baraja = b.get(i);
            baraja.barajar();
        }
    }
    
    public void setCantidadBarajas(int cantidadBarajas){
        this.cantidadBarajas = cantidadBarajas;
    }
    
    public ArrayList<Carta> repartir(int cantidad) {
        
        ArrayList<Carta> cartasRepartidas = new ArrayList();
        ArrayList<Carta> aux = new ArrayList();
        Carta cAux = new Carta();
        int i = 0, aRepartir;
        
        do{
            Baraja baraja = b.get(i);
            
            if(baraja.getSize() > (cantidad-1) && cartasRepartidas.size() == 0){
                cartasRepartidas = baraja.repartir(cantidad);
            }else if(baraja.getSize() > 0 ){
                aRepartir = cantidad - cartasRepartidas.size();
                if (aRepartir < baraja.getSize()){
                    aux = baraja.repartir(aRepartir);
                    for(int j = 0; j < aux.size(); j++){
                        cAux = aux.get(j);
                        cartasRepartidas.add(cAux);
                    }
                }else{
                    aux = baraja.repartir(baraja.getSize());
                    for(int j = 0; j < aux.size(); j++){
                        cAux = aux.get(j);
                        cartasRepartidas.add(cAux);
                    }
                }
            }
            i = i + 1;
        }
        while(cartasRepartidas.size() < (cantidad-1));
                
        return cartasRepartidas;
    }
    
    public ArrayList<Integer> comprobarGanador(Jugador[] jugadores, int cantidadJugadores){
        
        ArrayList<Integer> puntajes = new ArrayList();
        ArrayList<Integer> ganadores = new ArrayList();
        
        for(int i = 0; i < cantidadJugadores; i++){
           puntajes.add(jugadores[i].getPuntaje());
        } 
        
        int max = Collections.max(puntajes);
       
        for(int i = 0; i < cantidadJugadores; i++){
           if(puntajes.get(i) == max){
               ganadores.add(i);
           }
        } 
        
        return ganadores;
    }
    
    public void limpiar(){
        for (int i = 0; i < 10; i++) System.out.println("\n\n\n\n");
    } 
    
}
