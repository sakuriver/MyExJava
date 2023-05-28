/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.db;
/**
 * データベースの接続先設定用クラス
 * @author SuzueKatsushige
 */
public class DataBaseConfig {
    /**
     * DBで指定するユーザー名
     */
    public String UserName;
    /**
     * DBで指定するパスワード
     */
    public String Password;
    /**
     * DBの接続先ホスト名
     */
    public String HostName;
    /**
     * DBの文字設定
     */    
    public String CharSet;
    
    /**
     * @param _userName ユーザー名
     * @param _password パスワード
     * @param _hostName ホスト名
     * @param _charSet  DB文字設定
     */
    public DataBaseConfig(
        String _userName,
        String _password,
        String _hostName,
        String _charSet
    ) {
        this.UserName = _userName;
        this.Password = _password;
        this.HostName = _hostName;
        this.CharSet = _charSet;
    }
}
