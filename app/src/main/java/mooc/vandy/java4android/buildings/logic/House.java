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
            this.mOwner=null;
            this.mPool=false;

        }
public House(int length,int width,int lotLength,int lotWidth, String owner)//constructor
        {
            this(length, width, lotLength, lotWidth);
            this.mOwner=owner;

        }

public House(int length,int width,int lotLength,int lotWidth,String owner,boolean
            pool)//constructor
    {
        this(length, width, lotLength, lotWidth, owner);
        this.mPool=false;

    }
public String getOwner(){
     return this.mOwner;


    }
public boolean hasPool(){
     return this.mPool;
   }


public void setOwner(String owner) {
    this.mOwner= owner;

    }
public void setPool(boolean pool){

    this.mPool= pool;

     }
 public String  toString(){
     String l="Owner: ";
     if (this.mOwner==null)
         {
             l+="n/a";
         }
     else{l+= (String) this.mOwner;}
     if (this.mPool==true){
         l+="; has a pool";

          }
     if (this.calcLotArea()-2*this.calcBuildingArea()>0)
           {
           l+="; has a big open space";
           }
    return l;
       }


 public boolean  equals(Object other){
     if (other instanceof House){
        if (this.mPool==((House) other).mPool & this.calcBuildingArea()==((House) other).calcBuildingArea())
        {
            return true;

        }

     }

     return false;
    }



}
