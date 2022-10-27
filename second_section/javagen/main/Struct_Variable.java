// HASH COLLISIONS: YES
// timestamp: 1.66685180288E12

package main;

import com.area9innovation.flow.*;

public class Struct_Variable extends Struct {
	public String f_var;

	public Struct_Variable() {}
	public Struct_Variable(String a_var) {
		f_var = a_var;
	}

	public int getTypeId() { return 110; }
	public String getTypeName() { return "Variable"; }

	private static final String[] field_names = new String[] {
		"var"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_var
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Variable");
		f_var = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 110) return 110-tmp;
		Struct_Variable other = (Struct_Variable)other_gen;
		tmp = f_var.compareTo(other.f_var);
		return tmp;
	}
}
