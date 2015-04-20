package at.usmile.tuple;

/**
 * Holds 3 values of different type that should stick together. Perfect for returning a tuple of values which are of different
 * type.
 * 
 * (being sick of creating classes just for handling multiple return values of different type - Java needs more functional
 * programming).
 * 
 * @author Rainhard Findling
 * @date 10 Jan 2014
 * @version 1
 * @param <T1>
 * @param <T2>
 * @param <T3>
 */
public class GenericTuple3<T1, T2, T3> {

	// ================================================================================================================
	// MEMBERS

	public T1 value1;
	public T2 value2;
	public T3 value3;

	// ================================================================================================================
	// METHODS

	public GenericTuple3(T1 _value1, T2 _value2, T3 _value3) {
		value1 = _value1;
		value2 = _value2;
		value3 = _value3;
	}

	@Override
	public String toString() {
		return "GenericTuple2 [value1=" + value1 + ", value2=" + value2 + ", value3=" + value3 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value1 == null) ? 0 : value1.hashCode());
		result = prime * result + ((value2 == null) ? 0 : value2.hashCode());
		result = prime * result + ((value3 == null) ? 0 : value3.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenericTuple3 other = (GenericTuple3) obj;
		if (value1 == null) {
			if (other.value1 != null)
				return false;
		} else if (!value1.equals(other.value1))
			return false;
		if (value2 == null) {
			if (other.value2 != null)
				return false;
		} else if (!value2.equals(other.value2))
			return false;
		if (value3 == null) {
			if (other.value3 != null)
				return false;
		} else if (!value3.equals(other.value3))
			return false;
		return true;
	}
}
