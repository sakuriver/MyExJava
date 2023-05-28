/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.network.client;

/**
 * SDKとして提供する側のタスクサービスへの接続クライアントクラス
 */
public class TaskConnectClient {
    
    /**
     * 
     * @param project   プロジェクト文字列
     * @param queue     キュー文字列
     * @param location  位置情報設定
     * @return 
     */
    public String QueuePath(String project, String queue, String location ) {
        return "";
    }
    
    /**
     * タスク用のキー情報を生成する
     * @return string 引数から作成した、タスク情報を設定
     * @param  task   タスクコード
     * @param  parent ペアレント情報
     */
    public String CreateTask(String task, String parent) {
        return task + parent;
    }
}
