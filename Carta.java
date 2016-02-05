
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
        return "El " + valor + " de " + palo;
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
