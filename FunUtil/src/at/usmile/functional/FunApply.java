package at.usmile.functional;

/**
 * {@link http://en.wikipedia.org/wiki/Higher-order_function}
 * 
 * @author Rainhard Findling
 * @date 15 Jan 2014
 * @version 1
 * @param <T>
 * @param <R>
 */
public interface FunApply<T, R> {
	public R apply(T _t);
}