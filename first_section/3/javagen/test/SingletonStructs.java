// HASH COLLISIONS: YES
// timestamp: 1.663412809611E12

package test;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class SingletonStructs {

	// Singleton structs
	static final Object[] arr_empty = new Object[0];
	static final SingletonStruct str_EmptyList = SingletonStruct.make(1,"EmptyList");
	static final SingletonStruct str_IllegalStruct = SingletonStruct.make(2,"IllegalStruct");
	static final SingletonStruct str_None = SingletonStruct.make(4,"None");
}
