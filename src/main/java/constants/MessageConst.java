package constants;

/**
 *
 *  各出力メッセージを定義するEnumクラス
 *
 */
public enum MessageConst {

    // 認証
    I_LOGINED("ログインしました"),
    E_LONINED("ログインに失敗しました"),
    I_LOGOUT("ログアウトしました"),

    // DB更新
    I_REGISTERED("登録が完了しました"),
    I_UPDATED("更新が完了しました"),
    I_DELETED("削除が完了しました"),

    // バリテーション
    E_NONAME("氏名を入れて下さい"),
    E_NOPASSWORD("パスワードを入れてくだい"),
    E_NOEMP_CODE("社員番号を入れてください"),
    E_EMP_CODE_EXIST("入力された社員番号の情報はすでに存在しています"),
    E_NOTITLE("タイトルを入力して下さい"),
    E_NOCONTENT("内容を入力して下さい");

    /**
     *  文字列
     */
    private final String text;

    /**
     *  コンストラクタ
     */
    private MessageConst(final String text) {
        this.text = text;
    }

    /**
     * 値（文字列）取得
     */
    public String getMessage() {
        return this.text;
    }


}
