// HASH COLLISIONS: YES
// timestamp: 1.663336022E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_devmode {
	public static Reference<Func0<Boolean>> g_devModeCheckFn;
	public static void init() {
		final Func0<Boolean> l1_$0 = (Func0<Boolean>)() -> {
			return ((Boolean)Module_url_parameter.f_isUrlParameterTrue("dev"));
		};
		g_devModeCheckFn=((Reference<Func0<Boolean>>)(new Reference(l1_$0)));
	}
}
