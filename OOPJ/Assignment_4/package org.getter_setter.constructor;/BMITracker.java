package org.getter_setter.constructor;

public class BMITracker {
   private float weight;
   private float height;
   
   public BMITracker() {
	   this(0.0f,0.0f);
   }
   
   public BMITracker(float weight,float height) {
	   this.weight=weight;
	   this.height=height;
   }
   
   public void setWeight(float weight) {
	   this.weight=weight;
   }
   
   public float getWeight() {
	   return weight;
   }
   
   public void setHeight(float height) {
	   this.height=height;
   }
   
   public float getHeight() {
	   return height;
   }
   
   public String toString() {
	   return "[ Weight: "+weight+ ", Height: "+height+ "]";
   }
}
