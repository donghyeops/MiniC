
public class Variable {
	public String type;
	public Object value;
	
	public Variable(String type, Object value) {
		this.type = type;
		this.value = value;
	}
	public static Variable VOID() {
		return new Variable(null, null);
	}
	public Variable setValue(Object inputValue) {
        value = inputValue;
        return this;
    }
	
    public Boolean asBoolean() {
    	if (type.equals("int")) {
    		if (asInt() == 0)
    			return false;
    		else
    			return true;
    	}
    	if (type.equals("double")) {
    		if (asDouble() == 0)
    			return false;
    		else
    			return true;
    	}
        return (Boolean)value;
    }

    public Integer asInt() {
        return (Integer)value;
    }
    
    public Double asDouble() {
    	if (type.equals("int"))
    		return ((Integer)value).doubleValue();
        return (Double)value;
    }
    
    public String asString() {
        return String.valueOf(value);
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Variable that = (Variable)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
