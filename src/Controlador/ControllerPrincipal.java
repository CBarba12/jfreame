/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.*;
import javax.swing.JOptionPane;
/**
 *
 * @author alexb
 */
public class ControllerPrincipal {
    
    public static VistaPrincipal ventana=new VistaPrincipal();
    public static void mostrar(){ventana.setVisible(true);};
    public static void ocultar(){ventana.setVisible(false);};
    
    
    
     public static void limpiarvista(){
         
            ventana.getJTextcodigo_Instrumento_jTextField1().setText("");  
            ventana.getJtextNombre_Instrumento_jTextField2().setText("");  
            ventana.getJtextUnidad_Instrumento_jTextField3().setText("");  
            ventana.getBoton_borrar_instrumento().setEnabled(false);
            ventana.getTabla().clearSelection();
            ventana.getJTextcodigo_Instrumento_jTextField1().setEnabled(true);
   
     
     }
    public static void  guardarVistaPrincipal(){
        
     if (ventana.getTabla().getSelectedRow() >= 0) {
            // Seleccionar una fila existente para editar
            int selectedRow = ventana.getTabla().getSelectedRow();
            // Modificar los valores de la fila seleccionada
          ventana.getTabla().setValueAt(ventana.getJTextcodigo_Instrumento_jTextField1().getText(), selectedRow, 0);
           ventana.getTabla().setValueAt(ventana.getJtextNombre_Instrumento_jTextField2().getText(), selectedRow, 1);
           ventana.getTabla().setValueAt(ventana.getJtextUnidad_Instrumento_jTextField3().getText(), selectedRow, 2);
        } else {
        String codigo = ventana.getJTextcodigo_Instrumento_jTextField1().getText();
        String nombre = ventana.getJtextNombre_Instrumento_jTextField2().getText();
        String unidad = ventana.getJtextUnidad_Instrumento_jTextField3().getText();

        Object[] columna = new Object[ventana.getModelito().getColumnCount()];

        columna[0] = codigo;
        columna[1] = nombre;
        columna[2] = unidad;

       ventana.getModelito().addRow(columna);
       ventana.getTabla().setModel(ventana.getModelito());
        }
     
    }
    
    public static void borrar_Intrumentos(){
    if (ventana.getTabla().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debes elegir la fila a eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int linea = ventana.getTabla().getSelectedRow();
            ventana.getModelito().removeRow(linea);
            ventana. getBoton_borrar_instrumento().setEnabled(false);
              ventana. getJTextcodigo_Instrumento_jTextField1().setEnabled(true);
             ventana. getJTextcodigo_Instrumento_jTextField1().setText("");
             ventana. getJtextNombre_Instrumento_jTextField2().setText("");
             ventana. getJtextUnidad_Instrumento_jTextField3().setText("");

        }
    
    }
   
    public static void MouseClick(java.awt.event.MouseEvent evt){
        
    if (evt.getClickCount() == 1) { // Detectar un solo clic
           // boton_borrar_instrumento.setEnabled(true);
            int selectedRow =  ventana.getTabla().getSelectedRow();
            if (selectedRow >= 0) {
                String codigo = (String) ventana.getTabla().getValueAt(selectedRow, 0);
                String nombre = (String) ventana.getTabla().getValueAt(selectedRow, 1);
                String unidad = (String) ventana.getTabla().getValueAt(selectedRow, 2);
                ventana.getJTextcodigo_Instrumento_jTextField1().setText(codigo);
                ventana.getJtextNombre_Instrumento_jTextField2().setText(nombre);
                ventana.getJtextUnidad_Instrumento_jTextField3().setText(unidad);
                ventana.getJTextcodigo_Instrumento_jTextField1().setEnabled(false);// Deshabilitar la edición del campo "Código"
                ventana.getBoton_borrar_instrumento().setEnabled(true);
            }
        }
    
    }
    
    
    public static void busqueda(){

                    String cadena=ventana.getTextfiel_nombre_busqueda().getText();
                    
                  for (int row = 0; row < ventana.getTabla().getRowCount(); row++) {
                    for (int col = 0; col < ventana.getTabla().getColumnCount(); col++) {
                       String cadena2=(String)ventana.getTabla().getValueAt(col, 0);
                         
                        if (cadena2.equals(cadena)) {
                           ventana.getTabla().changeSelection(row, 0, false, false);
                     
                        }
                    }
                }



     }
}

