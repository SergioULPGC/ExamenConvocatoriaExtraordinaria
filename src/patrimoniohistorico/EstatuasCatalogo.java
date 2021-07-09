/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrimoniohistorico;

/**
 *
 * @author sdels
 */
public class EstatuasCatalogo {
    static final int MAX_ITEMS = 5;
    int numItems = 0;
    CatalogoItem[] catalogoItems;

    public EstatuasCatalogo(){
        catalogoItems = new CatalogoItem[MAX_ITEMS];
        
        addItem("David" ,"Miguel Angel", "1501", "Escultura", "Marmol blanco", "Casi nuevo", "Galeria Academica de Florencia", "Arte");
    }

    public void addItem(String nombre, String autor, String anioDeFabricacion, String metodoDeFabricacion, String material, String estadoDeConservacion, String localizacion, String tematica){
        CatalogoItem item = new CatalogoItem(nombre, autor, anioDeFabricacion, metodoDeFabricacion, material, estadoDeConservacion, localizacion, tematica);
        
        if(numItems >= MAX_ITEMS){
            System.err.println("CATALOGO LLENO.");
        }else {
            catalogoItems[numItems] = item;
            numItems++;
        }
    }
    
    public Iterator createIterator(){
        return new CatalogoIterator(catalogoItems);
    }
}
