public class Credit {

  private final double percent; //процентная ставка по кредиту

  private final int months; //срок кредитования

  private long total; //сумма кредита

  public Credit(double percent, int months, long total) {
    this.percent = percent;
    this.months = months;
    this.total = total;
  }

  public double getPercent() {
    return percent;
  }

  public int getMonths() {
    return months;
  }

  public long getTotal() {
    return total;
  }

  public long setTotal(long total) {
    return this.total = total;
  }

  public long getMaximum() {
    long maxValue = getTotal();
    for (int i = 0; i < (getMonths() - 1); ++i) {
      long temp = (long) ((getPercent() / 12) * maxValue);
      maxValue = maxValue + temp;
    }
    return maxValue;
  }
}
