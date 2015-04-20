package at.usmile.functional;

import java.util.ArrayList;
import java.util.List;

/**
 * Functional programming utility.
 * 
 * @author Rainhard Findling
 * @date 15 Jan 2014
 * @version 1
 */
public class FunUtil {

	// ================================================================================================================
	// MEMBERS

	// ================================================================================================================
	// METHODS

	/**
	 * {@link http://en.wikipedia.org/wiki/Map_%28higher-order_function%29}
	 * 
	 * @param _list
	 * @param _f
	 * @return
	 */
	public static <T, R> List<R> apply(List<T> _list, FunApply<T, R> _f) {
		List<R> newList = new ArrayList<R>(_list.size());
		for (T t : _list) {
			newList.add(_f.apply(t));
		}
		return newList;
	}

	public static <T> List<T> filter(List<T> _list, FunFilter<T> _f) {
		List<T> newList = new ArrayList<T>();
		for (T t : _list) {
			if (_f.filter(t)) {
				newList.add(t);
			}
		}
		return newList;
	}
}
