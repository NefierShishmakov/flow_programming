// HASH COLLISIONS: YES
// timestamp: 1.663402595E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_converter {
	public static final Object[] f_converter(Object[] aa) {
			final Func1<String,Integer> l1_$0 = (Func1<String, Integer>)(Integer ai) -> {
				return Module_string.f_i2s(((int)ai));
			};
			return Native.map(aa, ((Func1<Object,Object>)(Func1)l1_$0));
		}
}
