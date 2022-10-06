// HASH COLLISIONS: YES
// timestamp: 1.66504222E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_index {
	public static final Object[] f_inds(Object[] aarr, int am) {
			final Struct l2_$1 = Module_tree.f_makeTree();
			final Func3<Struct,Integer, Struct, Integer> l3_$0 = (Func3<Struct, Integer, Struct, Integer>)(Integer aindex, Struct ainit, Integer avalue) -> {
				final Struct l4_ind_arr = Module_tree.f_lookupTree(ainit, avalue);
				Struct l5__tmp = l4_ind_arr;
				switch (l5__tmp.getTypeId()) {
				case 5/*None*/: {
					return Module_tree.f_setTree(ainit, avalue, (new Object[] { aindex }));
				}
				case 10/*Some*/: {
					final Struct_Some l6__tmp = (Struct_Some)l5__tmp;
					final Object l7_y = l6__tmp.f_value;
					final Object[] l8_y = ((Object[])l6__tmp.f_value);
					return Module_tree.f_setTree(ainit, avalue, Native.concat(l8_y, (new Object[] { aindex })));
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l5__tmp.getTypeName());
				}
			};
			final Struct l4_tree = ((Struct)Native.foldi(aarr, l2_$1, ((Func3<Object,Integer, Object, Object>)(Func3)l3_$0)));
			final Object[] l7_$6 = SingletonStructs.arr_empty;
			final int l9_m = am;
			final Func3<Object[],Integer, Object[], Integer> l8_$5 = (Func3<Object[], Integer, Object[], Integer>)(Integer aindex, Object[] aacc, Integer ax) -> {
				final Struct l9_ind = Module_tree.f_lookupTree(l4_tree, (l9_m-((int)ax)));
				Struct l10__tmp = l9_ind;
				switch (l10__tmp.getTypeId()) {
				case 5/*None*/: {
					return aacc;
				}
				case 10/*Some*/: {
					final Struct_Some l11__tmp = (Struct_Some)l10__tmp;
					final Object l12_y = l11__tmp.f_value;
					final Object[] l13_y = ((Object[])l11__tmp.f_value);
					final Object[] l16_$15 = SingletonStructs.arr_empty;
					final Func2<Object[],Object[], Integer> l17_$14 = (Func2<Object[], Object[], Integer>)(Object[] atmp, Integer avalue) -> {
						if ((((int)avalue)!=((int)aindex))) {
							return Native.concat(atmp, (new Object[] { (new Struct_Pair(avalue, aindex)) }));
						} else {
							return atmp;
						}
					};
					return Native.concat(aacc, ((Object[])Native.fold(l13_y, l16_$15, ((Func2<Object,Object, Object>)(Func2)l17_$14))));
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l10__tmp.getTypeName());
				}
			};
			return ((Object[])Native.foldi(aarr, l7_$6, ((Func3<Object,Integer, Object, Object>)(Func3)l8_$5)));
		}
	public static final Object[] f_indsEasyVersion(Object[] aarray, int am) {
			final Object[] l0_resArray = SingletonStructs.arr_empty;
			final int l3_m = am;
			final Object[] l4_array = aarray;
			final Func3<Object[],Integer, Object[], Integer> l2_$1 = (Func3<Object[], Integer, Object[], Integer>)(Integer ai, Object[] apairs, Integer aa_i) -> {
				final Func3<Object[],Integer, Object[], Integer> l4_$3 = (Func3<Object[], Integer, Object[], Integer>)(Integer aj, Object[] apairs2, Integer aa_j) -> {
					if (((((int)ai)!=((int)aj))&&((((int)aa_i)+((int)aa_j))==l3_m))) {
						return Native.concat(apairs2, (new Object[] { (new Struct_Pair(ai, aj)) }));
					} else {
						return apairs2;
					}
				};
				return ((Object[])Native.foldi(l4_array, apairs, ((Func3<Object,Integer, Object, Object>)(Func3)l4_$3)));
			};
			return ((Object[])Native.foldi(aarray, l0_resArray, ((Func3<Object,Integer, Object, Object>)(Func3)l2_$1)));
		}
}
