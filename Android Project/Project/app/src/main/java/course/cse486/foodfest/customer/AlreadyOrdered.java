package course.cse486.foodfest.customer;

public class AlreadyOrdered {

   private String isOrdered;

    public AlreadyOrdered(String isOrdered) {
        this.isOrdered = isOrdered;
    }

    public AlreadyOrdered()
    {

    }

    public String getIsOrdered() {
        return isOrdered;
    }

    public void setIsOrdered(String isOrdered) {
        this.isOrdered = isOrdered;
    }
}
