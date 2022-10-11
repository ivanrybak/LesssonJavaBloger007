package OOP;

public class Wolf {
    int height;
    int weight;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
                this.height = height;
                if(height>100){
                    System.out.println("Impossible height wolf");
                    return;
                }
    }



    public void say(){
    System.out.println("I'am wolf");
}
}
