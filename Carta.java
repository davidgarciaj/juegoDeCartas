
/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // Valor que tiene la carta
    private int valor;
    // Palo al que pertenece la carta
    private String palo;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor, String palo)
    {
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * Devuelve el valor y el palo para identificar de forma única a la carta
     */
    public String getNombre()
    {
        String numCarta = "El " + valor;
        if(valor > 10){
            if(valor == 11){numCarta = "La J";}
            else if(valor == 12){numCarta = "La Q";}
            else{numCarta = "La K";}
        }
        else if(valor == 1){numCarta = "El As";}
        return numCarta + " de " + palo;
    }
    
    /**
     * Devuelve el valor de la carta
     */
    public int getValor(){
        return valor;
    }
    
    /**
     * Devuelve el palo de la carta
     */
    public String getPalo(){
        return palo;
    }
}
