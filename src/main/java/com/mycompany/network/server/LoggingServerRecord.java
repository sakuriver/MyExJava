/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.network.server;

/**
 * ログサーバーの１行ずつのレコードデータ構造
 * 実行時間と中身のログデータ等を設定する
 * @author SuzueKatsushige
 */
public class LoggingServerRecord {
    /**
     * サーバーでログ実行記録
     */
    public String ExecDateTime;
    /**
     * ログ実行時のJsonデータ
     */
    public String BodyData;
    
    /**
     * データ生成用のコンストラクタ
     * @param _execDateTime 実行日時
     * @param _bodyData     実行用データ
     */
    public LoggingServerRecord(
        String _execDateTime,
        String _bodyData    
    ) {
        this.ExecDateTime = _execDateTime;
        this.BodyData = _bodyData;
    }
    
}
