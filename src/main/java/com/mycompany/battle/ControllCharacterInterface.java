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
    /**
     * 指定した操作キャラクターの移動処理
     * @param x X座標
     * @param y Y座標
     */
    void characterMove(int x, int y);
    /**
     * コマンドを実行可能状態であるか
     * @return boolean trueであれば、コマンドが実行可能状態
     */
    boolean isExecCommand();
    /**
     * コマンド実行処理
     * @param execCommandCode コマンド実行コード 
     */
    void execCommand(int execCommandCode);
}
