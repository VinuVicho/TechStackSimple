package me.vinuvicho.computers;

public class ComputerProperty {
    private String propertyType;
    private String propertyDetails;
    private Double propertyPrice;


    public ComputerProperty(String propertyType, String propertyDetails, Double propertyPrice) {
        this.propertyType = propertyType;
        this.propertyDetails = propertyDetails;
        this.propertyPrice = propertyPrice;
    }

    public void displayInfo() {
        System.out.println(propertyType + ": " + propertyDetails +
                (propertyPrice == 0 ? "" : ". Price: $" + propertyPrice));
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyDetails() {
        return propertyDetails;
    }

    public void setPropertyDetails(String propertyDetails) {
        this.propertyDetails = propertyDetails;
    }

    public Double getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(Double propertyPrice) {
        this.propertyPrice = propertyPrice;
    }
}
