/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/***************************************************************
 ***************************************************************
 *              @author     Yamil Esquivel                             
 *              @year       2019                            
 *              @contact    niisanyamil@gmail.com                         
 ***************************************************************
 ***************************************************************
 */

package sampleKiosco.controlador;
import javax.swing.JOptionPane;


public class CProducto implements IProducto {

    @Override
    public void cargar(String nomProducto, String precioProducto) {
       
     JOptionPane.showMessageDialog(null,nomProducto+"" +""+precioProducto);
    }

}
