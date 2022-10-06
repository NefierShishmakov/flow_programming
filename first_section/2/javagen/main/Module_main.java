// HASH COLLISIONS: YES
// timestamp: 1.664433563E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_main {
	public static final Object f_main() {
			final Object[] l0_int_array = (new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
			final Func2<Integer,Integer, Integer> l2_$1 = (Func2<Integer, Integer, Integer>)(Integer ax, Integer ay) -> {
				return ((Integer)(((int)ax)*((int)ay)));
			};
			return Module_runtime.f_println(Native.fold(l0_int_array, 0, ((Func2<Object,Object, Object>)(Func2)l2_$1)));
		}
}
