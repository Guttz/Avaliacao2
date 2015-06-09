
import utfpr.ct.dainf.if62c.avaliacao.PoligonalFechada;
import utfpr.ct.dainf.if62c.avaliacao.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao2 {

    public static void main(String[] args) {
        PoligonalFechada PoliFechada1 = new PoligonalFechada(3);
        PontoXZ P1, P2, P3;
        Double Comprimento;
        
        P1 = new PontoXZ(-3, 2);
        P2 = new PontoXZ(-3, 6);
        P3 = new PontoXZ(0, 2);
        
        PoliFechada1.set(0, P1);
        PoliFechada1.set(1, P2);
        PoliFechada1.set(2, P3);
        
        Comprimento = PoliFechada1.getComprimento();
        
        System.out.printf("Comprimento da poligonal= %f", Comprimento);
    }
    
}
