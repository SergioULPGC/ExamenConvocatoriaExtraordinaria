/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrimoniohistorico;

import java.util.ArrayList;

/**
 *
 * @author sdels
 */
class CatalogoItem {
    String nombre;
    String autor;
    String anioDeFabricacion;
    String metodoDeFabricacion;
    String material;
    String estadoDeConservacion;
    String localizacion;
    String tematica;

    public CatalogoItem(String nombre, String autor, String anioDeFabricacion, String metodoDeFabricacion, String material, String estadoDeConservacion, String localizacion, String tematica){
        this.nombre = nombre;
        this.autor = autor;
        this.anioDeFabricacion = anioDeFabricacion;
        this.metodoDeFabricacion = metodoDeFabricacion;
        this.material = material;
        this.estadoDeConservacion = estadoDeConservacion;    
        this.localizacion = localizacion;
        this.tematica = tematica;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getAnioDeFabricacion(){
        return anioDeFabricacion;
    }
    
    public String getMetodoDeFabricacion(){
        return metodoDeFabricacion;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public String getEstadoDeConservacion(){
        return estadoDeConservacion;
    }
    
    public String getLocalizacion(){
        return localizacion;
    }
    
    public String getTematica(){
        return tematica;
    }
}
