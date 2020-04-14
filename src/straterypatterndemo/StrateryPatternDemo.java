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
public class StrateryPatternDemo {
    //Mở rộng 1 hành vi bay, mở rộng 1 hành vi kêu, thêm loài 1 vịt
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck1 = new VitGioi();
        duck1.setFlyBehavior(new FlyByWings());
        SQuack sQuack = new SQuack();
        duck1.setQuackBehavior(sQuack);
        System.out.println(duck1.Display());
        
        Duck duck2 = new CherryValleyDuck();
        duck2.setFlyBehavior(new FlyEmirates());
        duck2.setQuackBehavior(sQuack);
        System.out.println(duck2.Display());
    }
    
}
