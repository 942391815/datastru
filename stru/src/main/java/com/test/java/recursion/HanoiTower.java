package com.test.java.recursion;

/**
 * Created by Micheal on 2018/5/27.
 */
public class HanoiTower {
    public static void main(String[] args) {
        doTower(20,'A','B','C');
    }

    /**
     *
     * @param topN 数目
     * @param from 起始塔座
     * @param inter 中间塔座
     * @param inter 目标塔座
     */
    public static void doTower(int topN,char from,char inter,char to ) {
        if(topN==1){
            System.out.println("盘子1，从 "+ from +"塔座到"+ to+ "塔座");
        }else{
            doTower(topN-1,from,to,inter);
            System.out.println("盘子"+topN +", 从"+from +"塔座到" +to +"塔座");
            doTower(topN-1,inter,from,to);
        }
    }
}
