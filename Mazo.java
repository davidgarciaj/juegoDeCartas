import java.util.Collections;
import java.util.ArrayList;

/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
   //Guardara todas las cartas de la baraja
    private ArrayList<Carta> cartas;;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        cartas = new ArrayList<>();
        int carta = 1;
        int numPalo = 1;
        String palo = "picas";
        while(carta < 14 && numPalo < 5){
            cartas.add(new Carta(carta, palo));
            if(carta == 13){
                carta = 1;
                numPalo++; 
                if(numPalo == 2){
                    palo = "treboles";
                }
                else if(numPalo == 3){
                    palo = "diamantes";
                }
                else{
                    palo = "corazones";
                }  
            }
            carta++;
        }
    }

    /**
     * Baraja el mazo de cartas
     */
    public void barajar()
    {
        Collections.shuffle(cartas);
    }
    
    /**
     * Devuelve la primera carta del mazo y la saca del mazo.
     * En caso de que no queden cartas en el mazo devuelve null.
     */
    public Carta tomarPrimera(){
        Carta primeraCarta = cartas.get(0);
        cartas.remove(0);
        return primeraCarta;
    }
    
    /**
     * Devuelve el número de cartas que hay en el mazo
     */
    public int quedan(){
        return cartas.size();
    }
}
