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
public class CherryValleyDuck extends Duck{
    
    @Override
    public String Display() {
        return "Xin chao! Tôi là giống vịt Ao Đành là Anh Đào..." + "\n" +
                performQuack() + "\n" +
                performFly();
    }
    
    
}
