package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage 
       extends House {
       
    // TODO - Put your code here.
private boolean mSecondFloor;

public Cottage(int dimension, int lotLength, int lotWIdth)
    {
    super(dimension,dimension,lotLength,lotWIdth);
    this.mSecondFloor=false;
    //this.setPool()=true;
    }


public Cottage(int dimension, int lotLength, int lotWIdth, String owner, boolean secondFloor)

    {
        super(dimension,dimension,lotLength,lotWIdth,owner);

        this.mSecondFloor=secondFloor;
       // this.setPool()=true;
    }


public boolean hasSecondFloor()
    {
        return this.mSecondFloor;
    }


public String toString()
    {
    String l="Owner: ";
    if (this.getOwner()==null)
        {
            l+="n/a";
        }
        else{l+= (String) this.getOwner();}
    if (this.calcLotArea()-2*this.calcBuildingArea()>0)
        {
            l+="; has a big open space";
        }
    if( this.mSecondFloor==true)
        {
        l+="; is a two story cottage";
        }


    else
    {
        l+="; is a cottage";
    }

    return l;
    }


}

