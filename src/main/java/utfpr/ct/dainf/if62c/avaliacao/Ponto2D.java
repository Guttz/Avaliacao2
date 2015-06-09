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
abstract public class Ponto2D extends Ponto{
    
    
    protected Ponto2D(){
        super.setX(0.0);
        super.setY(0.0);
        super.setZ(0.0);
    }
    
    protected Ponto2D(double x, double y, double z){
        super.setX(x);
        super.setY(y);
        super.setZ(z);
    }
    
}
