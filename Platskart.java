public class Platskart extends Vagon{
    private int maxSeats = 10;
    private int price = 10000;
    boolean[] seats = new boolean[maxSeats];

    @Override
    public  int getMaxSeats(){return maxSeats;}
    @Override
    public String getType(){
        return "Platskart";
    }
    @Override
    public int emptySeats(){
        int i = 0;
        for(boolean el : seats){
            if(!el){
                i++;
            }
        }
        return i;
    }

    @Override
    public void showEmptySeats(){
        for(int i = 0; i<seats.length;i++){
            System.out.print(i+1+" : " +(seats[i]?"Sold || ":"Empty || "));
            if((i+1)%2==0){
                System.out.println();
            }
        }
        System.out.println();
    }

    @Override
    public boolean[] seats() {
        return seats;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
