package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    // TODO - Put your code here.
private int mLength;
private int mWidth;
private int mLotLength;
private int mLotWidth;

public Building(int length,int width,int lotLength,int lotWidth)//The constructor
         {
       this.mLength=length;
       this.mWidth=width;
       this.mLotLength=lotLength;
       this.mLotWidth=lotWidth;

         }
public int  getLength(){
      return this.mLength;
     }

public int getWidth(){
    return this.mWidth;
    }
public int  getLotLength(){
    return this.mLotLength;
    }
public int intgetLotWidth(){

    return this.mLotWidth;
    }
public void setLength(int length){
    this.mLength=length;

    }
public void setWidth(int width){
    this.mWidth=width;

    }
public void setLotLength(int lotLength){
    this.mLotLength=lotLength;

    }
public void setLotWidth(int lotWidth){

    this.mLotWidth=lotWidth;
    }
public int calcBuildingArea(){
    return this.mWidth*this.mLength;

    }
public int calcLotArea(){
    return this.mLotWidth*this.mLotLength;


   }
public String toString(){
   return "This is a Building object";
   }

}
