/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package straterypatterndemo;

/**
 *
 * @author Dalaryizmi
 */
public class VitGioi extends Duck {
    
    
    @Override
    public String Display() {
        return "Xin chao! Toi la vịt giời" + "\n" +
                performQuack() + "\n" +
                performFly();
    }
    
}
