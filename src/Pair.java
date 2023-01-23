import java.util.Objects;

 class Pair<T, E> {
     private  T type;
    private  E elem;

    private Pair(T type, E elem) {
        this.type = type;
        this.elem = elem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair<?, ?> pair)) return false;
        return type.equals(pair.type) && elem.equals(pair.elem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, elem);
    }

    T getFirst() {
        return type;
    }

    E getSecond() {
        return elem;
    }

    public static<T, E> Pair<T, E> of(T type, E elem) {
        return new Pair<>(type, elem);
    }

     @Override
     public String toString() {
         return "Pair{" +
                 "type=" + type +
                 ", elem=" + elem +
                 '}';
     }
 }