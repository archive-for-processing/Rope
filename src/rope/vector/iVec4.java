/**
* ivec4 class
* v 1.1.2
* 2015-2020
* Processing 3.5.3
* Vector class with a float precision
* @author @stanlepunk
* @see http://stanlepunk.xyz/
* @see https://github.com/StanLepunK/Rope
*/
package rope.vector;
public class ivec4 extends ivec {
  public ivec4() {
  	super(4);
  	set(0,0,0,0);
  }
  
  public ivec4(int v) {
  	super(4);
  	set(v,v,v,v);
  }
  
  public ivec4(int x, int y, int z, int w) {
    super(4);
    set(x,y,z,w);
  }

  public ivec4(ivec v) {
    super(4);
    set(v);
  }

  public ivec4(int [] source) {
    super(4);
    set(source); 
  }
  
  
  /**
   * set
   * @param x
   * @param y
   * @param z
   * @param w
   * @return
   */
  public ivec4 set(int x, int y, int z, int w) {
  	this.x = this.s = x;
  	this.y = this.t = y;
  	this.z = this.p = z;
  	this.w = this.q = w;
  	return this;
  }
  
  public ivec4 set(int arg){
    set(arg,arg,arg,arg);
    return this;
  }

  public ivec4 set(ivec v) {
    if(v == null) {
      this.x = this.y = this.z = this.w = 0;
    } else {
      set(v.x,v.y,v.z,v.w);
    }
    return this;
  }

  public ivec4 set(vec v) {
    if(v == null) {
      this.x  = this.y = this.z = this.w = 0;
    } else {
      set((int)v.x,(int)v.y,(int)v.z,(int)v.w);
    }
    return this;
  }
  
  public ivec4 set(int[] source) {
    if(source.length == 1) {
      set(source[0],this.y,this.z,this.w);
    } else if(source.length == 2) {
      set(source[0],source[1],this.z,this.w);
    } else if(source.length == 3) {
      set(source[0],source[1],source[2],this.w);
    } else if(source.length == 4) {
      set(source[0],source[1],source[2],source[3]);
    } else if(source.length > 4) {
      set(source[0],source[1],source[2],source[3]);
    }
    return this;
  }

  // xyzw
  public ivec4 x(int x) {
    return set(x,this.y,this.z,this.w);
  }

  public ivec4 y(int y) {
    return set(this.x,y,this.z,this.w);
  }

  public ivec4 z(int z) {
    return set(this.x,this.y,z,this.w);
  }

  public ivec4 w(int w) {
    return set(this.x,this.y,this.z,w);
  }

  // rgba
  public ivec4 r(int x) {
    return set(x,this.y,this.z,this.w);
  }

  public ivec4 g(int y) {
    return set(this.x,y,this.z,this.w);
  }

  public ivec4 b(int z) {
    return set(this.x,this.y,z,this.w);
  }

  public ivec4 a(int w) {
    return set(this.x,this.y,this.z,w);
  }

  // stpq
  public ivec4 s(int x) {
    return set(x,this.y,this.z,this.w);
  }

  public ivec4 t(int y) {
    return set(this.x,y,this.z,this.w);
  }

  public ivec4 p(int z) {
    return set(this.x,this.y,z,this.w);
  }

  public ivec4 q(int w) {
    return set(this.x,this.y,this.z,w);
  }
  
  /**
   * sum
   * @return
   */
  public int sum() {
    return x+y+z+w;
  }
  
  
  /**
   * mult
   * @param mx
   * @param my
   * @param mz
   * @param mw
   * @return
   */
  public ivec4 mult(int mx, int my, int mz, int mw) {
    x *= mx ; y *= my ; z *= mz ; w *= mw;
    set(x,y,z,w);
    return this;
  }

  public ivec4 mult(int m) {
    return mult(m,m,m,m);
  }

  public ivec4 mult(ivec v) {
    if(v != null) {
      return mult(v.x,v.y,v.z,v.w);
    } else return null ;
  }
  
  
  /**
   * div
   * @param dx
   * @param dy
   * @param dz
   * @param dw
   * @return
   */
  public ivec4 div(int dx, int dy, int dz, int dw) {
    if(dx != 0) x /= dx; 
    if(dy != 0) y /= dy; 
    if(dz != 0) z /= dz; 
    if(dw != 0) w /= dw;
    set(x,y,z,w);
    return this;
  }
  
  public ivec4 div(int d) {
    return div(d,d,d,d);
  }
  
  public ivec4 div(ivec v) {
    if(v != null) {
      return div(v.x,v.y,v.z,v.w);
    } else return null;
  }
  
  /**
   * add
   * @param ax
   * @param ay
   * @param az
   * @param aw
   * @return
   */
  public ivec4 add(int ax,int ay,int az,int aw) {
    x += ax;
    y += ay;
    z += az;
    w += aw;
    set(x,y,z,w);
    return this;
  }

  public ivec4 add(int a) {
    return add(a,a,a,a);
  }

  public ivec4 add(ivec v) {
    if(v != null) {
      return add(v.x,v.y,v.z,v.w);
    } else return null;
  }
  
  
  /**
   * sub
   * @param ax
   * @param ay
   * @param az
   * @param aw
   * @return
   */
  public ivec4 sub(int ax,int ay,int az, int aw) {
    x -= ax;
    y -= ay;
    z -= az;
    w -= aw; 
    set(x,y,z,w);
    return this;
  }

  public ivec4 sub(int a) {
    return sub(a,a,a,a);
  }

  public ivec4 sub(ivec v) {
    if(v != null) {
      return sub(v.x,v.y,v.z,v.w);
    } else return null;
  }
  
  
  
  /**
   * Constrains a value to not exceed a maximum and minimum value. 
   * @param min
   * @param max
   * @return
   */
	public ivec4 constrain(int min, int max) {
		return constrain(new ivec4(min), new ivec4(max));
	}
  
	/**
	 * Constrains a value to not exceed a maximum and minimum value. 
	 * @param min
	 * @param max
	 * @return
	 */
	public ivec4 constrain(ivec4 min, ivec4 max) {
		if(x < min.x()) {
			x = min.x();
		}

		if(y < min.y()) {
			y = min.y();
		}
		
		if(z < min.z()) {
			z = min.z();
		}
		
		if(w < min.w()) {
			w = min.w();
		}

		if(x > max.x()) {
			x = max.x();
		}

		if(y > max.y()) {
			y = max.y();
		}
		
		if(z > max.z()) {
			z = max.z();
		}
		
		if(w > max.w()) {
			w = max.w();
		}
		
		set(x,y,z,w);
		return this;
	}
  
  
  /**
   * equals
   * @param target
   * @return
   */
  public boolean equals(ivec4 target) {
    if(target != null ) {
      if((x == target.x) && (y == target.y) && (z == target.z) && (w == target.w)) {
        return true; 
      } else return false;
    } else return false;
  }

  public boolean equals(int target) {
    if((x == target) && (y == target) && (z == target) && (w == target)) 
    return true; 
    else return false;
  }
  
  public boolean equals(int tx, int ty, int tz, int tw) {
    if((x == tx) && (y == ty) && (z == tz) && (w == tw)) 
    return true; 
    else return false;
  }



  /**
   * random
   * @param max int
   * @return
   */
  public ivec4 rand(int max) {
    return rand(0,max);
  }
  /**
   * random
   * @param min int
   * @param max int
   * @return
   */
  public ivec4 rand(int min, int max) {
    x = (int)random(min,max);
    y = (int)random(min,max);
    z = (int)random(min,max);
    w = (int)random(min,max);
    set(x,y,z,w);
    return this;
  }
    /**
   * random
   * @param mx vec2
   * @param my vec2
   * @param mz vec2
   * @param mw vec2
   * @return
   */
  public ivec4 rand(ivec4 min, ivec4 max) {
    x = (int)random(min.x(),max.x());
    y = (int)random(min.y(),max.y());
    z = (int)random(min.z(),max.z());
    w = (int)random(min.w(),max.w());
    set(x,y,z,w);
    return this;
  }

  
  /**
   * copy
   * @return
   */
  public ivec4 copy() {
    return new ivec4(x,y,z,w) ;
  }
  
  
  @Override 
  public String toString() {
    return "[ " + x + ", " + y + ", " + z + ", " + w + " ]" ;
  }

}
