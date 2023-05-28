/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.field;

/**
 * 2Dデータ情報を生成する
 * @author SuzueKatsushige
 */
public class Point {
    /**
     * X座標
     */
    public int x = 0;
    /**
     * Y座標
     */
    public int y = 0;
    /**
     * アプリ上の座標データ設定
     * @param _posx 初期X座標
     * @param _posy 初期Y座標
     */
    public Point(int _posx, int _posy) {
        x = _posx;
        y = _posy;
    }
}
