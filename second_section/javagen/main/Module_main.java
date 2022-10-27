// HASH COLLISIONS: YES
// timestamp: 1.666851798E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_main {
	public static final String f_astToRPN(Struct aexp_0) {
		TAIL_CALL: for(;;) {
			Struct l0__tmp = aexp_0;
			switch (l0__tmp.getTypeId()) {
			case 8/*Add*/: {
				final Struct_Add l1__tmp = (Struct_Add)l0__tmp;
				final Struct l2_l = l1__tmp.f_left;
				final Struct l3_r = l1__tmp.f_right;
				final Struct l4_l = l1__tmp.f_left;
				final Struct l5_r = l1__tmp.f_right;
				return Module_string.f_concatStrings((new Object[] { Module_main.f_astToRPN(l4_l), Module_main.f_astToRPN(l5_r), "+ " }));
			}
			case 105/*Subtract*/: {
				final Struct_Subtract l1__tmp = (Struct_Subtract)l0__tmp;
				final Struct l6_l = l1__tmp.f_left;
				final Struct l7_r = l1__tmp.f_right;
				final Struct l8_l = l1__tmp.f_left;
				final Struct l9_r = l1__tmp.f_right;
				return Module_string.f_concatStrings((new Object[] { Module_main.f_astToRPN(l8_l), Module_main.f_astToRPN(l9_r), "- " }));
			}
			case 37/*Multiply*/: {
				final Struct_Multiply l1__tmp = (Struct_Multiply)l0__tmp;
				final Struct l10_l = l1__tmp.f_left;
				final Struct l11_r = l1__tmp.f_right;
				final Struct l12_l = l1__tmp.f_left;
				final Struct l13_r = l1__tmp.f_right;
				return Module_string.f_concatStrings((new Object[] { Module_main.f_astToRPN(l12_l), Module_main.f_astToRPN(l13_r), "* " }));
			}
			case 16/*Divide*/: {
				final Struct_Divide l1__tmp = (Struct_Divide)l0__tmp;
				final Struct l14_l = l1__tmp.f_left;
				final Struct l15_r = l1__tmp.f_right;
				final Struct l16_l = l1__tmp.f_left;
				final Struct l17_r = l1__tmp.f_right;
				return Module_string.f_concatStrings((new Object[] { Module_main.f_astToRPN(l16_l), Module_main.f_astToRPN(l17_r), "/ " }));
			}
			case 94/*Power*/: {
				final Struct_Power l1__tmp = (Struct_Power)l0__tmp;
				final Struct l18_l = l1__tmp.f_left;
				final Struct_Number l19_r = l1__tmp.f_right;
				final Struct l20_l = l1__tmp.f_left;
				final Struct_Number l21_r = l1__tmp.f_right;
				return Module_string.f_concatStrings((new Object[] { Module_main.f_astToRPN(l20_l), Module_main.f_astToRPN(l21_r), "^ " }));
			}
			case 39/*Negative*/: {
				final Struct_Negative l1__tmp = (Struct_Negative)l0__tmp;
				final Struct l22_v = l1__tmp.f_exp;
				final Struct l23_v = l1__tmp.f_exp;
				{
					final Struct l24___tmp = l23_v;
					aexp_0 = l24___tmp;
					continue TAIL_CALL;
				}
			}
			case 41/*Number*/: {
				final Struct_Number l1__tmp = (Struct_Number)l0__tmp;
				final double l25_num = l1__tmp.f_num;
				final double l26_num = l1__tmp.f_num;
				return Module_string.f_concatStrings((new Object[] { Module_string.f_d2s(l26_num), " " }));
			}
			case 110/*Variable*/: {
				final Struct_Variable l1__tmp = (Struct_Variable)l0__tmp;
				final String l27_v = l1__tmp.f_var;
				final String l28_v = l1__tmp.f_var;
				return Module_string.f_concatStrings((new Object[] { l28_v, " " }));
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
		}
	public static final Struct f_calculate(Struct aexp_0, Struct aVariables) {
			final Struct l1_Variables = aVariables;
			final Func3<Struct,Struct, Struct, Func2<Struct,Double, Double>> l0_getValue = (Func3<Struct, Struct, Struct, Func2<Struct,Double, Double>>)(Struct al, Struct ar, Func2<Struct,Double, Double> aoperator) -> {
				final Struct l1_gsymswitch0 = Module_main.f_calculate(al, l1_Variables);
				Struct l2__tmp = l1_gsymswitch0;
				switch (l2__tmp.getTypeId()) {
				case 103/*Some*/: {
					final Struct_Some l3__tmp = (Struct_Some)l2__tmp;
					final Object l4_left = l3__tmp.f_value;
					final double l5_left = ((double)l3__tmp.f_value);
					final Struct l6_gsymswitch1 = Module_main.f_calculate(ar, l1_Variables);
					Struct l7__tmp = l6_gsymswitch1;
					switch (l7__tmp.getTypeId()) {
					case 103/*Some*/: {
						final Struct_Some l8__tmp = (Struct_Some)l7__tmp;
						final Object l9_right = l8__tmp.f_value;
						final double l10_right = ((double)l8__tmp.f_value);
						return aoperator.invoke(((Double)l5_left), ((Double)l10_right));
					}
					case 40/*None*/: {
						return ((Struct)SingletonStructs.str_None);
					}
					default:
						throw new RuntimeException("Unexpected struct in switch: "+l7__tmp.getTypeName());
					}
				}
				case 40/*None*/: {
					return ((Struct)SingletonStructs.str_None);
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l2__tmp.getTypeName());
				}
			};
			final Func2<Struct,Double, Double> l2_div = (Func2<Struct, Double, Double>)(Double aleft, Double aright) -> {
				if ((((double)aright)==0.0)) {
					return ((Struct)SingletonStructs.str_None);
				} else {
					return (new Struct_Some((((double)aleft)/((double)aright))));
				}
			};
			Struct l3__tmp = aexp_0;
			switch (l3__tmp.getTypeId()) {
			case 8/*Add*/: {
				final Struct_Add l4__tmp = (Struct_Add)l3__tmp;
				final Struct l5_l = l4__tmp.f_left;
				final Struct l6_r = l4__tmp.f_right;
				final Struct l7_l = l4__tmp.f_left;
				final Struct l8_r = l4__tmp.f_right;
				final Func2<Struct_Some,Double, Double> l10_$9 = (Func2<Struct_Some, Double, Double>)(Double aleft, Double aright) -> {
					return (new Struct_Some((((double)aleft)+((double)aright))));
				};
				return l0_getValue.invoke(l7_l, l8_r, ((Func2<Struct,Double, Double>)(Func2)l10_$9));
			}
			case 105/*Subtract*/: {
				final Struct_Subtract l4__tmp = (Struct_Subtract)l3__tmp;
				final Struct l11_l = l4__tmp.f_left;
				final Struct l12_r = l4__tmp.f_right;
				final Struct l13_l = l4__tmp.f_left;
				final Struct l14_r = l4__tmp.f_right;
				final Func2<Struct_Some,Double, Double> l16_$15 = (Func2<Struct_Some, Double, Double>)(Double aleft, Double aright) -> {
					return (new Struct_Some((((double)aleft)-((double)aright))));
				};
				return l0_getValue.invoke(l13_l, l14_r, ((Func2<Struct,Double, Double>)(Func2)l16_$15));
			}
			case 37/*Multiply*/: {
				final Struct_Multiply l4__tmp = (Struct_Multiply)l3__tmp;
				final Struct l17_l = l4__tmp.f_left;
				final Struct l18_r = l4__tmp.f_right;
				final Struct l19_l = l4__tmp.f_left;
				final Struct l20_r = l4__tmp.f_right;
				final Func2<Struct_Some,Double, Double> l22_$21 = (Func2<Struct_Some, Double, Double>)(Double aleft, Double aright) -> {
					return (new Struct_Some((((double)aleft)*((double)aright))));
				};
				return l0_getValue.invoke(l19_l, l20_r, ((Func2<Struct,Double, Double>)(Func2)l22_$21));
			}
			case 16/*Divide*/: {
				final Struct_Divide l4__tmp = (Struct_Divide)l3__tmp;
				final Struct l23_l = l4__tmp.f_left;
				final Struct l24_r = l4__tmp.f_right;
				final Struct l25_l = l4__tmp.f_left;
				final Struct l26_r = l4__tmp.f_right;
				return l0_getValue.invoke(l25_l, l26_r, l2_div);
			}
			case 94/*Power*/: {
				final Struct_Power l4__tmp = (Struct_Power)l3__tmp;
				final Struct l27_l = l4__tmp.f_left;
				final Struct_Number l28_r = l4__tmp.f_right;
				final Struct l29_l = l4__tmp.f_left;
				final Struct_Number l30_r = l4__tmp.f_right;
				final Func2<Struct,Double, Double> l32_$31 = (Func2<Struct, Double, Double>)(Double aleft, Double aright) -> {
					return Module_math.f_dpow2(((double)aleft), ((double)aright));
				};
				return l0_getValue.invoke(l29_l, l30_r, l32_$31);
			}
			case 39/*Negative*/: {
				final Struct_Negative l4__tmp = (Struct_Negative)l3__tmp;
				final Struct l33_e = l4__tmp.f_exp;
				final Struct l34_e = l4__tmp.f_exp;
				final Struct l35_gsymswitch2 = Module_main.f_calculate(l34_e, aVariables);
				Struct l36__tmp = l35_gsymswitch2;
				switch (l36__tmp.getTypeId()) {
				case 103/*Some*/: {
					final Struct_Some l37__tmp = (Struct_Some)l36__tmp;
					final Object l38_value = l37__tmp.f_value;
					final double l39_value = ((double)l37__tmp.f_value);
					return (new Struct_Some((-l39_value)));
				}
				case 40/*None*/: {
					return ((Struct)SingletonStructs.str_None);
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l36__tmp.getTypeName());
				}
			}
			case 41/*Number*/: {
				final Struct_Number l4__tmp = (Struct_Number)l3__tmp;
				final double l40_num = l4__tmp.f_num;
				final double l41_num = l4__tmp.f_num;
				return (new Struct_Some(l41_num));
			}
			case 110/*Variable*/: {
				final Struct_Variable l4__tmp = (Struct_Variable)l3__tmp;
				final String l42_name = l4__tmp.f_var;
				final String l43_name = l4__tmp.f_var;
				return Module_tree.f_lookupTree(aVariables, l43_name);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l3__tmp.getTypeName());
			}
		}
	public static final Struct f_derivative(Struct aexp_0, String avar) {
			Struct l0__tmp = aexp_0;
			switch (l0__tmp.getTypeId()) {
			case 8/*Add*/: {
				final Struct_Add l1__tmp = (Struct_Add)l0__tmp;
				final Struct l2_l = l1__tmp.f_left;
				final Struct l3_r = l1__tmp.f_right;
				final Struct l4_l = l1__tmp.f_left;
				final Struct l5_r = l1__tmp.f_right;
				return (new Struct_Add(Module_main.f_derivative(l4_l, avar), Module_main.f_derivative(l5_r, avar)));
			}
			case 105/*Subtract*/: {
				final Struct_Subtract l1__tmp = (Struct_Subtract)l0__tmp;
				final Struct l6_l = l1__tmp.f_left;
				final Struct l7_r = l1__tmp.f_right;
				final Struct l8_l = l1__tmp.f_left;
				final Struct l9_r = l1__tmp.f_right;
				return (new Struct_Subtract(Module_main.f_derivative(l8_l, avar), Module_main.f_derivative(l9_r, avar)));
			}
			case 37/*Multiply*/: {
				final Struct_Multiply l1__tmp = (Struct_Multiply)l0__tmp;
				final Struct l10_l = l1__tmp.f_left;
				final Struct l11_r = l1__tmp.f_right;
				final Struct l12_l = l1__tmp.f_left;
				final Struct l13_r = l1__tmp.f_right;
				return (new Struct_Add((new Struct_Multiply(Module_main.f_derivative(l12_l, avar), l13_r)), (new Struct_Multiply(Module_main.f_derivative(l13_r, avar), l12_l))));
			}
			case 16/*Divide*/: {
				final Struct_Divide l1__tmp = (Struct_Divide)l0__tmp;
				final Struct l14_l = l1__tmp.f_left;
				final Struct l15_r = l1__tmp.f_right;
				final Struct l16_l = l1__tmp.f_left;
				final Struct l17_r = l1__tmp.f_right;
				return (new Struct_Divide((new Struct_Subtract((new Struct_Multiply(Module_main.f_derivative(l16_l, avar), l17_r)), (new Struct_Multiply(Module_main.f_derivative(l17_r, avar), l16_l)))), (new Struct_Power(l17_r, (new Struct_Number(2.0))))));
			}
			case 94/*Power*/: {
				final Struct_Power l1__tmp = (Struct_Power)l0__tmp;
				final Struct l18_l = l1__tmp.f_left;
				final Struct_Number l19_r = l1__tmp.f_right;
				final Struct l20_l = l1__tmp.f_left;
				final Struct_Number l21_r = l1__tmp.f_right;
				return (new Struct_Multiply((new Struct_Power(l20_l, l21_r)), (new Struct_Divide((new Struct_Multiply(l21_r, Module_main.f_derivative(l20_l, avar))), l20_l))));
			}
			case 39/*Negative*/: {
				final Struct_Negative l1__tmp = (Struct_Negative)l0__tmp;
				final Struct l22_e = l1__tmp.f_exp;
				final Struct l23_e = l1__tmp.f_exp;
				return (new Struct_Negative(Module_main.f_derivative(l23_e, avar)));
			}
			case 41/*Number*/: {
				final Struct_Number l1__tmp = (Struct_Number)l0__tmp;
				final double l24_value = l1__tmp.f_num;
				final double l25_value = l1__tmp.f_num;
				return (new Struct_Number(0.0));
			}
			case 110/*Variable*/: {
				final Struct_Variable l1__tmp = (Struct_Variable)l0__tmp;
				final String l26_v = l1__tmp.f_var;
				final String l27_v = l1__tmp.f_var;
				if ((l27_v).equals(avar)) {
					return (new Struct_Number(1.0));
				} else {
					return (new Struct_Number(0.0));
				}
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final String f_expressionToString(Struct aexp_0) {
			Struct l0__tmp = aexp_0;
			switch (l0__tmp.getTypeId()) {
			case 8/*Add*/: {
				final Struct_Add l1__tmp = (Struct_Add)l0__tmp;
				final Struct l2_l = l1__tmp.f_left;
				final Struct l3_r = l1__tmp.f_right;
				final Struct l4_l = l1__tmp.f_left;
				final Struct l5_r = l1__tmp.f_right;
				return (((("("+Module_main.f_expressionToString(l4_l))+"+")+Module_main.f_expressionToString(l5_r))+")");
			}
			case 105/*Subtract*/: {
				final Struct_Subtract l1__tmp = (Struct_Subtract)l0__tmp;
				final Struct l6_l = l1__tmp.f_left;
				final Struct l7_r = l1__tmp.f_right;
				final Struct l8_l = l1__tmp.f_left;
				final Struct l9_r = l1__tmp.f_right;
				return (((("("+Module_main.f_expressionToString(l8_l))+"-")+Module_main.f_expressionToString(l9_r))+")");
			}
			case 37/*Multiply*/: {
				final Struct_Multiply l1__tmp = (Struct_Multiply)l0__tmp;
				final Struct l10_l = l1__tmp.f_left;
				final Struct l11_r = l1__tmp.f_right;
				final Struct l12_l = l1__tmp.f_left;
				final Struct l13_r = l1__tmp.f_right;
				return (((("("+Module_main.f_expressionToString(l12_l))+"*")+Module_main.f_expressionToString(l13_r))+")");
			}
			case 16/*Divide*/: {
				final Struct_Divide l1__tmp = (Struct_Divide)l0__tmp;
				final Struct l14_l = l1__tmp.f_left;
				final Struct l15_r = l1__tmp.f_right;
				final Struct l16_l = l1__tmp.f_left;
				final Struct l17_r = l1__tmp.f_right;
				return (((("("+Module_main.f_expressionToString(l16_l))+"/")+Module_main.f_expressionToString(l17_r))+")");
			}
			case 94/*Power*/: {
				final Struct_Power l1__tmp = (Struct_Power)l0__tmp;
				final Struct l18_l = l1__tmp.f_left;
				final Struct_Number l19_r = l1__tmp.f_right;
				final Struct l20_l = l1__tmp.f_left;
				final Struct_Number l21_r = l1__tmp.f_right;
				return (((("("+Module_main.f_expressionToString(l20_l))+"^")+Module_main.f_expressionToString(l21_r))+")");
			}
			case 39/*Negative*/: {
				final Struct_Negative l1__tmp = (Struct_Negative)l0__tmp;
				final Struct l22_v = l1__tmp.f_exp;
				final Struct l23_v = l1__tmp.f_exp;
				return (("(-"+Module_main.f_expressionToString(l23_v))+")");
			}
			case 41/*Number*/: {
				final Struct_Number l1__tmp = (Struct_Number)l0__tmp;
				final double l24_num = l1__tmp.f_num;
				final double l25_num = l1__tmp.f_num;
				return Module_string.f_d2s(l25_num);
			}
			case 110/*Variable*/: {
				final Struct_Variable l1__tmp = (Struct_Variable)l0__tmp;
				final String l26_v = l1__tmp.f_var;
				final String l27_v = l1__tmp.f_var;
				return l27_v;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct f_getVariables() {
			final Object[] l0_parameters_array = Native.getAllUrlParameters();
			final Struct l3_$2 = Module_tree.f_makeTree();
			final Func2<Struct,Struct, Object[]> l4_$1 = (Func2<Struct, Struct, Object[]>)(Struct atree, Object[] aparameter) -> {
				return Module_tree.f_setTree(atree, ((String)(aparameter[0])), Module_math.f_s2d(((String)(aparameter[1]))));
			};
			return ((Struct)Native.fold(l0_parameters_array, l3_$2, ((Func2<Object,Object, Object>)(Func2)l4_$1)));
		}
	public static final Object[] f_lingoGrammar() {
			return Module_driver.f_compilePegGrammar("exp = num | sub | mult | add | div | var | pow | neg;\n\nadd     = \"(\" ws exp:l ws \"+\" ws exp:r ws \")\"       { Add(:l, :r) };\nsub     = \"(\" ws exp:l ws \"-\" ws exp:r ws \")\"       { Subtract(:l, :r) };\nmult    = \"(\" ws exp:l ws \"*\" ws exp:r ws \")\"       { Multiply(:l, :r) };\ndiv     = \"(\" ws exp:l ws \"/\" ws exp:r ws \")\"       { Divide(:l, :r) };\npow     = \"(\" ws exp:l ws \"^\" ws exp:r ws \")\"       { Power(:l, :r) };\nneg     = \"(\" ws \"-\" ws exp:e ws \")\"                { Negative(:e) };\n\nvar     = (letter (letter | digit)*) $v            { Variable($v) };\nnum     = (\"-\"? ((digit* \".\" digit+) | digit+)) $d  { Number(s2d($d)) };\n\nletter = 'a'-'z' | 'A'-'Z' | '_';\ndigit = '0'-'9';\nws = ' '*; \n");
		}
	public static final Object f_main() {
			Module_runtime.f_println("Start");
			final String l0_exp_0 = Module_url_parameter.f_getUrlParameterDef("expression", "((6+((3+4)*5))-7)");
			Module_runtime.f_println("");
			Module_runtime.f_println((("Input string expression: "+l0_exp_0)+"\n"));
			final Struct l1_variables = Module_main.f_getVariables();
			final Object l2_ast = Module_parsic.f_parsic(Module_main.f_lingoGrammar(), l0_exp_0, Module_pegaction.g_defaultPegActions);
			Native.print("AST: ");
			Module_runtime.f_println(l2_ast);
			Module_runtime.f_println((("AST to expression string: "+Module_main.f_expressionToString(((Struct)l2_ast)))+"\n"));
			final String l3_rpn = Module_main.f_astToRPN(((Struct)l2_ast));
			Native.print("RPN: ");
			Module_runtime.f_println(l3_rpn);
			Module_main.f_printValue("Calculated value: ", Module_main.f_calculate(((Struct)l2_ast), l1_variables));
			Module_runtime.f_println((("Derivative: "+Module_main.f_expressionToString(Module_main.f_derivative(((Struct)l2_ast), "x")))+"\n"));
			Module_runtime.f_println(("Same actions after simplifying ast"+"\n\n"));
			final Struct l4_simplified = Module_main.f_simplify(((Struct)l2_ast));
			Native.print("AST: ");
			Module_runtime.f_println(l4_simplified);
			Module_runtime.f_println((("AST to expression string: "+Module_main.f_expressionToString(l4_simplified))+"\n"));
			final String l5_new_rpn = Module_main.f_astToRPN(l4_simplified);
			Native.print("RPN: ");
			Module_runtime.f_println(l5_new_rpn);
			Module_main.f_printValue("Calculated value: ", Module_main.f_calculate(l4_simplified, l1_variables));
			Module_runtime.f_println((("Derivative: "+Module_main.f_expressionToString(Module_main.f_derivative(l4_simplified, "x")))+"\n"));
			return Module_runtime.f_println("End");
		}
	public static final Object f_printValue(String aname, Struct avalue) {
			Struct l0__tmp = avalue;
			switch (l0__tmp.getTypeId()) {
			case 103/*Some*/: {
				final Struct_Some l1__tmp = (Struct_Some)l0__tmp;
				final Object l2_v = l1__tmp.f_value;
				final double l3_v = ((double)l1__tmp.f_value);
				return Module_runtime.f_println(((aname+Module_string.f_d2s(l3_v))+"\n"));
			}
			case 40/*None*/: {
				return Module_runtime.f_println(((aname+"None")+"\n"));
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct f_simplify(Struct aexp_0) {
			Struct l0__tmp = aexp_0;
			switch (l0__tmp.getTypeId()) {
			case 8/*Add*/: {
				final Struct_Add l1__tmp = (Struct_Add)l0__tmp;
				final Struct l2_l = l1__tmp.f_left;
				final Struct l3_r = l1__tmp.f_right;
				final Struct l4_l = l1__tmp.f_left;
				final Struct l5_r = l1__tmp.f_right;
				final Struct l6_left = Module_main.f_simplify(l4_l);
				final Struct l7_right = Module_main.f_simplify(l5_r);
				if ((FlowRuntime.compareEqual(l6_left,(new Struct_Number(0.0)))&&FlowRuntime.compareEqual(l7_right,(new Struct_Number(0.0))))) {
					return (new Struct_Number(0.0));
				} else {
					if (FlowRuntime.compareEqual(l6_left,(new Struct_Number(0.0)))) {
						return l7_right;
					} else {
						if (FlowRuntime.compareEqual(l7_right,(new Struct_Number(0.0)))) {
							return l6_left;
						} else {
							Struct l8__tmp = l7_right;
							switch (l8__tmp.getTypeId()) {
							case 39/*Negative*/: {
								final Struct_Negative l9__tmp = (Struct_Negative)l8__tmp;
								final Struct l10_v = l9__tmp.f_exp;
								final Struct l11_v = l9__tmp.f_exp;
								return (new Struct_Subtract(l6_left, l11_v));
							}
							default: {
								return (new Struct_Add(l6_left, l7_right));
							}
							}
						}
					}
				}
			}
			case 105/*Subtract*/: {
				final Struct_Subtract l1__tmp = (Struct_Subtract)l0__tmp;
				final Struct l12_l = l1__tmp.f_left;
				final Struct l13_r = l1__tmp.f_right;
				final Struct l14_l = l1__tmp.f_left;
				final Struct l15_r = l1__tmp.f_right;
				final Struct l16_left = Module_main.f_simplify(l14_l);
				final Struct l17_right = Module_main.f_simplify(l15_r);
				if ((FlowRuntime.compareEqual(l16_left,(new Struct_Number(0.0)))&&FlowRuntime.compareEqual(l17_right,(new Struct_Number(0.0))))) {
					return (new Struct_Number(0.0));
				} else {
					if (FlowRuntime.compareEqual(l16_left,(new Struct_Number(0.0)))) {
						return (new Struct_Negative(l17_right));
					} else {
						if (FlowRuntime.compareEqual(l17_right,(new Struct_Number(0.0)))) {
							return l16_left;
						} else {
							Struct l18__tmp = l17_right;
							switch (l18__tmp.getTypeId()) {
							case 39/*Negative*/: {
								final Struct_Negative l19__tmp = (Struct_Negative)l18__tmp;
								final Struct l20_v = l19__tmp.f_exp;
								final Struct l21_v = l19__tmp.f_exp;
								return (new Struct_Add(l16_left, l21_v));
							}
							default: {
								return (new Struct_Subtract(l16_left, l17_right));
							}
							}
						}
					}
				}
			}
			case 37/*Multiply*/: {
				final Struct_Multiply l1__tmp = (Struct_Multiply)l0__tmp;
				final Struct l22_l = l1__tmp.f_left;
				final Struct l23_r = l1__tmp.f_right;
				final Struct l24_l = l1__tmp.f_left;
				final Struct l25_r = l1__tmp.f_right;
				final Struct l26_left = Module_main.f_simplify(l24_l);
				final Struct l27_right = Module_main.f_simplify(l25_r);
				if (FlowRuntime.compareEqual(l26_left,(new Struct_Number(1.0)))) {
					return l27_right;
				} else {
					if (FlowRuntime.compareEqual(l27_right,(new Struct_Number(1.0)))) {
						return l26_left;
					} else {
						if ((FlowRuntime.compareEqual(l26_left,(new Struct_Number(0.0)))||FlowRuntime.compareEqual(l27_right,(new Struct_Number(0.0))))) {
							return (new Struct_Number(0.0));
						} else {
							if (FlowRuntime.compareEqual(l27_right,l26_left)) {
								return (new Struct_Power(l27_right, (new Struct_Number(2.0))));
							} else {
								return (new Struct_Multiply(l26_left, l27_right));
							}
						}
					}
				}
			}
			case 16/*Divide*/: {
				final Struct_Divide l1__tmp = (Struct_Divide)l0__tmp;
				final Struct l28_l = l1__tmp.f_left;
				final Struct l29_r = l1__tmp.f_right;
				final Struct l30_l = l1__tmp.f_left;
				final Struct l31_r = l1__tmp.f_right;
				final Struct l32_left = Module_main.f_simplify(l30_l);
				final Struct l33_right = Module_main.f_simplify(l31_r);
				if (FlowRuntime.compareEqual(l33_right,(new Struct_Number(0.0)))) {
					return (new Struct_Divide(l32_left, l33_right));
				} else {
					if ((FlowRuntime.compareEqual(l32_left,(new Struct_Number(0.0)))&&(!FlowRuntime.compareEqual(l33_right,(new Struct_Number(0.0)))))) {
						return (new Struct_Number(0.0));
					} else {
						if (FlowRuntime.compareEqual(l33_right,(new Struct_Number(1.0)))) {
							return l32_left;
						} else {
							if (FlowRuntime.compareEqual(l33_right,l32_left)) {
								return (new Struct_Number(1.0));
							} else {
								return (new Struct_Divide(l32_left, l33_right));
							}
						}
					}
				}
			}
			case 94/*Power*/: {
				final Struct_Power l1__tmp = (Struct_Power)l0__tmp;
				final Struct l34_l = l1__tmp.f_left;
				final Struct_Number l35_r = l1__tmp.f_right;
				final Struct l36_l = l1__tmp.f_left;
				final Struct_Number l37_r = l1__tmp.f_right;
				final Struct l38_left = Module_main.f_simplify(l36_l);
				if (FlowRuntime.compareEqual(l37_r,(new Struct_Number(0.0)))) {
					return (new Struct_Number(1.0));
				} else {
					if ((FlowRuntime.compareEqual(l38_left,(new Struct_Number(0.0)))&&(!FlowRuntime.compareEqual(l37_r,(new Struct_Number(0.0)))))) {
						return (new Struct_Number(0.0));
					} else {
						return (new Struct_Power(l38_left, l37_r));
					}
				}
			}
			case 39/*Negative*/: {
				final Struct_Negative l1__tmp = (Struct_Negative)l0__tmp;
				final Struct l39_e = l1__tmp.f_exp;
				final Struct l40_e = l1__tmp.f_exp;
				final Struct l41_simplified = Module_main.f_simplify(l40_e);
				Struct l42__tmp = l41_simplified;
				switch (l42__tmp.getTypeId()) {
				case 39/*Negative*/: {
					final Struct_Negative l43__tmp = (Struct_Negative)l42__tmp;
					final Struct l44_ex = l43__tmp.f_exp;
					final Struct l45_ex = l43__tmp.f_exp;
					return l45_ex;
				}
				default: {
					if (FlowRuntime.compareEqual(l41_simplified,(new Struct_Number(0.0)))) {
						return (new Struct_Number(0.0));
					} else {
						return (new Struct_Negative(l41_simplified));
					}
				}
				}
			}
			default: {
				return aexp_0;
			}
			}
		}
}
