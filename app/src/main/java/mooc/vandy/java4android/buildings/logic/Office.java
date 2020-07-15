package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       
    // TODO - Put your code here.
private String mBusinessName;
private int mParkingSpaces;
private static int sTotalOffices;

public Office(int length, int width, int lotLength, int lotWidth) // constructo
     {
         super(length, width, lotLength, lotWidth);
         this.mBusinessName=null;
         this.mParkingSpaces=0;
         this.sTotalOffices+=1;
     }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName ) // constructor
    {
        this(length, width, lotLength, lotWidth);
        this.mBusinessName=businessName;

    }

public Office(int length, int width, int lotLength, int lotWidth, String businessName,int parkingSpaces) // constructor
     {
         this(length, width, lotLength, lotWidth);
         this.mBusinessName=businessName;
         this.mParkingSpaces=parkingSpaces;

     }

public String  getBusinessName()
     {
         return this.mBusinessName;

     }

public int  getParkingSpaces()
    {
        return this.mParkingSpaces;
    }


public void  setBusinessName(String name)
    {
        this.mBusinessName=name;
    }


public void  setParkingSpaces(int parking)
     {

         this.mParkingSpaces=parking;
     }

public String toString()

    {
        String l="Business: ";
        if(this.mBusinessName==null)
          {
          l+="unoccupied";
          }
        else
            {l+=mBusinessName;}
        if (this.mParkingSpaces!=0)
             {
                 l+="; has "+  Integer.toString(this.mParkingSpaces)   + " parking space";

             }
        l+=" (total offices: "+Integer.toString(this.sTotalOffices) +")";
        return l;
    }





public boolean  equals(Object other)
     {
       if (other instanceof Office){
          if (this.calcBuildingArea() ==((Office) other).calcBuildingArea()&& this.mParkingSpaces==((Office) other).mParkingSpaces)
          {

              return true;
          }

       }
      return false;
     }






}
