/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.network.server;

/**
 * クラウドサーバー側の管理クラス側
 * プロジェクト名×キュー×配置箇所で一意にインスタンス箇所を求める
 */
public class TaskServer {
    public String project;
    public String queue;
    public String location;
    public String[] applyPathes;
    public TaskServer(String _project, String _queue, String _location, String[] _applyPathes) {
        project = _project;
        queue = _queue;
        location = _location;
        applyPathes = _applyPathes;
    }
}
