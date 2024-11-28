package ud3.ejerciciosclases.EP0711_MarcaPagina;

public class BookMark {

    private int nPage;


    public BookMark(int nPage){
        this.nPage = nPage;
    }

    public boolean changePage(int newPage){
        if (newPage < 1){
            return false;
        }

        nPage = newPage;
        return true;
    }

    public int getPageNumber(){
        return nPage;
    }

    public void resetBookMark(){
        nPage = 0;
    }

    

}
