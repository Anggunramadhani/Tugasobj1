package books;

public class HistoryBook extends Book{
    private String category;

    //2 nama method yg sama, bertujuan untuk menerapkan fungsi overloading. (Modul 3)
    public HistoryBook(){

    }


    //============================== SETTER =============================
    //setter yang override dari class Book.
    @Override
    public void setCategory(String category){
        this.category = category;
    }

    //============================== GETTER =============================
    //Getter yang override dari class Book.
    @Override
    public String getCategory(){
        return category;
    }
    @Override
    public String toString(){
        return category;
    }
}
