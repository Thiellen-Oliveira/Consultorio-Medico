/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.area;

import javax.swing.JOptionPane;
import sistema.classes.Medico;

/**
 *
 * @author Thiellen Caroline de Oliveira
 */
public class ClinicoGeral extends Medico{
    @Override
    public void operar(){
        JOptionPane.showMessageDialog(null, "Atendeu o paciente");
    }
}
