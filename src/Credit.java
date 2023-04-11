public class Credit {

  private final float percent; //процентная ставка по кредиту

  private final int months; //срок кредитования

  private final long total; //сумма кредита

  public Credit(float percent, int months, long total) {
    this.percent = percent;
    this.months = months;
    this.total = total;
  }

  public float getPercent() {
    return percent;
  }

  public int getMonths() {
    return months;
  }

  public long getTotal() {
    return total;
  }
}
