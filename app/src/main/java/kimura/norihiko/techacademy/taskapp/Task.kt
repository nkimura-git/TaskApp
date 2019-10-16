package kimura.norihiko.techacademy.taskapp

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*
import java.io.Serializable


open class Task : RealmObject(), Serializable {
    var title: String = ""       // タイトル
    var contents: String = ""    // 内容
    var date: Date =Date()       // 日時

    // idをプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0
}