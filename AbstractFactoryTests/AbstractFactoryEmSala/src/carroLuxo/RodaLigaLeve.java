/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carroLuxo;

import interfaces.IRoda;

/**
 *
 * @author aluno
 */
public class RodaLigaLeve implements IRoda{

    @Override
    public void alinhar() {
        System.out.println("Alinhando roda de carro de luxo");
    }
    
}