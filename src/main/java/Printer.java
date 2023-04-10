public class Printer {

    private int paperRemaining;
    private int tonerVolume;

    public Printer(int paperRemaining, int tonerVolume){
        this.paperRemaining = paperRemaining;
        this.tonerVolume = tonerVolume;
    }

    public void print(int pages, int copies){
        int total = pages * copies;
        if(total <= this.paperRemaining && total <= this.tonerVolume ){
            setPaperRemaining(this.paperRemaining - total);
            setTonerVolume(this.tonerVolume - total);
        }
    }

    public int getPaperRemaining() {
        return this.paperRemaining;
    }
    public void setPaperRemaining(int paperRemaining) {
        this.paperRemaining = paperRemaining;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }
}
