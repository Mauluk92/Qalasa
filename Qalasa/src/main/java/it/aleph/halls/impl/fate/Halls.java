package it.aleph.halls.impl.fate;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * The countless Halls of our Lady nest themselves inside one another, in a fractal fashion, making fun of
 * the rational mind of mortals.
 * @param <T>
 */
public abstract class Halls<T> {


    public T recursiveChant(List<T> nestedChants, BiConsumer<T, T> compose) {
        if (nestedChants.size() == 1) {
            return nestedChants.get(0);
        }
        compose.accept(nestedChants.get(nestedChants.size() - 2), nestedChants.get(nestedChants.size() - 1));
        return recursiveChant(nestedChants.subList(0, nestedChants.size() - 1), compose);
    }
}