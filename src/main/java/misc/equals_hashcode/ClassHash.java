package misc.equals_hashcode;

/**
 * Created by user on 27.10.2014.
 */
import java.util.Arrays;

public class ClassHash {
	private int intValue;
	
    private boolean booleanValue = true;
    private char charValue = 'd';
    private String stringValue = "TestClass";
    private long longValue = 34829245849498300L;
    private float floatValue = 345832400.93f;
    private double doubleValue = 98584292348454.9834;
    private byte[] arrayValue = {1, 2, 3};

    ClassHash(int intValue) {
		this.intValue = intValue;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassHash)) return false;

        ClassHash classHash = (ClassHash) o;

        if (intValue != classHash.intValue) return false;
        if (booleanValue != classHash.booleanValue) return false;
        if (charValue != classHash.charValue) return false;
        if (Double.compare(classHash.doubleValue, doubleValue) != 0) return false;
        if (Float.compare(classHash.floatValue, floatValue) != 0) return false;
        if (longValue != classHash.longValue) return false;
        if (!Arrays.equals(arrayValue, classHash.arrayValue)) return false;
        if (!stringValue.equals(classHash.stringValue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (booleanValue ? 1 : 0);
        result = 31 * result + intValue;
        result = 31 * result + (int) charValue;
        result = 31 * result + stringValue.hashCode();
        result = 31 * result + (int) (longValue ^ (longValue >>> 32));
        result = 31 * result + (floatValue != +0.0f ? Float.floatToIntBits(floatValue) : 0);
        temp = Double.doubleToLongBits(doubleValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + Arrays.hashCode(arrayValue);
        return result;
    }
}
