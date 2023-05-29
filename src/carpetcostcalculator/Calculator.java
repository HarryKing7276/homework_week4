package carpetcostcalculator;


public class Calculator {

    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalcost(){
        return floor.getArea() * carpet.getCost();
    }
}
