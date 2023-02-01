package me.vinuvicho.computers;

public class DesktopComputer extends Computer {
    private ComputerProperty graphicCard;
    private ComputerProperty motherboard;

    public DesktopComputer(String name, String info, Double computerPrice, Integer stock) {
        super(name, info, computerPrice, stock);
    }

    @Override
    public void displayInfo() {
        System.out.println(displayName());
        super.displayInfo();
        graphicCard.displayInfo();
        motherboard.displayInfo();
        System.out.println();
    }

    @Override
    public String displayName() {
        return getComputerId() + ". Desktop computer " + getName();
    }


    public ComputerProperty getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(ComputerProperty graphicCard) {
        this.graphicCard = graphicCard;
    }

    public ComputerProperty getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(ComputerProperty motherboard) {
        this.motherboard = motherboard;
    }
}
