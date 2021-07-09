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
public interface Iterator {
    boolean hasNext();
    Object next();
    Object remove();
}
