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
public class PontoYZ extends Ponto2D {
    
    public PontoYZ(){
        super.setX(0.0);
        super.setY(0.0);
        super.setZ(0.0);
    }
    
    public PontoYZ(double y, double z){
        super.setX(0.0);
        super.setY(y);
        super.setZ(z);
    }
    
    @Override
    public String toString(){
        return String.format("%s(%f,%f,%f)", getNome(), getX(), getY(), getZ()); 
    }
    
}
