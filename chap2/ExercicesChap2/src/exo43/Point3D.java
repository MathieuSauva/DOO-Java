package exo43;

public class Point3D extends Point2D {
	private float z;
	
	public Point3D(float x, float y, float z) {
		super(x,y);
		this.z = z;
	}
	
	public Point3D() {
		this(0.0f, 0.0f, 0.0f);
	}
	
	public float getZ() {
		return z;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	
    public void setXYZ(float x, float y, float z) {
        setX(x);     // or super.setX(x), use setter in superclass
        setY(y);
        this.z = z;
     }
    
	public float[] getXYZ() {
	       float[] result = new float[3];  // construct an array of 2 elements
	       result[0] = super.getX();
	       result[1] = super.getY();
	       result[2] = z;
	       return result;  // return the array
	    }
	
	public String toString() {
		return "("+super.getX()+","+super.getY()+","+z+")";
	}
}
