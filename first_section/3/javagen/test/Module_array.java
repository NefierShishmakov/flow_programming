// HASH COLLISIONS: YES
// timestamp: 1.663407109E12

package test;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_array {
	public static final Object[] f_arrayPush(Object[] aarray, Object avalue) {
			return Native.replace(aarray, Native.length(aarray), avalue);
		}
	public static final Object f_refArrayPush(Reference<Object[]> arefArray, Object aelem) {
			arefArray.value = Module_array.f_arrayPush(arefArray.value, aelem);
			return null;
		}
}
