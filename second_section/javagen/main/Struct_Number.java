// HASH COLLISIONS: YES
// timestamp: 1.66685180286E12

package main;

import com.area9innovation.flow.*;

public class Struct_Number extends Struct {
	public double f_num;

	public Struct_Number() {}
	public Struct_Number(double a_num) {
		f_num = a_num;
	}

	public int getTypeId() { return 41; }
	public String getTypeName() { return "Number"; }

	private static final String[] field_names = new String[] {
		"num"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.DOUBLE
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_num
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Number");
		f_num = (Double)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 41) return 41-tmp;
		Struct_Number other = (Struct_Number)other_gen;
		if (f_num != other.f_num)
			return (f_num > other.f_num) ? 1 : -1;
		return 0;
	}
}
