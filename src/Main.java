public class Main {
    //Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий
    // элементам принимать значение null.
    //Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of().
    // Конструктор должен быть закрытым (private).
    public static void main(String[] args) {

        Pair<Integer, String> p =  Pair.of(5, "0.56");

        System.out.println(p.toString());
    }


}