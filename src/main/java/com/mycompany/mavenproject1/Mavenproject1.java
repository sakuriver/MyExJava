/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import com.mycompany.battle.Robot;
/**
 * コンソール実行用クラス
 * @author SuzueKatsushige
 */
public class Mavenproject1 {

    /**
     * コマンドライン引数を受け取って実行する
     */
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.name = "Metabee";
        StringBuilder message = new StringBuilder("Hello World!");
        message.append(robot.name);
        System.out.println(message);
    }
}
