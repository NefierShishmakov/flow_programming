// HASH COLLISIONS: YES
// timestamp: 1.665042225278E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class SingletonStructs {

	// Singleton structs
	static final Object[] arr_empty = new Object[0];
	static final SingletonStruct str_EmptyList = SingletonStruct.make(1,"EmptyList");
	static final SingletonStruct str_EmptyPopResult = SingletonStruct.make(2,"EmptyPopResult");
	static final SingletonStruct str_IllegalStruct = SingletonStruct.make(3,"IllegalStruct");
	static final SingletonStruct str_None = SingletonStruct.make(5,"None");
	static final SingletonStruct str_TreeEmpty = SingletonStruct.make(11,"TreeEmpty");
}
