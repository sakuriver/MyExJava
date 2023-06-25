# MyExJava
昔触っていたJavaへの貢ぎ物

## 作業記録が欲しい方は参考に
2023年５月23日分
### アカウント関連
　・ServiceAccount.java ..............アカウント認証で利用する、
　　　　　　　　　　　　　　...........アカウントのパラメータデータ設定
              
　・ControllCharacterInterface.java....アプリ上の操作キャラクター用のインターフェースを定義するクラス
### RPA関連対応 
  ・Robot.java.........................操作キャラクターの継承先ロボット関連インターフェース
　・Point.java.........................2次元アプリでのデータ管理クラス
　・Mavenproject1.java.................ビルドして実行するメインファイル

### サーバー側パッケージ対応 
　・Talk.java..........................よくある会話画面用のデータ構造定義クラス

  ・TaskConnectClient.java.............SDKとして開発者に提供する接続内容を書くクラス
  ・FifoQueue.java ....................サーバーからのプッシュ通知ないで利用する送信用データ配列用のクラス
  ・MessageTopic.java..................プッシュ通知で利用するどれを送信するかを利用するキーワード一覧をまとめたクラス
  ・PushNotificationManager.java.......プッシュ用の通知関連用のデータを管理するクラス
     Amazonの資料翻訳チャレンジ
        FifoQueue.....順番に移動するキューとして設定
　　　  StandardQueue.標準キューとして利用するものを設定
  ・QueueMessage.java..................キュー用のデータ構造
        name....メッセージ毎の名称
        state...メッセージの状態
        commandMessage.....メッセージの送信ルールを入力
        description........メッセージ詳細説明

  ・StandardQueue.java.................
  
  ### ログ関連パッケージ
  
  ・LoggingServer.java.................
  ・LoggingServerRecord.java...........
  ・PubSubManagerServer.java...........
  ・TaskProxyServer.java...............
  ・TaskServer.java....................
