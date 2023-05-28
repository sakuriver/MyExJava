/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.network.pubsub;


/**
 * プッシュ通知の管理クラス
 */
public class PushNotificationManager {
    /**
     * fifo形式でサーバーに格納されているキュー管理
     */
    public FifoQueue fifoQueue;
    /**
     * 標準キュー形式で格納されているキューへのアクセス情報
     */
    public StandardQueue standardQueue;
}
