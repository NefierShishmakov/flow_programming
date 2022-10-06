// HASH COLLISIONS: YES
// timestamp: 1.663414147E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_main {
	public static final Object f_main() {
			Module_runtime.f_println(Module_fib.f_fibRecursion(10));
			Module_runtime.f_println(Module_fib.f_fibTailRecursion(10));
			return Module_runtime.f_println(Module_fib.f_fibRefArray(10));
		}
}
