// HASH COLLISIONS: YES
// timestamp: 1.663336022E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_maybe {
	public static final Object f_either(Struct am, Object aalternative) {
			Struct l0__tmp = am;
			switch (l0__tmp.getTypeId()) {
			case 40/*None*/: {
				return aalternative;
			}
			case 103/*Some*/: {
				final Struct_Some l1__tmp = (Struct_Some)l0__tmp;
				final Object l2_v = l1__tmp.f_value;
				final Object l3_v = l1__tmp.f_value;
				return l3_v;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Object f_eitherFn(Struct am, Func1<Object,Object> afn, Func0<Object> aalternativeFn) {
			Struct l0__tmp = am;
			switch (l0__tmp.getTypeId()) {
			case 40/*None*/: {
				return aalternativeFn.invoke();
			}
			case 103/*Some*/: {
				final Struct_Some l1__tmp = (Struct_Some)l0__tmp;
				final Object l2_v = l1__tmp.f_value;
				final Object l3_v = l1__tmp.f_value;
				return afn.invoke(l3_v);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct f_maybeMap(Struct am, Func1<Object,Object> af) {
			Struct l0__tmp = am;
			switch (l0__tmp.getTypeId()) {
			case 40/*None*/: {
				return ((Struct)SingletonStructs.str_None);
			}
			case 103/*Some*/: {
				final Struct_Some l1__tmp = (Struct_Some)l0__tmp;
				final Object l2_v = l1__tmp.f_value;
				final Object l3_v = l1__tmp.f_value;
				return (new Struct_Some(af.invoke(l3_v)));
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
}
