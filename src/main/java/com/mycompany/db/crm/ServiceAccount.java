/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.db.crm;

/**
 *
 * 顧客データ管理用の、サービスアカウント情報
 */
public class ServiceAccount {
    /**
     * id番号
     */
    public int id;
    /**
     * アカウント名称情報
     */
    public String name;
    /**
     * 電話番号
     */
    public String tel;
    /**
     * 端末番号
     */
    public String deviceNumber;
    /**
     * メールアドレス
     */
    public String mailAddress;
    /**
     * 位置情報
     */
    public String location;
    /**
     * 公開フラグ
     */
    public boolean isPublic;
    /**
     * サービスアカウントデータを生成する
     * @param _id            アカウント番号
     * @param _name          アカウント名称
     * @param _tel　　       電話番号
     * @param _deviceNumber  端末番号
     * @param _mailAddress   メールアドレス
     * @param _location      位置情報
     * @param _isPublic      公開フラグ
     */
    public ServiceAccount(
            int _id, 
            String _name, 
            String _tel, 
            String _deviceNumber,
            String _mailAddress,
            String _location,
            boolean _isPublic
    ) {
        this.id = _id;
        this.name = _name;
        this.tel = _tel;
        this.deviceNumber = _deviceNumber;
        this.mailAddress = _mailAddress;
        this.location = _location;
        this.isPublic = _isPublic;
        
    }
}
