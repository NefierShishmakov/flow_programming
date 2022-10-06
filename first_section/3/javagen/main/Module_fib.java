// HASH COLLISIONS: YES
// timestamp: 1.663414115E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_fib {
	public static final Object[] f_fibRecursion(int an) {
			if ((an<=0)) {
				return SingletonStructs.arr_empty;
			} else {
				if ((an==1)) {
					return (new Object[] { 0 });
				} else {
					if ((an==2)) {
						return (new Object[] { 0, 1 });
					} else {
						final Object[] l0_f = Module_fib.f_fibRecursion((an-1));
						return Native.concat(l0_f, (new Object[] { (((int)(l0_f[(an-3)]))+((int)(l0_f[(an-2)]))) }));
					}
				}
			}
		}
	public static final Object[] f_fibRefArray(int an) {
			if ((an<=0)) {
				return SingletonStructs.arr_empty;
			} else {
				if ((an==1)) {
					return (new Object[] { 0 });
				} else {
					final Reference<Object[]> l0_f = ((Reference<Object[]>)(new Reference((new Object[] { 0, 1 }))));
					Module_fib.f_fibRefArrayHelp(l0_f, an);
					return l0_f.value;
				}
			}
		}
	public static final Object f_fibRefArrayHelp(Reference<Object[]> af, int an) {
			if ((Native.length(af.value)!=an)) {
				Module_fib.f_fibRefArrayHelp(af, (an-1));
				return Module_array.f_refArrayPush(af, (((int)(af.value[(an-3)]))+((int)(af.value[(an-2)]))));
			} else {
				return null;
			}
		}
	public static final Object[] f_fibTailRecursion(int an) {
			if ((an<=0)) {
				return SingletonStructs.arr_empty;
			} else {
				if ((an==1)) {
					return (new Object[] { 0 });
				} else {
					return Module_fib.f_fibTailRecursionHelp((new Object[] { 0, 1 }), 2, an);
				}
			}
		}
	public static final Object[] f_fibTailRecursionHelp(Object[] af, int acurr, int an) {
		TAIL_CALL: for(;;) {
			if ((acurr==an)) {
				return af;
			} else {
				{
					final Object[] l0___tmp = Native.concat(af, (new Object[] { (((int)(af[(acurr-2)]))+((int)(af[(acurr-1)]))) }));
					final int l1___tmp = (acurr+1);
					af = l0___tmp;
					acurr = l1___tmp;
					continue TAIL_CALL;
				}
			}
		}
		}
}
