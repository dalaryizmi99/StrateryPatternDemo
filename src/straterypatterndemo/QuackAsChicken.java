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
public class QuackAsChicken implements IQuackBehavior{

    @Override
    public String quack() {
        return ("Em là con vịt nhưng kêu như gà");
    }
    
    
}
