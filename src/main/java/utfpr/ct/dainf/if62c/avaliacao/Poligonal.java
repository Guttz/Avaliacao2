/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

import java.util.Vector;
 
/**
 *
 * @author kiqdestro
 */
public class Poligonal {
    private Ponto2D[] vertices;
    
    public Poligonal(int n){
        if(n<2)
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        
        vertices = new Ponto2D[n];
    }
    
    public int getN(){
        return vertices.length;
    }
    
    public Ponto2D get(int indice){
        if(indice<0 || indice>vertices.length-1)
            return null;
        
        return vertices[indice];
    }
    
    public void set(int indice, Ponto2D Ponto1){
        boolean aux = false;
        String TipoDePlano;
        
        for(int i=0; i<vertices.length; i++)
            if(vertices[i]!=null)
                aux = true;
        
        if(aux == false)
            TipoDePlano = Ponto1.getNome();
       
        if(TipoDePlano != Ponto1.getNome())
            throw new RuntimeException("Vértices devem estar no mesmo plano");
            
        if(indice>=0 || indice<=vertices.length-1)
            vertices[indice] = Ponto1;        
}
    
   public double getComprimento(){
       int i;
       double distanciaTotal=0;
       for(i=0; i+1<vertices.length; i++){
           distanciaTotal = distanciaTotal + vertices[i].dist(vertices[i+1]);
    }
        return distanciaTotal;
   }
}