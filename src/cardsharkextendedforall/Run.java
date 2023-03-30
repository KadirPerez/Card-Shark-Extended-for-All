package cardsharkextendedforall;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Run
{
    public static void main(String arrgs[]){
        Run run = new Run();
        run.iniciar();
        
    }
    public void iniciar()
    {
        int dado, posicion, mayor = 0, pm = 0, c = 0;
        ArrayList<Integer> iguales = new ArrayList();
        ArrayList<Integer> iguales2 = new ArrayList();
        Carta aux = new Carta();
        String esperar = new String();
        Crupier crupier = new Crupier();
        Scanner leer = new Scanner(System.in);
        Scanner leerC = new Scanner(System.in);
        Random rdm = new Random();
        
        System.out.print('\u000c');
        
        
        System.out.print("Cantidad de jugadores: ");
        int cantidadJugadores = leer.nextInt();

        if(cantidadJugadores/3 == 0)
            crupier.setCantidadBarajas(1);
        else 
            crupier.setCantidadBarajas(cantidadJugadores/3);

        crupier.generarBarajas();

        Jugador[] jugadores = new Jugador[cantidadJugadores];
        
        for(int i = 0; i < cantidadJugadores; i++){
            jugadores[i] = new Jugador();
            jugadores[i].recibirCartas(crupier.repartir(5));
            System.out.print("\nJugador " + (i + 1)+ " pulsa enter para tirar el dados");
            esperar = leerC.nextLine();
            dado = 1 + rdm.nextInt(5);
            System.out.print("Dado tirado por el jugador " + (i+1)  + ": " + dado + "\n");
            System.out.print("Se agregaron " + dado + " cartas a tu maso\n");
            jugadores[i].recibirCartas(crupier.repartir(dado));
        }

        System.out.print("\nSe repartiron 5 cartas a cada jugador, las cantidades de \ncartas por jugador quedaron de la siguiente manera: \n");
        
        for(int i = 0; i < cantidadJugadores; i++){
            System.out.print("\nJugador " + (i + 1) + ": " + jugadores[i].getSize());
        }
        
        System.out.print("\n\nPulsen enter para continuar");
        esperar = leerC.nextLine();
        crupier.limpiar();
        
        for(int j = 0; j < 2 ; j++){
            mayor = 0;pm = 0; c = 0;
            iguales.clear(); iguales2.clear();
            
            for(int i = 0; i < cantidadJugadores; i++){
                if(jugadores[i].getSize() == 0){
                    System.out.print("Jugador " + (i+1) + " te quedaste sin cartas, tira el dado con enter");
                    esperar = leerC.nextLine();
                    dado = 1 + rdm.nextInt(5);
                    System.out.print("\nDado tirado por el jugador " + (i+1)  + ": " + dado + "\n");
                    System.out.print("\nSe agregaron " + dado + " cartas a tu maso y perdiste 3 puntos\n");
                    jugadores[i].recibirCartas(crupier.repartir(dado));
                    jugadores[i].aumentarPuntaje(-3);
                    System.out.print("\nPulsen enter para continuar");
                    esperar = leerC.nextLine();
                    crupier.limpiar();
                }
            }
            
            for(int i = 0; i < cantidadJugadores; i++){
                System.out.print("Puntaje del jugador " + (i+1) + ": " + jugadores[i].getPuntaje() + "\n");
            }

            for(int i = 0; i < cantidadJugadores; i++){
                System.out.print("\nJugador " + (i + 1) + ": ");
                System.out.print("\nCantidad de cartas: " + jugadores[i].getSize() + "\n\n");
                
                for(int k = 0; k < jugadores[i].getSize(); k++){
                    aux = jugadores[i].getCarta(k);
                    esperar = aux.toString();
                    System.out.print( "|  "+ esperar + "  |");
                }
                System.out.print("\n\nCarta elegida: ");
                posicion = leer.nextInt();
                aux = jugadores[i].getCarta(posicion - 1);
                jugadores[i].removerCarta(posicion - 1);
                esperar = aux.toString();
                System.out.print("\n" + esperar + "\n\n");
                if(aux.getValor() > mayor){
                    mayor = aux.getValor();
                    pm = i;
                    iguales.clear();
                }else if(aux.getValor() == mayor){
                    iguales.add(i);
                }
            }

            if(iguales.size() == 0){
                System.out.print("El jugador " + (pm + 1) + " tiro la carta mas alta se le agregaran 2 puntos");
                jugadores[pm].aumentarPuntaje(2);
                System.out.print("\n\nPulsen enter para continuar");
                esperar = leerC.nextLine();
                crupier.limpiar();
            }else{
                
                for(int i = 0; i < cantidadJugadores; i++){
                    if(jugadores[i].getSize() == 0){
                        System.out.print("Jugador " + (i+1) + " te quedaste sin cartas, tira el dado con enter");
                        esperar = leerC.nextLine();
                        dado = 1 + rdm.nextInt(5);
                        System.out.print("Dado tirado por el jugador " + (i+1)  + ": " + dado + "\n");
                        System.out.print("Se agregaron " + dado + " cartas a tu maso y perdiste 3 puntos\n");
                        jugadores[i].recibirCartas(crupier.repartir(dado));
                        jugadores[i].aumentarPuntaje(-3);
                        System.out.print("\n\nPulsen enter para continuar");
                        esperar = leerC.nextLine();
                        crupier.limpiar();
                    }
                }
                
                System.out.print("\n\nLos jugadores " + (pm + 1));
                
                for(int i = 0; i < iguales.size(); i++){
                    System.out.print(", " + (iguales.get(i) + 1));
                }

                mayor = 0;
                
                System.out.print(" empataron con la carta mas alta, vuelvan a tirar\n\n");
                
                iguales.add(pm);

                for(int i = 0; i < iguales.size(); i++){
                    System.out.print("Jugador " + (iguales.get(i) + 1) + ": ");
                    System.out.print("\nCantidad de cartas: " + jugadores[iguales.get(i)].getSize()+ "\n\n");
                    for(int k = 0; k < jugadores[iguales.get(i)].getSize(); k++){
                        aux = jugadores[iguales.get(i)].getCarta(k);
                        esperar = aux.toString();
                        System.out.print( "|  "+ esperar + "  |");
                    }
                    System.out.print("\n\nCarta elegida: ");
                    posicion = leer.nextInt();
                    aux = jugadores[iguales.get(i)].getCarta(posicion - 1);
                    jugadores[iguales.get(i)].removerCarta(posicion - 1);
                    esperar = aux.toString();
                    System.out.print("\n" + esperar + "\n\n");
                    if(aux.getValor() > mayor){
                        mayor = aux.getValor();
                        pm = iguales.get(i);
                        iguales2.clear();
                    }else if(aux.getValor() == mayor){
                        iguales2.add(iguales.get(i));
                    }
                }

                if(iguales2.size() == 0){
                    System.out.print("El jugador " + (pm + 1) + " tiro la carta mas alta se le agregaran 2 puntos\n\n");
                    jugadores[pm].aumentarPuntaje(2);
                    System.out.print("\n\nPulsen enter para continuar");
                    esperar = leerC.nextLine();
                    crupier.limpiar();
                    
                }else{
                    System.out.print("Los jugadores " + (pm + 1));
                    jugadores[pm].aumentarPuntaje(1);
                    for(int i = 0; i < iguales2.size(); i++){
                        System.out.print(", " + (iguales2.get(i) + 1));
                        jugadores[iguales2.get(i)].aumentarPuntaje(1);
                    }

                    System.out.print(" volvieron a empataron con la carta mas alta, todos recibiran un punto\n\n");
                    System.out.print("\n\nPulsen enter para continuar");
                    esperar = leerC.nextLine();
                    crupier.limpiar();

                }
            }
        }  
        
        System.out.print("\n\nJuego terminado\n\n");
        
        ArrayList<Integer> ganadores = crupier.comprobarGanador(jugadores, cantidadJugadores);
        
        if(ganadores.size() == 1){
            System.out.print("Gano el jugador " + (ganadores.get(0) + 1));
        }else{
            System.out.print("Empataron los jugadores: \n");
            for (int i = 0; i < ganadores.size(); i++) {
                System.out.print((ganadores.get(i) + 1 + "\n"));
            }
        }
        
        System.out.print("\n\n");
        
        for(int i = 0; i < cantidadJugadores; i++){
                System.out.print("Puntaje del jugador " + (i+1) + ": " + jugadores[i].getPuntaje() + "\n");
        }
        
    }
}
