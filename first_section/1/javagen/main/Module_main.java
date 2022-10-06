// HASH COLLISIONS: YES
// timestamp: 1.663402666E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_main {
	public static final Object f_main() {
			final Object[] l0_a = (new Object[] { 1, 2, 3, 4, 5, 6, 7 });
			final Object[] l1_str_array = Module_converter.f_converter(l0_a);
			return Module_runtime.f_println(Module_string.f_strGlue(l1_str_array, ", "));
		}
}
