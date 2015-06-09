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
public class PontoXY extends Ponto2D{
    
    public PontoXY(){
        super.setX(0.0);
        super.setY(0.0);
        super.setZ(0.0);
    }
    
    public PontoXY(double x, double y){
        super.setX(x);
        super.setY(y);
        super.setZ(0.0);
    }
    
    @Override
    public String toString(){
        return String.format("%s(%f,%f,%f)", getNome(), getX(), getY(), getZ()); 
    }
    
}
