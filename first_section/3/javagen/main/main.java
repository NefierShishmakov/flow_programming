// HASH COLLISIONS: YES
// timestamp: 1.663414158286E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class main extends FlowRuntime {

	// Init hosts: 1
	private static final void init_hosts() {
		FlowRuntime.registerNativeHost(Native.class);
	}

	// Init modules: 3
	private static final void init_modules() {
		Module_url.init();
		Module_securitymode.init();
		Module_runtime.init();
	}
	private static final void init() {
		Structs.init();
		init_hosts();
		init_modules();
	}
	public static void main(String[] args) {
		FlowRuntime.program_args = args;
		main.init();
		Module_main.f_main();
	}
}
