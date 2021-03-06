/**
* Vec6 class
* v 1.2.0
* 2015-2019
* Processing 3.5.3
* Vector class with a float precision
* @author @stanlepunk
* @see http://stanlepunk.xyz/
* @see https://github.com/StanLepunK/Rope
*/
package rope.vector;
public class vec6 extends vec {
  public vec6() {
  	super(6);
  	set(0,0,0,0,0,0); 
  }

  public vec6(float v) {
  	super(6);
  	set(v,v,v,v,v,v); 
  }

  public vec6(float a, float b, float c, float d, float e, float f) {
    super(6) ;
    set(a,b,c,d,e,f);
  }

  public vec6(vec v) {
    super(6);
    set(v);
  }

  public vec6(ivec v) {
    super(6);
    set(v.x,v.y,v.z,v.w,v.e,v.f);
  }

  public vec6(float [] source) {
    super(6) ;
    set(source);
  }

  public vec6(int [] source) {
    super(6) ;
    set(source);
  }
  
  
  /**
   * set
   * @param a
   * @param b
   * @param c
   * @param d
   * @param e
   * @param f
   * @return
   */
  public vec6 set(float a, float b, float c, float d, float e, float f) {
  	this.x = a;
  	this.y = b;
  	this.z = c;
  	this.w = d;
  	this.e = e;
  	this.f = f;
  	return this;
  }
  
  
  public vec6 set(float v) {
    set(v,v,v,v,v,v);
    return this;
  }

  
  public vec6 set(vec v) {
    if ( v == null) {    
      this.x = this.y = this.z = this.w = this.e = this.f = 0;
    } else if(v instanceof vec5 || v instanceof vec6) {
      set(v.x,v.y,v.z,v.w,v.e,v.f);
    } else {
      set(v.x,v.y,v.z,v.w,0,0);
    }
    return this;
  }

  public vec6 set(ivec v) {
    if ( v == null) {    
      this.x = this.y = this.z = this.w = this.e = this.f = 0;
    } else if(v instanceof ivec5 || v instanceof ivec6) {
      set(v.x,v.y,v.z,v.w,v.e,v.f);
    } else {
      set(v.x,v.y,v.z,v.w,0,0);
    }
    return this;
  }
  
  public vec6 set(float[] source) {
    if(source.length == 1) {
      set(source[0],this.y,this.z,this.w,this.e,this.f);
    } else if(source.length == 2) {
      set(source[0],source[1],this.z,this.w,this.e,this.f);
    } else if(source.length == 3) {
      set(source[0],source[1],source[2],this.w,this.e,this.f);
    } else if(source.length == 4) {
      set(source[0],source[1],source[2],source[3],this.e,this.f);
    } else if(source.length == 5) {
      set(source[0],source[1],source[2],source[3],source[4],this.f);
    } else if(source.length == 6) {
      set(source[0],source[1],source[2],source[3],source[4],source[5]);
    } else if(source.length > 6) {
      set(source[0],source[1],source[2],source[3],source[4],source[5]);
    }
    return this;
  }

  public vec6 set(int[] source) {
    if(source.length == 1) {
      set(source[0],this.y,this.z,this.w,this.e,this.f);
    } else if(source.length == 2) {
      set(source[0],source[1],this.z,this.w,this.e,this.f);
    } else if(source.length == 3) {
      set(source[0],source[1],source[2],this.w,this.e,this.f);
    } else if(source.length == 4) {
      set(source[0],source[1],source[2],source[3],this.e,this.f);
    } else if(source.length == 5) {
      set(source[0],source[1],source[2],source[3],source[4],this.f);
    } else if(source.length == 6) {
      set(source[0],source[1],source[2],source[3],source[4],source[5]);
    } else if(source.length > 6) {
      set(source[0],source[1],source[2],source[3],source[4],source[5]);
    }
    return this;
  }
  
  
  
  public vec6 a(float a) {
    return set(a,this.y,this.z,this.w,this.e,this.f);
  }

  public vec6 b(float b) {
    return set(this.x,b,this.z,this.w,this.e,this.f);
  }

  public vec6 c(float c) {
    return set(this.x,this.y,c,this.w,this.e,this.f);
  }

  public vec6 d(float d) {
    return set(this.x,this.y,this.z,d,this.e,this.f);
  }

  public vec6 e(float e) {
    return set(this.x,this.y,this.z,this.w,e,this.f);
  }

  public vec6 f(float f) {
    return set(this.x,this.y,this.z,this.w,this.e,f);
  }
  
  
  /**
   * copy
   * @return
   */
  public vec6 copy() {
    return new vec6(x,y,z,w,e,f) ;
  }
  
  @Override 
  public String toString() {
    return "[ " + x + ", " + y + ", " + z + ", " + w + ", " + e + ", " + f + " ]" ;
  }
  
  
}
