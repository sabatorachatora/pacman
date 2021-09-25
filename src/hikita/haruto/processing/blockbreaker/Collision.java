package hikita.haruto.processing.blockbreaker;

public interface Collision {

    /***
     * 指定されたX,Yの座標が衝突していたら、True,　そうでなければFalseを返却します
     * @param x
     * @param y
     * @return
     */
    boolean isHit(int x, int y);

    /***
     * 衝突処理
     *
     * @param x
     * @param y
     */
    void onAction(int x, int y);
}
