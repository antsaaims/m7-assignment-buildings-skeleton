package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    // TODO - Put your code here.
private String mOwner;
private Boolean mPool;

public House(int length,int width,int lotLength,int lotWidth)//constructor
        {
            super(length, width, lotLength, lotWidth);
            this.mOwner="n/a";
            this.mPool=false;

        }
public House(int length,int width,int lotLength,int lotWidth,String owner)//constructor
        {
            this(length, width, lotLength, lotWidth);
            this.mOwner=owner;

        }

public House(intlength,intwidth,intlotLength,intlotWidth,Stringowner,boolean
            pool)//constructor
+getOwner():String
+hasPool():boolean
+setOwner(String):void
+setPool(boolean):void



}
