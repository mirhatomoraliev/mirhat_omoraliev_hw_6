public class Skeleton extends Boss{
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " | Count of arrow:" + this.arrowCount;
    }

    //7. Создать класс Skeleton (Скелет), унаследовать от Босса.
// 8. Добавить поле (кол-во стрел) и добавить геттеры и сеттеры в классе Skeleton.
//9. Переопределить родительский метод printInfo в классе Skeleton
}
