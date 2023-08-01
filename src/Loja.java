import Digitalizadora.Digitalizadora;
import Impressora.Impressora;
import copiadora.Copiadora;
import copiadora.Xerox;
import Digitalizadora.Scanner;
import Impressora.Deskjet;
import Impressora.LaserJet;
import Multifuncional.Multifuncional;


    public class Loja {
    public static void main(String[] args) {
        Multifuncional em = new Multifuncional();
        Deskjet deskjet = new Deskjet();
        Xerox xerox = new Xerox();
    
        
        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = xerox;
        
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
}
    }