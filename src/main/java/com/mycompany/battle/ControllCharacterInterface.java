/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.battle;

/**
 * 操作可能キャラクター用共通インターフェース
 * @author SuzueKatsushige
 */
public interface ControllCharacterInterface {
    void characterMove(int x, int y);
    boolean isExecCommand();
    void execCommand(int execCommandCode);
}
