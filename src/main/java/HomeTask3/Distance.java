package HomeTask3;

public class Distance {
    private double fullDistance;
    private double partDistance;

    public void setDistance(int a,int b) {
        if (a<0||a<b){
            System.out.println("Incorrect value");
            System.exit(1);
        }else
        fullDistance=a;
        partDistance=b;
        System.out.println("Общее расстояние: " + fullDistance+"\nПройденное расстояние: "+ partDistance);


    }

    public double getDistance() {
            double x = fullDistance - partDistance;
            double z = 100 - (partDistance * 100 / fullDistance);

            System.out.println("Оставшееся расстояние " + x + "km " + String.format("%.2f", z) + "%");


            return x;

    }

}


