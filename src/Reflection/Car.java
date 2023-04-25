package Reflection;

public class Car {

   public int id;
   public String modelname;


    public Car(int id, String modelname) {
        this.id = id;
        this.modelname = modelname;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getModelname() {
        return modelname;
    }

   public void horn()
   {
    System.out.println("PiPi");
   }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((modelname == null) ? 0 : modelname.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (id != other.id)
            return false;
        if (modelname == null) {
            if (other.modelname != null)
                return false;
        } else if (!modelname.equals(other.modelname))
            return false;
        return true;
    }
    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    
    
}
