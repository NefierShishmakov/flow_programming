// HASH COLLISIONS: YES
// timestamp: 1.665042095E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_main {
	public static final Object f_main() {
			final Object[] l0_a = (new Object[] { 1, 2, 3, 5, 3, 4, 7 });
			final int l1_m = 6;
			Module_runtime.f_println(Module_index.f_inds(l0_a, l1_m));
			return Module_runtime.f_println(Module_index.f_indsEasyVersion(l0_a, l1_m));
		}
}
