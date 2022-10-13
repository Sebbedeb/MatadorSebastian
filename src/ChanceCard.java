public class ChanceCard {
    private String tekst;
    private int udgift;
    private int indtægt;
    ChanceCard(String tekst,int udgift, int indtægt){
        this.tekst = tekst;
        this.udgift = udgift;
        this. indtægt = indtægt;
    }

    public String getTekst() {
        return tekst;
    }

    public int getUdgift() {
        return udgift;
    }

    public int getIndtægt() {
        return indtægt;
    }
}
