package rope.vector;

public class vec3 extends vec {
	// CONSTRUCTOR
  public vec3() {
  	super(3);
  	set(0,0,0);
  }
  
  public vec3(float v) {
  	super(3);
  	set(v,v,v);
  }
	
	public vec3(float x, float y, float z) {
    super(3) ;
    set(x,y,z);
  }
	
	private String warning = "Contructor class Vec3() cannot use the String key_random: ";
	public vec3(String key_random, float r1) {
		super(3);
		if(key_random.equals(RANDOM)) {
			set(random(-r1,r1),random(-r1,r1),random(-r1,r1));
		} else if(key_random.equals(RANDOM_ZERO)) {
			set(random(0,r1),random(0,r1),random(0,r1));
		} else {
      this.x = this.y = this.z  = this.r = this.g = this.b =this.s = this.t = this.p = 0;
      System.out.println(warning+key_random);
		}
	}
	
	public vec3(String key_random, float r1, float r2, float r3) {
		super(3);
		if(key_random.equals(RANDOM)) {
      set(random(-r1,r1),random(-r2,r2),random(-r3,r3));
    } else if(key_random.equals(RANDOM_ZERO)) {
      set(random(0,r1),random(0,r2),random(0,r3));
    } else {
      this.x = this.y = this.z  = this.r = this.g = this.b =this.s = this.t = this.p = 0;
      System.out.println(warning+key_random);
    }
	}
	
	public vec3(String key_random, float a1, float a2, float b1, float b2, float c1, float c2) {
    super(3);
    if(key_random.equals(RANDOM_RANGE)) {
      set(random(a1,a2),random(b1,b2),random(c1,c2));
    } else {
      this.x = this.y = this.z  = this.r = this.g = this.b =this.s = this.t = this.p = 0;
      System.out.println(warning+key_random);
    }
	}
	
	
	/**
	 * set component main method
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
  public vec3 set(float x, float y, float z) {
  	this.x = this.r = this.s = x;
  	this.y = this.g = this.t = y;
  	this.z = this.b = this.p = z;
  	return this;
  }
  
  
  public vec3 set(float v) {
  	set(v,v,v);
  	return this;
  }
  
  
  public vec3 set(vec v) {
    if(v == null) {
      set(0,0,0);
      return this ;
    } else if(v instanceof vec5 || v instanceof vec6) {
      set(v.a,v.b,v.c);
      return this ;
    } else {
      set(v.x,v.y,v.z);
      return this ;
    }
  }
  
  public vec3 set(ivec v) {
    if(v == null) {
      set(0,0,0);
      return this ;
    } else if(v instanceof ivec5 || v instanceof ivec6) {
      set(v.a,v.b,v.c);
      return this ;
    } else {
      set(v.x,v.y,v.z);
      return this ;
    }
  }
  
	public vec3 set_x(float x) {
		return set(x,this.y,this.z);
	}

	public vec3 set_y(float y) {
   return set(this.x,y,this.z);
	}

	public vec3 set_z(float z) {
   return set(this.x,this.y,z);
	}

	// rgb
	public vec3 set_r(float x) {
   return set(x,this.y,this.z);
	}

	public vec3 set_g(float y) {
   return set(this.x,y,this.z);
	}

	public vec3 set_b(float z) {
   return set(this.x,this.y,z);
	}

	// stp
	public vec3 set_s(float x) {
   return set(x,this.y,this.z);
	}

	public vec3 set_t(float y) {
   return set(this.x,y,this.z);
	}

	public vec3 set_p(float z) {
   return set(this.x,this.y,z);
	}
 
  public vec3 set(float[] source) {
    set(source[0],source[1],source[2]);
    return this ;
  }
  
  /**
   * sum
   * @return float component sum
   */
  public float sum() {
    return x+y+z;
  }
  
  /**
   * mult
   * @param m_x
   * @param m_y
   * @param m_z
   * @return
   */
  public vec3 mult(float m_x, float m_y, float m_z) {
    x *= m_x;
    y *= m_y; 
    z *= m_z; 
    set(x,y,z);
    return this;
  }

  public vec3 mult(float m) {
    return mult(m,m,m);
  }
  
  public vec3 mult(vec v) {
    if(v != null) {
      return mult(v.x,v.y,v.z);
    } else return null;   
  }

  public vec3 mult(ivec v) {
    if(v != null) {
      return mult(v.x,v.y,v.z);
    } else return null;   
  }
  
  /**
   * div
   * @param d_x
   * @param d_y
   * @param d_z
   * @return
   */
  public vec3 div(float d_x, float d_y, float d_z) {
    if(d_x != 0) x /= d_x; 
    if(d_y != 0) y /= d_y; 
    if(d_z != 0) z /= d_z; 
    set(x,y,z);
    return this;
  }

  public vec3 div(float d) {
    return div(d,d,d);
  }
  
  public vec3 div(vec v) {
    if(v != null) {
      return div(v.x,v.y,v.z);
    } else return null;   
  }
  
  public vec3 div(ivec v) {
    if(v != null) {
      return div(v.x,v.y,v.z);
    } else return null;   
  }
  
  
  /**
   * add main method
   * @param a_x
   * @param a_y
   * @param a_z
   * @return
   */
  public vec3 add(float a_x,float a_y,float a_z) {
    x += a_x;
    y += a_y;
    z += a_z;
    set(x,y,z);
    return this;
  }
  
  public vec3 add(float a) {
    return add(a,a,a);
  }

  public vec3 add(vec v) {
    if(v != null) {
      return add(v.x,v.y,v.z);
    } return null;
  }

  public vec3 add(ivec v) {
    if(v != null) {
      return add(v.x,v.y,v.z);
    } return null;
  }
  
  
  /**
   * sub main method
   * @param s_x
   * @param s_y
   * @param s_z
   * @return
   */
  public vec3 sub(float s_x,float s_y,float s_z) {
    x -= s_x;
    y -= s_y;
    z -= s_z;
    set(x,y,z);
    return this;
  }

  public vec3 sub(float s) {
    return sub(s,s,s);
  }

  public vec3 sub(vec v) {
    if(v != null) {
      return sub(v.x,v.y,v.z);
    } return null;
  }

  public vec3 sub(ivec v) {
    if(v != null) {
      return sub(v.x,v.y,v.z);
    } return null;
  }
  
  
  /**
   * average
   * @return float average of the sum component
   */
  public float average() {
    return (this.x + this.y +this.z) *.333f;
  }
  
  
  /**
   * 
   * @param x
   * @param y
   * @param z
   * @return the doc product between the vec and the target
   */
  public float dot(float x, float y, float z) {
    return this.x*x + this.y*y + this.z*z;
  }
  
  public float dot(vec3 v) {
    if(v != null) {
      return x*v.x + y*v.y + z*v.z;
    } else {
      System.out.println("Your Vec arg is "+null) ;
      return 0 ;
    }
    
  }
  
  
  /**
   * 
   * @param pow
   * @return each component of the vec is power push
   */
  public vec3 pow(int pow) {
    this.pow(pow,pow,pow);
    return this;
  }
  public vec3 pow(int pow_x, int pow_y, int pow_z) {
    x = (float)Math.pow(x,pow_x);
    y = (float)Math.pow(y,pow_y);
    z = (float)Math.pow(z,pow_z);
    set(x,y,z);
    return this;
  }
  
  
  /**
   * 
   * @param v
   * @param target
   * @return
   */
  @SuppressWarnings("unused")
	public vec3 cross(vec3 v, vec3 target) {
    if(v != null && target != null) {
      float crossX = y*v.z - v.y*z;
      float crossY = z*v.x - v.z*x;
      float crossZ = x*v.y - v.x*y;
      if (target == null) {
        target = new vec3(crossX, crossY, crossZ);
      } else {
        target.set(crossX, crossY, crossZ);
      }
      return target;
    } else return null ;
  }
  
  public vec3 cross(vec3 v) {
    if(v != null) {
      return cross(v, null);
    } else return null ;
    
  }
  
  public vec3 cross(float x, float y, float z) {
    vec3 v = new vec3(x,y,z) ;
    return cross(v, null);
  }
  
  /**
   * 
   * @param target
   * @return
   */
  public float dist(vec target) {
    if(target != null) {
      float dx = x -target.x;
      float dy = y -target.y;
      return (float) Math.sqrt(dx*dx + dy*dy);
    } else {
    	System.out.println("Your Vec arg is "+null);
      return 0 ;
    }
  }
  
  /**
   * 
   * @param origin
   * @return
   */
  public vec3 dir(vec3 origin) {
    if(origin != null) {
      float dist = dist(origin) ;
      sub(origin) ;
      div(dist) ;
    }
    set(x,y,z) ;
    return this ;
  }
  
  public vec3 dir() {
    return dir(new vec3(0)) ;
  }
  
  public vec3 dir(float a_x, float a_y, float a_z) {
    return dir(new vec3(a_x,a_y,a_z)) ;
  }
  
  
  /**
   * 
   * @param vector_to_make_plane_ref
   * @return
   */
  public vec3 tan(vec3 vector_to_make_plane_ref) {
    if(vector_to_make_plane_ref != null) {
      vec3 tangent = cross(vector_to_make_plane_ref) ;
      return tangent ;
    } else return null ;
  }
  
  public vec3 tan(float float_to_make_plane_ref_x, float float_to_make_plane_ref_y, float float_to_make_plane_ref_z) {
    return tan(new vec3(float_to_make_plane_ref_x, float_to_make_plane_ref_y, float_to_make_plane_ref_z)) ;
  }
  
  
  /**
   * max
   * @return
   */
  public float max_vec() {
    float [] list = { x, y, z } ;
    return max(list) ;
  }
  
  /**
   * min
   * @return
   */
  public float min_vec() {
    float [] list = { x, y, z } ;
    return min(list) ;
  }
  
  /**
   * 
   * @return
   */
  public float magSq() {
    return (x*x + y*y + z*z) ;
  }




  /**
   * 
   * @param v_target
   * @return
   */
  float mag(vec3 v_target) {
    if(v_target != null) {
      float new_x = (v_target.x -x) *(v_target.x -x);
      float new_y = (v_target.y -y) *(v_target.y -y);
      float new_z = (v_target.z -z) *(v_target.z -z);
      return (float)Math.sqrt(new_x +new_y +new_z);
    } else {
      System.out.println("Your Vec arg is "+null) ;
      return 0 ;
    }
  }
  
  public float mag() {
    return (float) Math.sqrt(x*x + y*y + z*z) ;
  }
  
  
  /**
   * 
   * @param target
   * @return
   */
  public vec3 normalize(vec3 target) {
    if (target == null) {
      target = new vec3();
    }
    float m = mag();
    if (m > 0) {
      target.set(x/m, y/m, z/m);
    } else {
      target.set(x, y, z);
    }
    return target;
  }

  public vec3 normalize() {
    float m = mag();
    if (m != 0 && m != 1) {
      div(m);
    }
    return this ;
  }
  
  
  public vec3 map(float minIn, float maxIn, float minOut, float maxOut) {
    x = map(x,minIn,maxIn,minOut,maxOut);
    y = map(y,minIn,maxIn,minOut,maxOut);
    z = map(z,minIn,maxIn,minOut,maxOut);
    set(x,y,z) ;
    return this ;
  }
  
  public vec3 map(vec3 minIn, vec3 maxIn, vec3 minOut, vec3 maxOut) {
    x = map(x,minIn.x,maxIn.x,minOut.x,maxOut.x);
    y = map(y,minIn.y,maxIn.y,minOut.y,maxOut.y);   
    z = map(z,minIn.z,maxIn.z,minOut.z,maxOut.z);   
    set(x,y,z) ;
    return this ;
  }
  
  /**
   * limit
   * @param max
   * @return
   */
  public vec3 limit(float max) {
    if (magSq() > max*max) {
      normalize();
      mult(max);
    }
    return this;
  }
  
  /**
   * jitter
   * @param range_x
   * @param range_y
   * @param range_z
   * @return
   */
  public vec3 jitter(int range_x,int range_y, int range_z) {
    x += random_next_gaussian(range_x,3);
    y += random_next_gaussian(range_y,3);
    z += random_next_gaussian(range_z,3);
    set(x,y,z);
    return this;
  }
  
  public vec3 jitter(int range) {
    return jitter(range,range,range) ;
  }
  
  public vec3 jitter(vec3 range) {
    if(range != null) {
      return jitter((int)range.x,(int)range.y,(int)range.z) ;
    } else return jitter(0, 0, 0) ;
    
  }
  
  
  /**
   * equals
   * @param target
   * @return true if the target is equals to vec, you can pass one argument to compare with all vec components 
   */
  public boolean equals(vec3 target) {
    if(target != null) {
      if((x == target.x) && (y == target.y) && (z == target.z)) {
        return true ; 
      } else return false ;
    } else return false ;
  }
  
  public boolean equals(float target) {
    if((x == target) && (y == target) && (z == target)) 
    return true ; 
    else return false ;
  }
  
  public boolean equals(float t_x,float t_y,float t_z) {
    if((x == t_x) && (y == t_y) && (z == t_z)) 
    return true ; 
    else return false ;
  }
  
  
  /**
   * 
   * @return
   * 
   */
  public vec3 copy() {
  	return new vec3(x,y,z);
  }
  
  
  @Override 
  public String toString() {
    return "[ " + x + ", " + y + ", " + z + " ]";
  }

}
