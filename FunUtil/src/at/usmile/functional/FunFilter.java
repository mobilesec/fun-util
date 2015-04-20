package at.usmile.functional;

/**
 * {@link hhttps://en.wikipedia.org/wiki/Filter_%28higher-order_function%29}
 * 
 * @author Rainhard Findling
 * @date 20 Apr 2015
 * @version 1
 * @param <T>
 */
public interface FunFilter<T> {
	public boolean filter(T _t);
}
