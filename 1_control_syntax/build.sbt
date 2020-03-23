scalaVersion := "2.12.8"

// 以下に対して警告情報を出すオプション
// ・今後廃止予定のAPIを使用している(-deprecation)
// ・明示的に使用を宣言しないといけない実験的な機能や注意しなければならない機能を利用している(-feature)
// ・型消去などでパターンマッチが有効に機能しない場合(-unchecked)
// ・その他、望ましい書き方や落とし穴についての情報(-Xlint)
scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")