/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author kiqdestro
 */
public class PoligonalFechada extends Poligonal{

    public PoligonalFechada(int n) {
        super(n);
    }
    
    @Override
    public double getComprimento(){
        Ponto2D p1, p2;
        double distanciaTotal;
        
        p1 = get(getN()-1);
        p2 = get(0);
        
        distanciaTotal = super.getComprimento() + p2.dist(p1);
        
        return distanciaTotal;  
   }
}
