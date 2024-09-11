package org.getter_setter.constructor;

public class DiscountCalculator {
   private float originalPrice;
   private float discountPercentage;
   
   public DiscountCalculator() {
	   this(0.0f,0.0f);
   }
   
   public DiscountCalculator(float originalPrice,float discountPercentage) {
	   this.originalPrice=originalPrice;
	   this.discountPercentage=discountPercentage;
   }
   
   public void setOriginalPrice(float originalPrice) {
	   this.originalPrice=originalPrice;
   }
   
   public float getOriginalPrice() {
	   return originalPrice;
   }
   
   public void setDiscountPercentage(float discountPercentage) {
	   this.discountPercentage=discountPercentage;
   }
   
   public float getDiscountPercentage() {
	   return discountPercentage;
   }
   
   public String toString() {
	   return "[ original price: "+originalPrice+ ", Discount Percentage: "+discountPercentage+ "]";
   }
}
