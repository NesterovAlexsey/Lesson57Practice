//Задача 1*** (не обязательно)
//Задана процентная ставка по кредиту (percent % годовых), срок кредитования (months месяцев)
// и сумма кредита (total евро).
//
// Необходимо при помощи бинарного поиска рассчитать размер аннуитетного платежа:
// платежи каждый месяц должны быть равными, как при обычном кредите или ипотеке.
//
//Каждый платёж полностью выплачивает все накопленные проценты, оставшаяся сумма идёт
// на погашение тела кредита.
//
//Это означает, что в первом месяце ваш платёж состоит почти только из начисленных процентов,
// а в последнем - почти только из тела кредита.
//
// Подсказка 1
//Воспользуйтесь бинарным поиском для размера начисляемых ежемесячно процентов
// (с точностью до четырёх знаков после запятой) - это не percent / 12.
//
//Процент должен быть таким, чтобы за 12 месяцев на сумму
// (с учётом начисления процентов на проценты) общая сумма долга увеличилась на percent %.
//
//Подсказка 2
//Подберите размер ежемесячного платежа при помощи бинарного поиска:
// необходимо, чтобы при выбранном размере платежа и ежемесячных процентах из
// подсказки 1 количество платежей для полного погашения долга (total евро) совпадало с заданным
// в условии задачи (months месяцев).

public class CreditRunner {

  public static void main(String[] args) {
    Credit myCredit = new Credit(0.12, 12, 100);
    System.out.println(myCredit.getMaximum());
  }

}
