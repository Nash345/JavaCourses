package ru.java.courses;

class Lesson2<Char> {

    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     *
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt(System.in)
        
    static int formula(int x) {
        return (int) Math.sqrt((13 * x) + (13 / x));
    }
    
    System.out.println("%.2f" + formula)

    /**
     * Нужно, привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     *
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
        
    static String initials(String fullName) {
        String str = scn.newString(System.in);
        String[] words = str.split("\\s");
        char letter1 = str.charAt(0);
        char letter2 = str.charAt(6);
        char letter3 = str.charAt(10);
        return (str + " → " letter1.toUpperCase() + ". " + letter2.toUpperCase() + ". " + letter3.toUpperCase() + ".");;
    }

}
