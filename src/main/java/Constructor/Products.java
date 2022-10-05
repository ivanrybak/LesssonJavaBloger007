package Constructor;

public class Products {
    private String bread;
    private int coast;
    private   String vegetables;
    private int quantity;

    public Products (String bread,String vegetables,int quantity){  //создаем (метод) конструктор продукты,в который
        this.bread=bread;                                        //принимает заданные пользователем значения полей указанных в нем
        this.vegetables=vegetables;                        //(название хлеба, название овощей, количество)
        this.quantity=quantity;
    }
    public Products(String bread, int coast){   //данный конструктор будет принимать значения полей (название хлеба, стоимость)
        this.bread=bread;
        this.coast=coast;
    }

    public int getCoast() {
        return coast;
    }  //зададим геттер для вывода стоимости
}

