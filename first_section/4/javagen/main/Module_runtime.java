// HASH COLLISIONS: YES
// timestamp: 1.663399736E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_runtime {
	public static Reference<Boolean> g_localStorageEnabled;
	public static void init() {
		g_localStorageEnabled=((Reference<Boolean>)(new Reference(true)));
	}
	public static final Object f_max(Object aa, Object ab) {
			if ((FlowRuntime.compareByValue(aa,ab)>0)) {
				return aa;
			} else {
				return ab;
			}
		}
	public static final Object f_println(Object astr) {
			if (Module_securitymode.f_isLoggingEnabled()) {
				return Native.println(((Object)astr));
			} else {
				return null;
			}
		}
}